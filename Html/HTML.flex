import java_cup.runtime.Symbol;

%%

%cup
%class HtmlLexer
%line
%column
// Declara um novo estado de análise para lidar com strings entre aspas
%state DENTRO_ASPAS 

%{
    // A classe `sym` gerada pelo CUP é pública e deve ser visível
    // se os arquivos estiverem no mesmo diretório.
%}

%%

// --- Regras para o estado inicial (fora das aspas) ---
<YYINITIAL> {
    // Espaços em branco (primeira regra a ser ignorada)
    [ \t\r\n]+         { /* Ignora */ }

    // Tokens de Estrutura e Literais
    "<"                { return new Symbol(sym.ABRE_TAG); }
    ">"                { return new Symbol(sym.FECHA_TAG); }
    "/>"               { return new Symbol(sym.FECHA_TAG_VAZIA); }
    "="                { return new Symbol(sym.IGUAL); }
    "\""               { return new Symbol(sym.ASPAS); }
    "/"                { return new Symbol(sym.BARRA); }

    // Tags e atributos literais
    "a"                { return new Symbol(sym.TAG_A); }
    "img"              { return new Symbol(sym.TAG_IMG); }
    "href"             { return new Symbol(sym.ATTR_HREF); }
    "src"              { return new Symbol(sym.ATTR_SRC); } // <--- CORRIGIDO AQUI!

    // Conteúdo de texto (tudo que não for um delimitador de tag ou aspas)
    [^\<\>\"]+         { return new Symbol(sym.TEXTO, yytext()); }

    // Caractere inválido
    .                  { System.err.println("Caractere inválido: " + yytext()); }
}

// --- Regras para o estado DENTRO_ASPAS ---
<DENTRO_ASPAS> {
    // Aspas de fechamento: volta para o estado inicial
    "\""               { yybegin(YYINITIAL); return new Symbol(sym.ASPAS); }

    // Conteúdo do atributo (qualquer caractere que não seja uma aspa)
    [^\"]+             { return new Symbol(sym.TEXTO, yytext()); }
}

// Regra de EOF (End of File) para o estado DENTRO_ASPAS
<DENTRO_ASPAS> <<EOF>> { throw new Error("Erro: Aspas de atributo não fechadas."); }