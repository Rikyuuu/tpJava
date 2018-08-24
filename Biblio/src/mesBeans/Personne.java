package mesBeans;

import java.io.Serializable;

public class Personne implements Serializable {
	private String nom;
	private String prenom;
	
	public Personne() {
		nom="";
		prenom="";
	}
	public Personne (String nom, String prenom) {
		this();
		this.nom=nom;
		this.prenom=prenom;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override 
	public String toString() {
		return "Personne [Nom=" + getNom() + ", Prenom="
				+getPrenom() + "]";
	}
}
