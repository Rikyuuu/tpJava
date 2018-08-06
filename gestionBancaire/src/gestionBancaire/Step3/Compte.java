package gestionBancaire.Step3;

import java.util.Enumeration;
import java.util.Vector;

public class Compte {
	private Vector<Integer> vDepots;
	private Vector<Integer> vRetraits;
	private int decouvert;

	Compte() {
		vDepots =  new Vector<Integer>();
		vRetraits = new Vector<Integer>();
	}
	Compte(int decouvert) {
		vDepots =  new Vector<Integer>();
		vRetraits = new Vector<Integer>();
		this.decouvert = decouvert;
	}
	
	public int getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(int montant) {
		this.decouvert = montant;
	}
	
	public int getSommeDepots() {
		int sommeDepots = 0;
		Enumeration<Integer> enume = vDepots.elements();
		while (enume.hasMoreElements()){
			sommeDepots += enume.nextElement();
		}
		return sommeDepots;
	}

	public int getSommeRetraits() {
		int sommeRetraits = 0;
		Enumeration<Integer> enume = vRetraits.elements();
		while (enume.hasMoreElements()){
			sommeRetraits += enume.nextElement();
		}
		return sommeRetraits;
	}
	
	public int getSolde() {
		return (getSommeDepots() - getSommeRetraits());
	}
	
	public void depotDe(int montant) {
		vDepots.add(montant);
		//sommeDepots = montant + getSommeDepots();
		System.out.println("Dépot de " + montant + " euros.");
		
	}
	
	public boolean retraitDe(int montant) {
		boolean verifDecouvert = this.verifDecouvert(montant);
		if (!verifDecouvert) {
			vRetraits.add(montant);
		}
		return verifDecouvert;
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
