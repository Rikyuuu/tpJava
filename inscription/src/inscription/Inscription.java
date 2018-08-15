package inscription;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class Inscription extends Frame implements ActionListener {
	private Label nom ;
	private Label prenom;
	private Label age;
	private TextField txtNom;
	private TextField txtPrenom;
	private TextField txtAge;	
	private Button btnSubmit;
	
	public Inscription() {
		nom = new Label("Nom");
		prenom = new Label("Prénom");
		age = new Label("Age");
		txtNom = new TextField(30);
		txtPrenom = new TextField(30);
		txtAge = new TextField(30);	
		btnSubmit = new Button("M'inscrire");
		setLayout(new FlowLayout());
		setSize(1024,200);
		
		add(nom);
		add(txtNom);
		add(prenom);
		add(txtPrenom);
		add(age);
		add(txtAge);
		add(btnSubmit);
		
		btnSubmit.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("INSERT INTO personne VALUES(\"" + txtNom.getText() + "\", \"" + txtPrenom.getText() + "\", " + txtAge.getText() + ")");
		
		//new SecondFrame().setVisible(true);
        //Inscription.this.dispose();
	}
}
