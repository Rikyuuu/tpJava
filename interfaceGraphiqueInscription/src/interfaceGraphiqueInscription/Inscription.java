package interfaceGraphiqueInscription;

import java.awt.*;

public class Inscription extends Frame {
	public void inscription() {
		Label lastname = new Label("Nom");
		//Label firstname = new Label("Prénom");
		//Label year = new Label("Age");
		TextField txtNom = new TextField(30);
		//TextField txtPrenom = new TextField(30);
		//TextField txtAge = new TextField(30);
		Button btnSubmit = new Button("M'inscrire");
		setLayout(new FlowLayout());
		setSize(1080,720);
		add(lastname);
		add(txtNom);
		//add(firstname);
		//add(txtPrenom);
		//add(year);
		//add(txtAge);
		add(btnSubmit);
	}
}
