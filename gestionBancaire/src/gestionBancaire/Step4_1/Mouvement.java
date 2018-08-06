package gestionBancaire.Step4_1;

import java.util.Date;

public class Mouvement {

	public enum TypeMvt {
		RETRAIT, DEPOT;
	}
	
	private int montant;
	private Date date;
	private TypeMvt type;
	
	Mouvement(int montant, Date date, TypeMvt type){
		this.montant = montant;
		this.date = date;
		this.type = type;
	}

	public int getMontant() {
		return montant;
	}

	public Date getDate() {
		return date;
	}

	public TypeMvt getType() {
		return type;
	}
	
	@SuppressWarnings("deprecation") //Pour les méthodes getYear(), getMonth(), et getDate() de la classe Date
	public String toString(){
		if (this.type == TypeMvt.DEPOT){
			return ("Vous avez déposé " + this.montant + "€‚ le " + this.date.getDate() + "/" + this.date.getMonth() + "/" + (1900 + this.date.getYear()));
		} else {
			return ("Vous avez retiré " + this.montant + "€, le " + this.date.getDate() + "/" + this.date.getMonth() + "/" + (1900 + this.date.getYear()));
		}
	}
	
}
