

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mesBeans.Client;

/**
 * Servlet implementation class CtlLogin
 */
public class CtlLogin extends HttpServlet {

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
		//Creation de la session
		HttpSession maSession = request.getSession(true);
		
		//Récupération des paramètres du client
		String nom = request.getParameter("nom");
		String mdp = request.getParameter("mdp");
		//Création de l'instance ou objet client à envoyer a la session
		Client user = new Client(nom, mdp);
		//Ajouter l'objet client à la session
		maSession.setAttribute("user", user);
	}
}
