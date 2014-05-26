package gui;

import javax.swing.JTextPane;

public class LevelAbi {

String[] abilaused = {"Kuule häkker, selles tasemes pole vaja midagi välja uurida!",
		"Peaksid kirjutama midagi sellist: lausu(\"Muri\")",
		"Kirjuta laused eraldi ridadele, peaksid nägema, et ühel juhul tuleb ekraanile 10+10, teisel juhul 20.",
		"Kui lausud mõne tehte, näiteks korrutamise või lahutamise, arvutab arvuti sinu eest tulemuse välja.",
		"Järjenditega õpid hiljem erinevaid lahedaid asju tegema.",
		"Kui oled hädas, siis kolm tõest lauset on lausu(2>1), lausu(3<4) ja lausu(4==4). Kirjuta need eraldi ridadele ja nende alla veel 3 väärat lauset.",
		"Tee näiteks muutuja x=\"Kassipoeg\" ja lausu x!",
		"Muutuja loomine käib samamoodi nagu eelmisel tasemel.",
		"Et lausuda üht muutujat 17 korda järjest, peaks kirjutama lausu(muutujanimi*17)!",
		"Jätkamiseks lausu sõne \"funktsioon\"",
		"Et korvis leiduvate seente arvu loendada, kasuta funktsiooni loenda(Korv)",
		"Draakonite nimed on Metslane ja Nipitiri, ründamisel kirjuta need sõnena!",
		"Siin köögis on kaks hulka, Riiul ja Kapp. Otsida saab nii: x=otsi(Riiul, \"muna\") \n lausu(x) ning saad teada, kas riiulis leidub muna",
		"Elevandihulga nimi on Parv. Loendamiseks saad kasutada funktsiooni loenda(), Lontu otsimiseks aga funktsiooni otsi(). PS: Lontu peab esinema sõnena!",
		"Sul läheb vaja funktsiooni otsi().",
		"Tiigrikeel on kõige magusam.",
		"Ekraanile peaks ilmuma vaid üks lause.",
		"Siin võib abiks tulla 7. taseme meenutamine.",
		"Proovi ise erinevaid kombinatsioone.",
		"Hulga nimi on Mets ja kõigi kollide nimi on Mäger",
		"Vaata ka https://programmeerimine.cs.ut.ee ja https://courses.cs.ut.ee/2014/AKT/"
		};

public void uuri(JTextPane output, int lvl){
	output.setText(abilaused[lvl]);
}

}
