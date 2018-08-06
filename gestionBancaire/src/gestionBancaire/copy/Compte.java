package gestionBancaire.copy;

public class Compte {
	
	private int sommeDepots;
	private int sommeRetraits;
	private int decouvert;

	// Constructor
	Compte() {
		sommeDepots = 0;
		sommeRetraits = 0;
	}
	
	Compte(int decouvert) {
		this();
		decouvert = 0;
	}
	
	public int getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(int montant) {
		this.decouvert = montant;
	}
	
	public int getSommeDepots() {
		return sommeDepots;
	}

	public int getSommeRetraits() {
		return sommeRetraits;
	}
	
	public int getSolde() {
		return getSommeDepots() - getSommeRetraits();
	}
	
	public void depotDe(int montant) {
		sommeDepots = montant + getSommeDepots();
		System.out.println("Dépot de " + montant + " euros.");
		
	}
	
	public boolean retraitDe(int montant) {
		if(verifDecouvert(montant)) {
			sommeRetraits = montant - getSommeRetraits();
			//System.out.println("Retrait de " + montant + " euros.");
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verifDecouvert(int montant) {
		// decouvert = getSolde() - getSommeRetraits();
		if (montant <= getSolde()) {
			return true;
		} else {
			return false;
		}
	}
}
