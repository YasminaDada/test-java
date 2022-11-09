package Exercice2;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;

public class Texte extends Frame {
	//Declaration des variables
		MenuBar bar;
		Menu menu1;
		MenuItem FE;
		MenuItem FEf;
		Menu menu2;
		MenuItem A;
		MenuItem A1;
		TextArea text;
	public Texte() {
	 //Definition of elements
		bar = new MenuBar();
		menu1 = new Menu("Fichier");
		menu2 = new Menu("?");
		FE = new MenuItem("Enregistrer");
		FEf = new MenuItem("Effacer");
		A = new MenuItem("A Propos de Moi");
		A1 = new MenuItem("Aide..");
		text = new TextArea();
	//Set Bounds of TextArea
		text.setBounds(50, 50, 300, 300);
	//Add components 
		menu1.add(FE);
		menu1.add(FEf);
		menu2.add(A);
		menu2.add(A1);
		bar.add(menu1);
		bar.add(menu2);
		setMenuBar(bar);
		add(text);
	//Add size,visibility and layout
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Texte();

	}

}
