

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
public class ControllerServlet extends HttpServlet {

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
		ServletContext ctx = getServletContext();
		RequestDispatcher dispatch = null;
		
		String page = request.getParameter("page");
		
		//Aiguillage en fonction de la demande de l'utilisateur
		if(page == null) {
			// -> Formulaire de login
				dispatch = ctx.getRequestDispatcher("/FormLogin");
				dispatch.forward(request, response);
		}
		else {
			if ("1".equals(page)) {
				dispatch = ctx.getRequestDispatcher("/CtlLogin");
				dispatch.include(request, response);
				
				dispatch = ctx.getRequestDispatcher("/FormLivre");
				dispatch.forward(request, response);
			} else {
				if ("2".equals(page)) {
				dispatch = ctx.getRequestDispatcher("/CtlLivre");
				dispatch.include(request, response);
				
				dispatch = ctx.getRequestDispatcher("/FormLivre");
				dispatch.forward(request, response);
				}
			}
		}
	}
}
