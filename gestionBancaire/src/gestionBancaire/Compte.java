package gestionBancaire;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

import gestionBancaire.Step4_1.Mouvement.TypeMvt;

public class Compte {
	
	private Vector<Mouvement> historique;
	private int decouvert;
	

	// Constructor
	Compte() {
		this.historique = new Vector<Mouvement>();
		this.decouvert = 0;
	}
	
	Compte(int decouvert) {
		this.historique = new Vector<Mouvement>();
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
		// Le Enumeration remplace for (int i = 0; i < historique.size(), i++) { instructions... }
		Enumeration<Mouvement> enumerationMouvement = historique.elements();
		while (enumerationMouvement.hasMoreElements()) {
			Mouvement mouvement = enumerationMouvement.nextElement();
			sommeDepots += mouvement.getPlus();
		}
		return sommeDepots;
	}

	public int getSommeRetraits() {
		int sommeRetraits = 0;
		// Le Enumeration remplace for (int i = 0; i < historique.size(), i++) { instructions... }
		Enumeration<Mouvement> enumerationMouvement = historique.elements();
		while (enumerationMouvement.hasMoreElements()) {
			Mouvement mouvement = enumerationMouvement.nextElement();
			sommeRetraits += mouvement.getMoins();
		}
		return sommeRetraits;
	}
	
	public int getSolde() {
		return getSommeDepots() - getSommeRetraits();
	}
	
	public void depotDe(int montant) {
		historique.add(new Depot(montant, new Date(System.currentTimeMillis())));
		System.out.println("Dépot de " + montant + "€ effectué.");
		System.out.println("Votre solde est désormais de " + this.getSolde() + "€.");
		
	}
	
	public void retraitDe(int montant) {
		if (this.verifDecouvert(montant)){
			historique.add(new Retrait(montant, new Date(System.currentTimeMillis())));
			System.out.println("Retrait de " + montant + "€ effectué."); 
			System.out.println("Votre solde est désormais de " + this.getSolde() + "€.");
		} else {
			System.out.println("Vous ne pouvez pas retirer " + montant + "€.");
		}
	}

	public boolean verifDecouvert(int montant) {
		// decouvert = getSolde() - getSommeRetraits();
		if (montant > (this.getSolde() + this.getDecouvert())) {
			return false;
		} else {
			return true;
		}
	}
	
	public void afficherHistorique() {
		System.out.println("Voici l'historique : ");
		System.out.println(this.historique);
	}
}
