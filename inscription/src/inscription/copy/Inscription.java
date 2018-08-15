package inscription.copy;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Inscription extends Frame {
	public Inscription() {
		Label namelbl = new Label("Entrez votre nom");
		TextField txtNom = new TextField(30);
		Button btnSubmit = new Button("M'inscrire");
		setLayout(new FlowLayout());
		setSize(1080,720);
		add(namelbl);
		add(txtNom);
		add(btnSubmit);
	}
}
