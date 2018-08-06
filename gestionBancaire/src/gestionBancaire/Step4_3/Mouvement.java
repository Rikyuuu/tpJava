package gestionBancaire.Step4_3;

import java.util.Date;

public class Mouvement {

	private int montant;
	private Date date;
	
	Mouvement(int montant, Date date){
		this.montant = montant;
		this.date = date;
	}

	public int getMontant() {
		return montant;
	}

	public Date getDate() {
		return date;
	}
	
	@SuppressWarnings("deprecation")
	public String toString(){
		return "\n de " + this.montant + "€ effectué le " + this.date.getDate() + "/" + this.date.getMonth() + "/" + (1900 + this.date.getYear()) + "\n";
	}
	
}
