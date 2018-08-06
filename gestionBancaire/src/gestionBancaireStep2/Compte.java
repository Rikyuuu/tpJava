package gestionBancaireStep2;

public class Compte {
	private int solde;

	// Constructeur
	Compte() {
		solde = 0;
	}
	
	public void depotDe(int montant) {
		//re�oit en param le montant a ajouter au solde.
		
		this.solde = montant + this.solde;
		System.out.println("D�pot de " + montant + " euros.");
		
	}
	
	public void retraitDe(int montant) {
		//re�oit en param le montant a retir� du solde.
		this.solde = this.solde - montant;
		System.out.println("Retrait de " + montant + " euros.");
	}
	
	public int getSolde() {
		// Somme des montants d�pos�s moins la somme des montants retir�s.
		return this.solde;
	}

}
