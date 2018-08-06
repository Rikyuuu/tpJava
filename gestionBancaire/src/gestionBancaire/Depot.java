package gestionBancaire;

import java.util.Date;

public class Depot extends Mouvement {
	
	Depot(int montant, Date date) {
		super(montant, date);
	}
	
	public String toString() {
		return "\n Dépot" + super.toString();
	}
	
	public int getPlus() {
		return this.getMontant();
	}
}
