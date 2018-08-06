package gestionBancaire.Step4_4;

import java.util.Date;

public class Mouvement {

	private int montant;
	private Date date;
	
	Mouvement(int montant, Date date) {
		this.montant = montant;
		this.date = date;
	}

	public int getPlus() {
		return 0;
	}
	
	public int getMoins() {
		return 0;
	}
	
	public int getMontant() {
		return montant;
	}

	public Date getDate() {
		return date;
	}
	
	@SuppressWarnings("deprecation")
	public String toString() {
		return " de " + this.montant + "€ effectué le " + this.date.getDate() + "/" + this.date.getMonth() + "/" + (1900 + this.date.getYear());
	}
	
}
