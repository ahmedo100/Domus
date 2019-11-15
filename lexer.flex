import java_cup.runtime.Symbol;
%%
%unicode
%column
%line
%cup
baliseDebProg = "<PROGRAMME_DOMUS>"
baliseFinProg = "</PROGRAMME_DOMUS>"
baliseDebDeclApp = "<DECLARATION_APPAREILS>"
baliseFinDeclApp = "</DECLARATION_APPAREILS>"
baliseDebDeclInterf ="<DECLARATION_INTERFACES>"
baliseFinDeclInterf = "</DECLARATION_INTERFACES>"
baliseDebDeclScenarii = "<DECLARATION_SCENARII>"
baliseFinDeclScenarii ="</DECLARATION_SCENARII>"
ident = [_a-zA-Z]+[0-9a-zA-Z_]
baliseDeclScenario = "<SCENARIO "{ident}">"
baliseFinScenario = "</SCENARIO "{ident}">" 
baliseDebDeclCommande = "<DECLARATION_COMMANDES>"
baliseFinDeclCommande = "</DECLARATION_COMMANDES>"
commentaire = "//"[^\n\"]
virg = ","
point = "."
dp = ":" 
pvirg =";"
eg ="="
eclairage ="eclairage"
volet ="volet"
chauffage  = "chauffage"
alarme ="alarme"
fenetre ="fenetre"
interrupteur ="interrupteur"
mobile ="mobile"
telecommande ="telecommande"
pourtout = "pourtout"
faire ="faire"
fait ="fait"
si="si"
alors="alors"
sinon ="sinon"
fsi ="fsi"
associer ="associer"
programmer ="programmer"
entier = [0-9]+
underscore = "_"
message="message"
autre_appareil = "autre_appareil"
parOuv = "("
parFerm = ")"
definir = "definir"
eg="="
accOuv="{"
accFerm = "}"
chaine =\" [^\n\"\] \"
etat ="etat"
doubleeg = "=="
ouvrir ="ouvrir"
eteindre ="eteindre"
allumer ="allumer"
fermer ="fermer"



%%