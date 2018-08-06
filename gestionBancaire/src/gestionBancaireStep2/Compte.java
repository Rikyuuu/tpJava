package gestionBancaireStep2;

public class Compte {
	private int solde;

	// Constructeur
	Compte() {
		solde = 0;
	}
	
	public void depotDe(int montant) {
		//reçoit en param le montant a ajouter au solde.
		
		this.solde = montant + this.solde;
		System.out.println("Dépot de " + montant + " euros.");
		
	}
	
	public void retraitDe(int montant) {
		//reçoit en param le montant a retiré du solde.
		this.solde = this.solde - montant;
		System.out.println("Retrait de " + montant + " euros.");
	}
	
	public int getSolde() {
		// Somme des montants déposés moins la somme des montants retirés.
		return this.solde;
	}

}
