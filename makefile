JCC = javac

JCR = java
LEX = jflex
CUP = cup 


default :    Parser.class    sym.class   Yylex.class

Yylex.java  :	lexer.flex 
	$(LEX)  lexer.flex
    
parser.java :   parser.cup  
	$(CUP)  parser.cup 
    
Parser.class:parser.java sym.java Yylex.java
	$(JCC)  parser.java sym.java Yylex.java
