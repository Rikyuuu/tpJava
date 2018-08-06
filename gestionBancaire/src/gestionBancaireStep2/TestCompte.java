package gestionBancaireStep2;

public class TestCompte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte compte = new Compte();
		
		System.out.println("Votre solde est de " + compte.getSolde() + ".");
		// On dépose
		compte.depotDe(150);
		// On affiche
		System.out.println("Solde " + compte.getSolde());
		// On retire
		compte.retraitDe(100);
		// On affiche
		System.out.println("Solde " + compte.getSolde());
		// On dépose
		compte.depotDe(200);
		// On affiche
		System.out.println("Solde " + compte.getSolde());
		// On retire
		compte.retraitDe(223);
		// On affiche
		System.out.println("Solde " + compte.getSolde());
	}

}
