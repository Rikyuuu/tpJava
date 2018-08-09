package intefaceGraphique2;

import java.awt.*;

public class Test {
	
	public static void main(String[] args)
	{
		Frame f = new Frame("Voici ma fenêtre JAVA INCROYABLE");
		Button b = new Button("Bouton");
		
		// On place le bouton dans la frame
		f.add(b);
		
		// On réduit la frame à sa plus petite visibilité
		f.pack();
		
		//Et on l'affiche
		f.setVisible(true);
	}
}
