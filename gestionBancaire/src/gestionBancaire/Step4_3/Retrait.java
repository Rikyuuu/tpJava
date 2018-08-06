package gestionBancaire.Step4_3;

import java.util.Date;

public class Retrait extends Mouvement {
	
	Retrait(int montant, Date date) {
		super(montant, date);
	}
	
	public String toString() {
		return "Retrait " + super.toString();
	}
}
