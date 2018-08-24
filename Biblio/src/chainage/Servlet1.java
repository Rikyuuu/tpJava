package chainage;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet implements javax.servlet.Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
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
		// Initialisation des variables pour le chainage
		ServletContext sc = getServletContext();
		RequestDispatcher rd = null;
		
		// R�cup du flux pour la r�ponse
		ServletOutputStream sortie = response.getOutputStream();
		sortie.println("<html>");
		sortie.println("<head>");
		sortie.println("<title>Chainage</title>");
		sortie.println("</head>");
		sortie.println("<body>");
		sortie.println("<body><h1>D�but fait par le premier servlet</h1><br>");
		
		// R�cup du param�tre de la demande du client
		String test = request.getParameter("test");
		if(test == null) {
			test = "y";
		}
		if(test.equals("S")) {
			rd = sc.getRequestDispatcher("/Servlet2A");
			rd.include(request, response);
			// r�cup
			String valeur = (String) request.getAttribute("info");
			sortie.println("fin du premier servlet<br>valeur : " + valeur + "</body></html>");
		}
		else {
			request.setAttribute("info", "1");
			rd = sc.getRequestDispatcher("/Servlet2B");
			rd.forward(request, response);
		}
		
	}

}
