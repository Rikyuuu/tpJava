

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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
		
		String chaine = "";
		
		// Récupération des paramètres de la requête
		Enumeration e = request.getParameterNames();
		
		// Pour chaque paramètre récupération de la valeur saisie
		
		while(e.hasMoreElements()) {
			String parametre = (String) e.nextElement();
			chaine += request.getParameter(parametre) + "<br>";
		}
		
		// Récupération du flux pour réponse HTML
		ServletOutputStream out = response.getOutputStream();
		
		// Constitution de la réponse
		out.println("<html><head><title>Servlet du formulaire</title></head><body><p>Vous avez reservé : </p><p style=\"color: #34495e; \">" + chaine + "</p></body></html>");
	
		// Fermeture du flux
		out.close();
		
		
		/* Version précédente
		// Récupération d'un paramètre de la requête
		String titreSaisi = request.getParameter("titreLivre");
		
		// Récupération du flux pour réponse HTML
		ServletOutputStream out = response.getOutputStream();
		
		// Constitution de la réponse
		out.println("<html><head><title>Servlet du formulaire</title></head><body><p>Titre du livre </p><p style=\"color: #34495e; \">" + titreSaisi + "</p></body></html>");
	
		// Fermeture du flux
		out.close();
		 */
	}

}
