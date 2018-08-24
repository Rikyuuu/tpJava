

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mesBeans.Personne;

/**
 * Servlet implementation class CtlPersonne
 */
public class CtlPersonne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CtlPersonne() {
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
	
	private void aFaire (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		//Creation du Bean
		Personne pers = new Personne();
		pers.setNom("Berquier");
		pers.setPrenom("Melinda");
		
		//Stockage en attribut de Request
		request.setAttribute("maPersonne", pers);
		
		//Appel de la JSP
		ServletContext ctx = getServletContext();
		RequestDispatcher dispatch = ctx.getRequestDispatcher("/AccesBean.jsp");
		
		dispatch.forward(request, response);
	}

}
