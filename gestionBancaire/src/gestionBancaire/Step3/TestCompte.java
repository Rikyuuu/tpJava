package gestionBancaire.Step3;

import java.util.Vector;

public class TestCompte {

	public static void affichageTransaction(boolean transactionAutorisee) {
		if (transactionAutorisee) {
			System.out.println("Transaction autorisée");
		} else {
			System.out.println("Transaction refusée");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean operationAutorisee;
		Compte compte = new Compte(0);
		
		System.out.println("Votre solde est de " + compte.getSolde() + ".");
		// On dépose
		compte.depotDe(25);
		operationAutorisee = compte.retraitDe(25);
		affichageTransaction(operationAutorisee);
		// On affiche
		//System.out.println("Solde " + compte.getSolde());
		// On retire
		//compte.retraitDe(100);
		// On affiche
		//System.out.println("Solde " + compte.getSolde());
		// On dépose
		//compte.depotDe(200);
		// On affiche
		//System.out.println("Solde " + compte.getSolde());
		// On retire
		//compte.retraitDe(223);
		// On affiche
		//System.out.println("Solde " + compte.getSolde());
		
	}

}
