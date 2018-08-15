package banque;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int choix = 0;
        int sommeRetrait = 0;
        int sommeVersement = 0;
        
        Scanner sc = new Scanner(System.in);
        String afficher;
        while(choix < 4) {
        	System.out.println("  ======================================================");
            System.out.println("|| 1. Afficher Solde !                                ||");
            System.out.println("|| 2. Retirer de l'argent !                           ||");
            System.out.println("|| 3. Verser de l'argent !                            ||");
            System.out.println("|| Entrez un autre nombre pour quitter le programme ! ||");
            System.out.println("|| Faites votre choix (entrez 1, 2, 3 ou autre !)     ||");
            System.out.println("  ======================================================");
            
            choix = sc.nextInt();
	        switch (choix) {
	        case 1:
	        	afficher = "Afficher Solde " + sommeVersement + "€.";
	        	System.out.println(afficher);
	        	break;
	        	
	        case 2:
	        	afficher = "Combien souhaitez-vous retirer ?";
	        	System.out.println(afficher);
	        	int retrait = sc.nextInt();
	        	if(retrait>sommeVersement) {
	        		System.out.println("Désolé vous ne pouvez pas retirez plus que ce que vous ne possédez !");
	        	}
	        	else {
		        	sommeVersement = sommeVersement - retrait;
		        	System.out.println(retrait);
		        	System.out.print("Votre solde est maintenant de " + sommeVersement + "€.");
	        	}
	        	break;
	        
	        case 3:
	        	afficher = "Combien souhaitez vous verser ?";
	        	System.out.println(afficher);
	        	int verser = sc.nextInt();
	        	sommeVersement = sommeVersement + verser;
	        	System.out.println("Vôtre solde est maintenant de " + sommeVersement + "€.");
	        	break;
	        
	        default:
	        	afficher = "Programme quitté.";
	        	System.out.println(afficher);
	        	System.exit(1);
	     		break;
	        }
        }

	}

}
