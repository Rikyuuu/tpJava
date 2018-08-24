package mesBeans;

import java.io.Serializable;

public class Livre implements Serializable {
	private String titre;
	private String categorie;
	public Livre() {
		titre="Non renseigné";
		categorie="Inconnue";
	}
	public Livre (String titre, String categorie) {
		this.titre=titre;
		this.categorie=categorie;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	@Override 
	public String toString() {
		return "Livre [Titre=" + getTitre() + ", Categorie="
				+getCategorie() + "]";
	}

}
