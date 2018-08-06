package gestionBancaire.Step4_4;

import java.util.Date;

public class Retrait extends Mouvement {
	
	Retrait(int montant, Date date) {
		super(montant, date);
	}
	
	public String toString() {
		return "\n Retrait" + super.toString() + "\n";
	}
	
	public int getMoins(){
		return this.getMontant();
	}
}
