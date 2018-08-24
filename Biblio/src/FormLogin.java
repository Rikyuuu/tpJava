

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormLogin
 */
public class FormLogin extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		aFaire(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		aFaire(request, response);
	}
	
	private void aFaire(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Variables titre et categorie
				String nom;
				String password;
				
				//récupération des valeurs saisies par l'utilisateur
				nom = request.getParameter("nom");
				password = request.getParameter("password");
				
				// Mise en place d'un flux de sortie
				ServletOutputStream sortie = response.getOutputStream();
				
				// Génération de la page html contenant le formulaire
				sortie.println("<html><head><title>Connexion</title>");
				sortie.println("</head><body><h1>Connexion</h1>");
				sortie.println("<form action='ControllerServlet?page=1' method='post'>");
				sortie.println("<p>Nom</p>");
				sortie.println("<input name='nom' type='text' />");
				sortie.println("<p>Mot de passe</p>");
				sortie.println("<input name='mdp' type='password'>");
				sortie.println("<input type='submit' name='Valider' />");
				sortie.println("</form></body></html>");
				
				sortie.close();
	}

}
