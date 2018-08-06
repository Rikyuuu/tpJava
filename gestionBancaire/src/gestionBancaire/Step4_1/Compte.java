package gestionBancaire.Step4_1;

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
		Enumeration<Mouvement> enumMouvement = historique.elements();
		while (enumMouvement.hasMoreElements()){
			Mouvement mouvement = enumMouvement.nextElement();
			if (mouvement.getType() == TypeMvt.DEPOT){
				sommeDepots += mouvement.getMontant();
			}
		}
		return sommeDepots;
	}

	public int getSommeRetraits() {
		int sommeRetraits = 0;
		// Le Enumeration remplace for (int i = 0; i < historique.size(), i++) { instructions... }
		Enumeration<Mouvement> enumMouvement = historique.elements();
		while (enumMouvement.hasMoreElements()){
			Mouvement mouvement = enumMouvement.nextElement();
			if (mouvement.getType() == TypeMvt.RETRAIT){
				sommeRetraits += mouvement.getMontant();
			}
		}
		return sommeRetraits;
	}
	
	public int getSolde() {
		return getSommeDepots() - getSommeRetraits();
	}
	
	public void depotDe(int montant) {
		historique.add(new Mouvement(montant, new Date(System.currentTimeMillis()), TypeMvt.DEPOT));
		System.out.println("Dépot de " + montant + "€ effectué.");
		System.out.println("Votre solde est désormais de " + this.getSolde() + "€.");
		
	}
	
	public void retraitDe(int montant) {
		if (this.verifDecouvert(montant)){
			historique.add(new Mouvement(montant, new Date(System.currentTimeMillis()), TypeMvt.RETRAIT));
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
}
