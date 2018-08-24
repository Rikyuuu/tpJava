

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mesBeans.Client;
import mesBeans.Livre;

/**
 * Servlet implementation class FormLivre
 */
public class FormLivre extends HttpServlet {

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
		String titre;
		String categorie;
		
		//récupération des valeurs saisies par l'utilisateur
		titre = request.getParameter("titre");
		categorie = request.getParameter("categorie");
		//String nom = request.getParameter("nom");

		// Mise en place d'un flux de sortie
		ServletOutputStream sortie = response.getOutputStream();

		//Récupérer la session
		HttpSession maSession = request.getSession(false);
		
		//maSession = get.Attribute("nom");
		Client user = (Client) maSession.getAttribute("client");
		ArrayList<Livre> list = user.getLivres();
		
		// Génération de la page html contenant le formulaire
		sortie.println("<html><head><title>Livre</title>");
		sortie.println("</head><body><h1>Ouvrage demandé</h1>");
		//Remplacer nom par user.getUser()
		sortie.println("<h2>Bonjour " + user.getUser() + "</h2>");
		sortie.println("<form action='ControllerServlet?page=2' method='post'>");
		sortie.println("<p>Titre</p>");
		sortie.println("<input name='titre' type='text' size='25' />");
		sortie.println("<p>Catégorie</p>");
		sortie.println("<select name='categorie'>" +
				"<option>Thriller</option>" +
				"<option selected>Roman</option>" +
				"<option>Bande dessin &eacute;e</option>" +
				"<option>Histoire</option>" +
				"</select>");
		sortie.println("<input type='submit' name='Valider' />");
		sortie.println("</form> ");
		sortie.println("Vos réservations: ");

		for (Livre livre : list ) {
			sortie.println(livre.toString() + "<br>");
		}
		
		sortie.println("</body></html>");
		
		
		sortie.close();
		
		/*
		// Variables titre et categorie
		String titre;
		String categorie;
		
		//récupération des valeurs saisies par l'utilisateur
		titre = request.getParameter("titre");
		categorie = request.getParameter("categorie");
		
		// Mise en place d'un flux de sortie
		ServletOutputStream sortie = response.getOutputStream();
		
		// Génération de la page html contenant le formulaire
		sortie.println("<html><head><title>Livre</title>");
		sortie.println("</head><body><h1>Ouvrage demandé</h1>");
		sortie.println("<form action='ControllerServlet' method='post'");
		sortie.println("<p>Titre</p>");
		sortie.println("<input name='titreLivre' type='text' size='25' />");
		sortie.println("<p>Catégorie</p>");
		sortie.println("<select name='categorie'>" +
				"<option>Thriller</option>" +
				"<option selected>Roman</option>" +
				"<option>Bande dessin &eacute;e</option>" +
				"<option>Histoire</option>" +
				"</select>");
		sortie.println("<input type='submit' name='Valider' />");
		sortie.println("</form></body></html>");
		
		sortie.close();
		
		*/
		/*
		// Récupération du flux pour réponse HTML
		ServletOutputStream out = response.getOutputStream();
		
		out.println("<html><head><title>Formulaire de saisie</title></head><body><h1>Ouvrage demandé</h1>");
		out.println("<form action=\"FormServlet\" method=\"post\">\r\n" + 
						"<label>Titre</label><br>\r\n" + 
						"<input type=\"text\" name=\"titreLivre\" size=\"20\" placeholder=\"Titre\">\r\n" + 
						"<br>\r\n" + 
						"<label>Catégorie</label><br>\r\n" + 
						"<select name=\"categorie\">" +
							"<option value='Roman' selected>Roman</option>" +
							"<option value='Thriller'>Thriller</option>" +
							"<option value='Manga'>Manga</option>" +
							"<option value='Amour'>Amour</option>" +
							"<option value='Educatif'>Educatif</option>" +
						"</select>" +
						"<input type=\"submit\" value=\"Réserver\">\r\n" + 
					"</form>");
		out.println("</body></html>");
		
		// Fermeture du flux
		out.close();
		
		*/
	}

}
