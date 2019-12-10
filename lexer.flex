import java_cup.runtime.Symbol;

%%
%{
	public int getYyLine(){
		return yyline+1;
	}
	public int getYyColumn(){
		return yycolumn+1;
	}
	public String getYyText(){
		return yytext();
	}
%}

%unicode
%cup
%line
%column
ident = [a-zA-Z][a-zA-Z_0-9]*
baliseDebProg = "<PROGRAMME_DOMUS>"
baliseFinProg = "</PROGRAMME_DOMUS>"
baliseDebDeclApp = "<DECLARATION_APPAREILS>"
baliseFinDeclApp = "</DECLARATION_APPAREILS>"
baliseDebDeclInterf ="<DECLARATION_INTERFACES>"
baliseFinDeclInterf = "</DECLARATION_INTERFACES>"
baliseDebDeclScenarii = "<DECLARATION_SCENARII>"
baliseFinDeclScenarii ="</DECLARATION_SCENARII>"
baliseDeclScenario = "<SCENARIO"
baliseFinScenario = "</SCENARIO"
baliseDebDeclCommande = "<DECLARATION_COMMANDES>"
baliseFinDeclCommande = "</DECLARATION_COMMANDES>"
chaine =\" {alphabetComp} \"
alphabetComp =[^\n]+
commentaire = "//" {alphabetComp}
antiS = "/"
plusGr =">"
virg = ","
point = "."
dp = ":" 
pvirg =";"
eg ="="
doubleeg = "=="
parOuv = "("
parFerm = ")"
accOuv="{"
accFerm = "}"
pourtout = "pourtout"
faire ="faire"
fait ="fait"
si="si"
alors="alors"
sinon ="sinon"
fsi ="fsi"
entier = [0-9]+
underscore = "_"
message="message"
autre_appareil = "autre_appareil"
definir = "definir"
mcEtat ="etat"
executerScen = "executer_scenario"
programmer = "programmer"
associer = "associer"
typeApp = "eclairage"  | "chauffage" | "fenetre" | "volet"  | "alarme"
etats = "allume" | "eteint" | "demi" |"eco" | "ouvert" | "ferme"
actions ="allumer" | "ouvrir" | "fermer" | "eteindre" | "allumer_partiel" | "tamiser" | "allumer_eco" | "fermer_partiel" |"ouvrir_partiel" 
typeAutreApp = "tv" | "hifi" | "cafetiere" | "video_proj" | "lave_linge" | "lave_vaisselle" | "seche_linge" | "portail" 
interfaces ="interrupteur" | "mobile" | "telephone" | "telecommande" | "tablette" | "ordinateur"
%%
{baliseDebProg} {  return new Symbol(sym.BALISEDEBPROG);}
{baliseFinProg} { return new Symbol(sym.BALISEFINPROG);}
{baliseDebDeclApp} { return new Symbol(sym.BALISEDEBDECLAPP);}
{baliseFinDeclApp} { return new Symbol(sym.BALISEFINDECLAPP);}
{baliseDebDeclInterf} {return new Symbol(sym.BALISEDEBDECLINTERF);}
{baliseFinDeclInterf} {return new Symbol(sym.BALISEFINDECLINTERF);}
{baliseDebDeclScenarii} {return new Symbol(sym.BALISEDEBDECLSCENARII);}
{baliseFinDeclScenarii} {return new Symbol(sym.BALISEFINDECLSCENARII);}
{baliseDeclScenario} {return new Symbol(sym.BALISEDECLSCENARIO);}
{baliseFinScenario} {return new Symbol(sym.BALISEFINSCENARIO);}
{baliseDebDeclCommande} {return new Symbol(sym.BALISEDEBDECLCOMMANDE);}
{baliseFinDeclCommande} {return new Symbol(sym.BALISEFINDECLCOMMANDE);}
{commentaire} {}
{autre_appareil} { return new Symbol(sym.AUTREAPPAREIL);}
{virg} { return new Symbol(sym.VIRG);}
{point} {  return new Symbol(sym.POINT);}
{dp} {  return new Symbol(sym.DP);}
{pvirg} {return new Symbol(sym.PVIRG);}
{plusGr} {return new Symbol(sym.PLUGR);}
{eg} {return new Symbol(sym.EG);}
{accOuv} {return new Symbol(sym.ACCOUV);}
{accFerm} {return new Symbol(sym.ACCCFERM);}
{parOuv} {  return new Symbol(sym.PAROUV);}
{parFerm} {  return new Symbol(sym.PARFERM);}
{doubleeg} {return new Symbol(sym.DOUBLEEG);}
{pourtout} {return new Symbol(sym.POURTOUT);}
{associer} { return new Symbol(sym.ASSOCIER);}
{faire} { return new Symbol(sym.FAIRE);}
{fait} {  return new Symbol(sym.FAIT);}
{si} {  return new Symbol(sym.SI);}
{alors} {  return new Symbol(sym.ALORS);}
{sinon} {return new Symbol(sym.SINON);}
{fsi} {return new Symbol(sym.FSI);}
{entier} {return new Symbol(sym.ENTIER,new Integer(yytext()));}
{underscore} {return new Symbol(sym.UNDERSCORE);}
{message} {return new Symbol(sym.MESSAGE);}
{definir} { return new Symbol(sym.DEFINIR);}
{mcEtat} {return new Symbol(sym.MCETAT);}
{typeApp} {  return new Symbol(sym.TYPEAPP,yytext());}
{etats} {return new Symbol(sym.ETAT,yytext());}
{actions} {  return new Symbol(sym.ACTION,yytext());}
{typeAutreApp} {return new Symbol(sym.TYPEAUTREAPP,yytext());}
{interfaces} {return new Symbol(sym.INTERFACE,yytext());}
{chaine} {return new Symbol(sym.CHAINE , yytext());}
{executerScen} {return new Symbol(sym.EXECUTERSCENARIO);}
{programmer} {return new Symbol(sym.PROGRAMMER);}
{ident}  {   return new Symbol(sym.IDENT,yytext());}
{antiS} {}
[ \t] {}
[\n]  { }
. {yycolumn++;System.out.println("Erreur lexical= "+ yytext()+" non reconnu ligne:" + (++yyline) +" Col : "+ (++yycolumn)+"\n" );}
