

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import mesBeans.Client;
import mesBeans.Livre;

/**
 * Servlet implementation class CtlLivre
 */
public class CtlLivre extends HttpServlet {
	
	ConnexionDB dao;
	
	public void init() {
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
		
		dao = new ConnexionDB(jdbcURL, jdbcUsername, jdbcPassword);
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//aFaire(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			aFaire(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void aFaire(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		
		//Récupération des paramètres du livre
		String titre = request.getParameter("titre");
		String categorie = request.getParameter("categorie");
		
		if (titre != null && categorie != null) {
		//Récupérer la session
		 HttpSession maSession = request.getSession(false);
		 //Récupération du client enregistré dans la session
		 //Provient de 	" maSession.setAttribute("client", user); " de CtlLogin ligne 52
		 Client user = (Client) maSession.getAttribute("user");
		 //Ajouter le livre du client actuel (le user du dessus)
		 Livre livre = new Livre(titre, categorie);
		 dao.ajouterLivre(user.getUser(), livre);
		 List<Livre> liste = dao.listLivres(user.getUser());
		 request.setAttribute("listlivres", liste);
		 //user.ajoutLivre(titre, categorie);
		 System.out.println(liste);
		}

	}

}
