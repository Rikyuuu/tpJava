package afficherDouble;
import java.util.Scanner;

public class Double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nb;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez votre nombre !");
		nb = sc.nextInt();
		System.out.println("Voici le double de votre nombre : " + (2*nb) + ".");
	}

}
