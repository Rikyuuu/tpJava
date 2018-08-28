package banqueV3;

import java.util.Scanner;
import java.util.Vector;

public class Banque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int choix = 0;
        int sommeRetrait = 0;
        int sommeVersement = 0;
        
        Scanner sc = new Scanner(System.in);
        Vector<Integer> sommeVer = new Vector<Integer>();
        Vector<Integer> sommeRet = new Vector<Integer>();
        
        String afficher;
        while(choix < 5) {
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
	        	afficher = "Afficher Solde " + (sommeVersement - sommeRetrait) + "€.";
	        	System.out.println(afficher);
	        	break;
	        	
	        case 2:
	        	afficher = "Combien souhaitez-vous retirer ?";
	        	System.out.println(afficher);
	        	int retrait = sc.nextInt();
	        	/*
	        	if(retrait>sommeVersement) {
	        		System.out.println("Désolé vous ne pouvez pas retirez plus que ce que vous ne possédez !");
	        	}
	        	else {
	        	*/
	        	
	        	sommeRetrait += retrait;
	        	sommeRet.add(retrait);
	        	System.out.println("Vous avez retiré " + sommeRet.lastElement() + "€.");
	        	//}
	        	break;
	        
	        case 3:
	        	afficher = "Combien souhaitez vous verser ?";
	        	System.out.println(afficher);
	        	int verser = sc.nextInt();
	        	sommeVersement += verser;
	        	sommeVer.add(verser);
	        	System.out.println("Vous avez versé " + sommeVer.lastElement() + "€.");
	        	break;
	        case 4:
	        	afficher = "Voici l'historique des versements :";
	        	System.out.println(afficher);
	        	
	        	for(int i =0; i<sommeVer.size(); i++) {
	        		System.out.println(sommeVer.get(i));
	        	}
	        	afficher = "Voici l'historique des retraits :";
	        	System.out.println(afficher);
	        	
	        	for(int i =0; i<sommeRet.size(); i++) {
	        		System.out.println(sommeRet.get(i));
	        	}
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
