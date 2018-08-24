

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestCookie
 */
public class TestCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		service(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		service(request, response);
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		ServletOutputStream out = response.getOutputStream();
		
		Cookie cookie;
		
		Cookie[] cookies = request.getCookies(); // Récupération des cookies
		// Vérification de l'existence de cookies
		if((cookies != null) && (cookies.length > 0)) {
			int nbFois;
			for(int i = 0; i < cookies.length; ++i) {
				cookie = cookies[i];
				if(cookie.getName().equalsIgnoreCase("NbFois")) {
					nbFois = Integer.parseInt(cookie.getValue()) + 1;
					cookie.setValue(String.valueOf(nbFois));
					response.addCookie(cookie);
					out.println("Visite N° : " + nbFois);
					break;
					
				}
				// fin du if
			}
			// fin du for
		}
		// fin du if
		else {
			cookie = new Cookie("NbFois", "1");
			response.addCookie(cookie);
			out.println("Première visite...");
		}
		
		out.close();
		*/
	}
	 
	
	

}
