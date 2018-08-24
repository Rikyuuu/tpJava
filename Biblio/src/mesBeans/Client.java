package mesBeans;

import java.io.Serializable;
import java.util.ArrayList;

public class Client implements Serializable {

	private String user;
	private String mdp;
	private ArrayList<Livre> livres;
	public Client() {
		user="Inconnu";
		mdp="vide";
		livres=new ArrayList<Livre>();
	}
	public Client (String user, String mdp) {
		this();
		this.user=user;
		this.mdp=mdp;
		livres=new ArrayList<Livre>();
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public ArrayList<Livre> getLivres() {
		return livres;
	}
	public void setLivres(ArrayList<Livre> livres) {
		this.livres = livres;
	}
	
	public void ajoutLivre (Livre livre) {
		getLivres().add(livre);
	}
	
	public void ajoutLivre(String titre, String categorie) {
		//Création du livre
		Livre livre = new Livre(titre, categorie);
		//Enregistrement du livre
		getLivres().add(livre);
	}
	@Override 
	public String toString() {
		return "Client [nom=" + getUser() + ", Livres="
				+getLivres() + "]";
	}
}
