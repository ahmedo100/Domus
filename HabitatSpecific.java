// HabitatSpecific.java
import java.util.ArrayList;
public class HabitatSpecific extends Habitat {
public HabitatSpecific(ArrayList<CAppareil> lapp, ArrayList<CEnsAppareil> lens, ArrayList<CScenario> lscen, ArrayList<CInterface> lint, ArrayList<CProgrammation> lprog)
{
	super(lapp,lens,lscen,lint,lprog);
}
public void execScenarioNum(int num){
System.out.println( "Execution du scenario "+this.l_scenarios.get(num).getNomScenario()+"... ");

     switch(num) {
case 5: 
for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals("e2")) appareil.appliquer(TypeActionAppareil.ALLUMER);
break;
case 6: 
for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals("e3")) appareil.appliquer(TypeActionAppareil.ALLUMER);
break;
case 2: 
  this.execScenarioNum(1); for(CAppareil appareil : this.l_appareils) for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals("e")) appareil.appliquer(TypeActionAppareil.ALLUMER);
break;
case 4: 
for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals("e1")) appareil.appliquer(TypeActionAppareil.ALLUMER);  this.execScenarioNum(1); 
break;
case 3: 
System.out.println("Affichage console :Scenario Depart  ");for(CAppareil appareil : this.l_appareils) for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals("v")) appareil.appliquer(TypeActionAppareil.TAMISER);for(CAppareil appareil : this.l_appareils) for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals("e")) appareil.appliquer(TypeActionAppareil.ALLUMER_PARTIEL);for(CAppareil appareil : this.l_appareils) for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals("x")) appareil.appliquer(TypeActionAppareil.ALLUMER_PARTIEL);for(CAppareil appareil : this.l_appareils)  if (appareil.getNomAppareil().equals("fen"))if (appareil.etatAppareil.equals(TypeEtatAppareil.FERME))    {for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals("a1")) appareil.appliquer(TypeActionAppareil.ALLUMER);}else{System.out.println("Affichage console :Attention : la fenêtre ,fen, est ouverte !  ");}
break;
case 1: 
for(CAppareil appareil : this.l_appareils) for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals("v")) appareil.appliquer(TypeActionAppareil.TAMISER);for(CAppareil appareil : this.l_appareils) for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals("e")) appareil.appliquer(TypeActionAppareil.ALLUMER);
break;
case 0: 
for(CAppareil appareil : this.l_appareils) for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals("v")) appareil.appliquer(TypeActionAppareil.ETEINDRE);for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals("a1")) appareil.appliquer(TypeActionAppareil.ALLUMER_PARTIEL);for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals("cafe")) appareil.appliquer(TypeActionAppareil.ALLUMER);for(CAppareil appareil : this.l_appareils)  if (appareil.getNomAppareil().equals("rad1"))if (appareil.etatAppareil.equals(TypeEtatAppareil.ETEINT))    {for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals("rad1")) appareil.appliquer(TypeActionAppareil.ALLUMER);}for(CAppareil appareil : this.l_appareils) if (appareil.getNomAppareil().equals("hf")) appareil.appliquer(TypeActionAppareil.ALLUMER);
break;
default:
 }
  } 
}