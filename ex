<PROGRAMME_DOMUS>

// Commentaire : déclaration des appareils
<DECLARATION_APPAREILS>
    eclairage e1, e2, e3.
    volet v1, v2, v3, v4.
    chauffage rad1.
    alarme a1.
    fenetre fen.
    autre_appareil(cafetiere) cafe.
    autre_appareil(hifi) hf.
    
    // d�claration d'un ensemble d'appareils (type �numer� utilisateur)
    definir mon_eclairage_salon = {e2,e3}.
</DECLARATION_APPAREILS>

// d�claration des interfaces
<DECLARATION_INTERFACES>
    interrupteur b1, b2.
    mobile t1.
    telecommande c1.
</DECLARATION_INTERFACES>

// déclaration des scenarii
<DECLARATION_SCENARII>
	// déclaration du scenario bonjour
	<SCENARIO bonjour>
		pourtout v:volet faire v.ouvrir; fait;
		message(a1," allumée ");
	</SCENARIO bonjour>

	<SCENARIO soiree>
		pourtout v:volet faire v.fermer; fait;
		pourtout e:mon_eclairage_salon faire e.allumer; fait;
	</SCENARIO soiree>

	<SCENARIO soiree_musique>
		executer_scenario soiree; 
		pourtout e:autre_appareil(hifi) faire e.allumer; fait;
	</SCENARIO soiree_musique>

	<SCENARIO depart>
		message("Scenario D�part");
		pourtout v:volet faire pourtout v:volet faire v.fermer; fait; fait;
		si (a1.etat == eteint) alors a1.allumer_partiel; fsi;
		si (a1.etat == demi) alors a1.allumer;
		sinon si (a1.etat == allume) alors a1.eteindre; 
			sinon a2.allumer; fsi;  fsi;
	</SCENARIO depart>

 	<SCENARIO noel1>
        		 e1.allumer;
 	</SCENARIO noel1>
   
 	<SCENARIO noel2>
         		e2.allumer;
 	</SCENARIO noel2>
      
  	<SCENARIO noel3>
         		e3.allumer;
  	</SCENARIO noel3>
</DECLARATION_SCENARII>

// déclaration des commandes
<DECLARATION_COMMANDES>
	associer b1 = bonjour.
	associer b2 = depart.
	associer t1 = depart.
	associer c1 = {noel1,noel2,noel3}.

	// le scenario soirée est lancé tous les soirs du premier jour de chaque mois 2017 à 18h.
	programmer soiree = (2017,_,1,18,0).    
	programmer soiree_musique = {(2017,11,20,19,30),(2017,11,21,19,30)}.
</DECLARATION_COMMANDES>
</PROGRAMME_DOMUS>

