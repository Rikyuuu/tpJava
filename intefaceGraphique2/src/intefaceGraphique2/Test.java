package intefaceGraphique2;

import java.awt.*;

public class Test {
	
	public static void main(String[] args)
	{
		Frame f = new Frame("Voici ma fen�tre JAVA INCROYABLE");
		Button b = new Button("Bouton");
		
		// On place le bouton dans la frame
		f.add(b);
		
		// On r�duit la frame � sa plus petite visibilit�
		f.pack();
		
		//Et on l'affiche
		f.setVisible(true);
	}
}
