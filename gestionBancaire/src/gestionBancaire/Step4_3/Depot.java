package gestionBancaire.Step4_3;

import java.util.Date;

public class Depot extends Mouvement {
	
	Depot(int montant, Date date) {
		super(montant, date);
	}
	
	public String toString(){
		return "Dépot " + super.toString();
	}
}
