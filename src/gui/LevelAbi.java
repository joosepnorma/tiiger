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
		"Siin köögis on kaks hulka, riiul ja kapp. Otsida saab nii: x=otsi(riiul, muna) \n lausu(x) ning saad teada, kas riiulis leidub muna"};

public void uuri(JTextPane output, int lvl){
	output.setText(abilaused[lvl]);
}

}
