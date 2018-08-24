

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
		
		// R�cup�ration des param�tres de la requ�te
		Enumeration e = request.getParameterNames();
		
		// Pour chaque param�tre r�cup�ration de la valeur saisie
		
		while(e.hasMoreElements()) {
			String parametre = (String) e.nextElement();
			chaine += request.getParameter(parametre) + "<br>";
		}
		
		// R�cup�ration du flux pour r�ponse HTML
		ServletOutputStream out = response.getOutputStream();
		
		// Constitution de la r�ponse
		out.println("<html><head><title>Servlet du formulaire</title></head><body><p>Vous avez reserv� : </p><p style=\"color: #34495e; \">" + chaine + "</p></body></html>");
	
		// Fermeture du flux
		out.close();
		
		
		/* Version pr�c�dente
		// R�cup�ration d'un param�tre de la requ�te
		String titreSaisi = request.getParameter("titreLivre");
		
		// R�cup�ration du flux pour r�ponse HTML
		ServletOutputStream out = response.getOutputStream();
		
		// Constitution de la r�ponse
		out.println("<html><head><title>Servlet du formulaire</title></head><body><p>Titre du livre </p><p style=\"color: #34495e; \">" + titreSaisi + "</p></body></html>");
	
		// Fermeture du flux
		out.close();
		 */
	}

}
