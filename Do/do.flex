import java_cup.runtime.Symbol;

%%

%cup
%class DoLexer
%line %column

%%

"do"            { return new Symbol(sym.DO); }
"out"           { return new Symbol(sym.OUT); }
"["             { return new Symbol(sym.COLCHETEESQ); }
"]"             { return new Symbol(sym.COLCHETEDIR); }
";"             { return new Symbol(sym.PTVIRG); }
"="             { return new Symbol(sym.IGUAL); }
"<"             { return new Symbol(sym.MENOR); }
"++"            { return new Symbol(sym.MAISMAIS); }
"("             { return new Symbol(sym.PARENTEESQ); }
")"             { return new Symbol(sym.PARENTEDIR); }

[a-zA-Z_][a-zA-Z0-9_]* { return new Symbol(sym.ID, yytext()); }
[0-9]+                { return new Symbol(sym.INTEIRO, Integer.valueOf(yytext())); }
[ \t\r\n]+            { /* Ignora */ }
.                     { System.err.println("Caractere inválido no DO: " + yytext()); }