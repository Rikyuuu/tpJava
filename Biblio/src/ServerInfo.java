

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServerInfo
 */
public class ServerInfo extends HttpServlet implements javax.servlet.Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServerInfo() {
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
	/* Ancienne version avec le lien du mail
	public void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		// Recup contexte d'execution de l'appli
		ServletContext sc = getServletContext();
		String info = sc.getServerInfo();
		String real = sc.getRealPath("");
		String nomctx = sc.getServletContextName();
		String mailWebmaster = sc.getInitParameter("nomDuWebMaster");
		ServletOutputStream out = rep.getOutputStream();
		
		// écriture log
		sc.log("ECRIRE DANS LOG DE " + info);
		
		// création de la page HTML
		out.println("<html>");
		out.println("<head><title>Info Serveur</title></head>");
		out.println("body" + info + "<br>" + nomctx +"<br>" + real + "<p>Vous pouvez contacter le webmaster à cette adresse : <a href=\"mailto:" + mailWebmaster + "\">" + mailWebmaster + "</p></body></html>");
		
		// toujours fermer le flux d'écriture
		out.close();
	}
	*/
	public void aFaire(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = this.getInitParameter("Auteur");
		
		ServletOutputStream out = response.getOutputStream();
		
		out.println("<html><head><title>Manip paramètre</title></head><body>Bonjour " + nom + "</body></html>");
	}
}
