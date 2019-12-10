public class CMaisonUser extends CMaison {
 public CMaisonUser() {
 super();
CVoletFenetre e2 = new CVoletFenetre("e2",TypeAppareil.VOLET);
ma_liste_appareils.add(e2);
CVoletFenetre v1 = new CVoletFenetre("v1",TypeAppareil.VOLET);
ma_liste_appareils.add(v1);
CAutreAppareil hf = new CAutreAppareil("hf",TypeAppareil.AUTRE_APPAREIL_CAFE);
ma_liste_appareils.add(hf);
CAutreAppareil cafe = new CAutreAppareil("cafe",TypeAppareil.AUTRE_APPAREIL_HIFI);
ma_liste_appareils.add(cafe);
CVoletFenetre e1 = new CVoletFenetre("e1",TypeAppareil.VOLET);
ma_liste_appareils.add(e1);
CEclairage v2 = new CEclairage("v2",TypeAppareil.ECLAIRAGE);
ma_liste_appareils.add(v2);
CInterface b3 = new CInterface("b3",TypeInterface.INTERRUPTEUR);
ma_liste_interfaces.add(b3);
CInterface b1 = new CInterface("b1",TypeInterface.INTERRUPTEUR);
ma_liste_interfaces.add(b1);
CInterface zap = new CInterface("zap",TypeInterface.INTERRUPTEUR);
ma_liste_interfaces.add(zap);
CInterface b2 = new CInterface("b2",TypeInterface.TELECOMMANDE);
ma_liste_interfaces.add(b2);
CInterface b4 = new CInterface("b4",TypeInterface.TELECOMMANDE);
ma_liste_interfaces.add(b4);
CInterface t1 = new CInterface("t1",TypeInterface.MOBILE);
ma_liste_interfaces.add(t1);
// Ensembles d'appareils
CEnsAppareil mon_eclairage_salon = new CEnsAppareil("mon_eclairage_salon");
mon_eclairage_salon.addAppareil(e2);
mon_eclairage_salon.addAppareil(e1);
ma_liste_ens_appareils.add(mon_eclairage_salon);
