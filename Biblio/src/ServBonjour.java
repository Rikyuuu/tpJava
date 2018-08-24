

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServBonjour
 */
public class ServBonjour extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServBonjour() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private void aFaire(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// M�j du type Mime pour faire la r�ponse
    	response.setContentType("text/html");
    	
    	// R�cup�ration d'un flux de sortie pour r�pondre
    	PrintWriter out = response.getWriter();
    	
    	//Constitution de la r�ponse
    	out.print("<html> <head><title>Mon premier Servlet</title></head>" + "<body>Bienvenue chez Global Knowledge" + "</body></html>");
    
    	// fermeture du flux
    	out.close();
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//aFaire(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		aFaire(request, response);
	}

}
