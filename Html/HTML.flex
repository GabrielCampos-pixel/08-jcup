import java_cup.runtime.Symbol;

%%

%cup
%class HtmlLexer
%line
%column
%state DENTRO_ASPAS 

%{
    // A classe `sym` gerada pelo CUP é pública e deve ser visível
    // se os arquivos estiverem no mesmo diretório.
%}

%%

<YYINITIAL> {
    [ \t\r\n]+         { /* Ignora */ }

    "<"                { return new Symbol(sym.ABRE_TAG); }
    ">"                { return new Symbol(sym.FECHA_TAG); }
    "/>"               { return new Symbol(sym.FECHA_TAG_VAZIA); }
    "="                { return new Symbol(sym.IGUAL); }
    "\""               { return new Symbol(sym.ASPAS); }
    "/"                { return new Symbol(sym.BARRA); }

    "a"                { return new Symbol(sym.TAG_A); }
    "img"              { return new Symbol(sym.TAG_IMG); }
    "href"             { return new Symbol(sym.ATTR_HREF); }
    "src"              { return new Symbol(sym.ATTR_SRC); } // <--- CORRIGIDO AQUI!

    [^\<\>\"]+         { return new Symbol(sym.TEXTO, yytext()); }

    .                  { System.err.println("Caractere inválido: " + yytext()); }
}

// --- Regras para o estado DENTRO_ASPAS ---
<DENTRO_ASPAS> {
    // Aspas de fechamento: volta para o estado inicial
    "\""               { yybegin(YYINITIAL); return new Symbol(sym.ASPAS); }

    [^\"]+             { return new Symbol(sym.TEXTO, yytext()); }
}

// Regra de EOF (End of File) para o estado DENTRO_ASPAS
<DENTRO_ASPAS> <<EOF>> { throw new Error("Erro: Aspas de atributo não fechadas."); }