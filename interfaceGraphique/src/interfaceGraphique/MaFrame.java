package interfaceGraphique;

import java.awt.*;

public class MaFrame extends Frame {

	public MaFrame() {
		super();
		setTitle("Titre de la Fenetre");
		setSize(300, 150);
		setLayout(new GridLayout(2,3));
		for(int i=1; i<7; i++) {
			add(new Button(Integer.toString(i)));
		}
		pack();
		show(); // Affiche la fenêtre
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MaFrame();
	}

}
