public class CMaisonUser extends CMaison {
 public CMaisonUser() {
 super();
CAutreAppareil cafe = new CAutreAppareil("cafe",TypeAppareil.AUTRE_APPAREIL_HIFI);
ma_liste_appareils.add(cafe);
CAutreAppareil hf = new CAutreAppareil("hf",TypeAppareil.AUTRE_APPAREIL_CAFE);
ma_liste_appareils.add(hf);
CVoletFenetre e3 = new CVoletFenetre("e3",TypeAppareil.FENETRE);
ma_liste_appareils.add(e3);
CVoletFenetre e1 = new CVoletFenetre("e1",TypeAppareil.FENETRE);
ma_liste_appareils.add(e1);
CVoletFenetre v3 = new CVoletFenetre("v3",TypeAppareil.FENETRE);
ma_liste_appareils.add(v3);
CVoletFenetre v1 = new CVoletFenetre("v1",TypeAppareil.FENETRE);
ma_liste_appareils.add(v1);
CVoletFenetre a1 = new CVoletFenetre("a1",TypeAppareil.FENETRE);
ma_liste_appareils.add(a1);
CAlarme e2 = new CAlarme("e2",TypeAppareil.ALARME);
ma_liste_appareils.add(e2);
CAlarme v2 = new CAlarme("v2",TypeAppareil.ALARME);
ma_liste_appareils.add(v2);
CAlarme fen = new CAlarme("fen",TypeAppareil.ALARME);
ma_liste_appareils.add(fen);
CChauffage v4 = new CChauffage("v4",TypeAppareil.CHAUFFAGE);
ma_liste_appareils.add(v4);
CVoletFenetre rad1 = new CVoletFenetre("rad1",TypeAppareil.VOLET);
ma_liste_appareils.add(rad1);
CInterface b2 = new CInterface("b2",TypeInterface.TELECOMMANDE);
ma_liste_interfaces.add(b2);
CInterface t1 = new CInterface("t1",TypeInterface.TELECOMMANDE);
ma_liste_interfaces.add(t1);
CInterface b1 = new CInterface("b1",TypeInterface.MOBILE);
ma_liste_interfaces.add(b1);
CInterface c1 = new CInterface("c1",TypeInterface.INTERRUPTEUR);
ma_liste_interfaces.add(c1);
// Ensembles d'appareils
CEnsAppareil mon_eclairage_salon = new CEnsAppareil("mon_eclairage_salon");
mon_eclairage_salon.addAppareil(e3);
mon_eclairage_salon.addAppareil(e2);
ma_liste_ens_appareils.add(mon_eclairage_salon);
String noel3_contenu  = "for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals(\"e3\")) appareil.appliquer(TypeActionAppareil.ALLUMER);";
CScenario noel3= new CScenario("noel3",noel3_contenu);
ma_liste_scenarios.add(noel3);
String noel2_contenu  = "for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals(\"e2\")) appareil.appliquer(TypeActionAppareil.ALLUMER);";
CScenario noel2= new CScenario("noel2",noel2_contenu);
ma_liste_scenarios.add(noel2);
String noel1_contenu  = "for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals(\"e1\")) appareil.appliquer(TypeActionAppareil.ALLUMER);  this.execScenarioNum(1); ";
CScenario noel1= new CScenario("noel1",noel1_contenu);
ma_liste_scenarios.add(noel1);
String depart_contenu  = "System.out.println(\"Affichage console :Scenario Depart  \");for(CAppareil appareil : this.l_appareils) for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals(\"v\")) appareil.appliquer(TypeActionAppareil.TAMISER);for(CAppareil appareil : this.l_appareils) for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals(\"e\")) appareil.appliquer(TypeActionAppareil.ALLUMER_PARTIEL);for(CAppareil appareil : this.l_appareils) for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals(\"x\")) appareil.appliquer(TypeActionAppareil.ALLUMER_PARTIEL);for(CAppareil appareil : this.l_appareils)  if (appareil.getNomAppareil().equals(\"fen\"))if (appareil.etatAppareil.equals(TypeEtatAppareil.FERME))    {for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals(\"a1\")) appareil.appliquer(TypeActionAppareil.ALLUMER);}else{System.out.println(\"Affichage console :Attention : la fenêtre ,fen, est ouverte !  \");}";
CScenario depart= new CScenario("depart",depart_contenu);
ma_liste_scenarios.add(depart);
String soiree_musique_contenu  = "  this.execScenarioNum(1); for(CAppareil appareil : this.l_appareils) for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals(\"e\")) appareil.appliquer(TypeActionAppareil.ALLUMER);";
CScenario soiree_musique= new CScenario("soiree_musique",soiree_musique_contenu);
ma_liste_scenarios.add(soiree_musique);
String soiree_contenu  = "for(CAppareil appareil : this.l_appareils) for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals(\"v\")) appareil.appliquer(TypeActionAppareil.TAMISER);for(CAppareil appareil : this.l_appareils) for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals(\"e\")) appareil.appliquer(TypeActionAppareil.ALLUMER);";
CScenario soiree= new CScenario("soiree",soiree_contenu);
ma_liste_scenarios.add(soiree);
String bonjour_contenu  = "for(CAppareil appareil : this.l_appareils) for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals(\"v\")) appareil.appliquer(TypeActionAppareil.ETEINDRE);for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals(\"a1\")) appareil.appliquer(TypeActionAppareil.ALLUMER_PARTIEL);for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals(\"cafe\")) appareil.appliquer(TypeActionAppareil.ALLUMER);for(CAppareil appareil : this.l_appareils)  if (appareil.getNomAppareil().equals(\"rad1\"))if (appareil.etatAppareil.equals(TypeEtatAppareil.ETEINT))    {for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals(\"rad1\")) appareil.appliquer(TypeActionAppareil.ALLUMER);}for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals(\"hf\")) appareil.appliquer(TypeActionAppareil.ALLUMER);";
CScenario bonjour= new CScenario("bonjour",bonjour_contenu);
ma_liste_scenarios.add(bonjour);
    
 b1.addScenarioAssocie("bonjour");
    
 b2.addScenarioAssocie("depart");
    
 t1.addScenarioAssocie("depart");
    
 c1.addScenarioAssocie("noel3");
    
 c1.addScenarioAssocie("noel2");
    
 c1.addScenarioAssocie("noel1");
CProgrammation p2 = new CProgrammation("soiree");
CDate p2d1 = new CDate(2017,-1,1,18,0);
p2.addDate(p2d1);
ma_liste_programmations(p2);
CProgrammation p1 = new CProgrammation("soiree_musique");
CDate p1d1 = new CDate(2017,11,21,19,30);
p1.addDate(p1d1);
CDate p1d1 = new CDate(2017,11,20,19,30);
p1.addDate(p1d1);
ma_liste_programmations(p1);
monHabitat = new HabitatSpecific(ma_liste_appareils,ma_liste_ens_appareils, ma_liste_scenarios,ma_liste_interfaces, ma_liste_programmations);
} 
 }