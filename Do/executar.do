#!/bin/bash

# --- Limpar arquivos gerados anteriormente ---
echo "--- Limpando arquivos gerados (.class, .java, .jar) ---"
rm -f *.class *.java *.jar
rm -f DoLexer.java DoParser.java sym.java

# --- Baixar JFlex e CUP (se necessário) ---
echo ""
echo "--- Baixando JFlex e CUP (se necessário) ---"
wget -nc https://repo1.maven.org/maven2/de/jflex/jflex/1.8.2/jflex-1.8.2.jar -O jflex-1.8.2.jar
wget -nc https://repo1.maven.org/maven2/com/github/vbmacher/java-cup/11b-20160615/java-cup-11b-20160615.jar -O java-cup-11b.jar

# --- Definir o classpath ---
CLASSPATH=".:jflex-1.8.2.jar:java-cup-11b.jar"

# --- Gerar o Analisador Sintático PRIMEIRO ---
echo ""
echo "--- Gerando o Analisador Sintatico a partir de do.cup ---"
# O CUP gera o arquivo sym.java, que o JFlex precisa
java -cp "$CLASSPATH" java_cup.Main -parser DoParser -symbols sym do.cup

# --- Gerar o Analisador Léxico DEPOIS ---
echo ""
echo "--- Gerando o Analisador Lexico a partir de do.flex ---"
# O JFlex precisa da classe sym
java -cp "$CLASSPATH" jflex.Main do.flex

# --- Compilar as classes .java ---
echo ""
echo "--- Compilando os arquivos .java gerados ---"
javac -cp "$CLASSPATH" *.java

# --- Executar a classe principal ---
echo ""
echo "--- Executando o Parser com o arquivo de entrada ---"
java -cp "$CLASSPATH" DoParser entrada.txt

echo ""
echo "--- Execucao concluida! ---"