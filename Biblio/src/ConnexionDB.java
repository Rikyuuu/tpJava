import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mesBeans.Livre;
public class ConnexionDB {

	private String jdbcURL;
    private String jdbcUsername;
    private String jdbcPassword;
    private Connection jdbcConnection;
     
    public ConnexionDB(String jdbcURL, String jdbcUsername, String jdbcPassword) {
        this.jdbcURL = jdbcURL;
        this.jdbcUsername = jdbcUsername;
        this.jdbcPassword = jdbcPassword;
    }
     
    protected void ouvrir_connexion() throws SQLException {
        if (jdbcConnection == null || jdbcConnection.isClosed()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
            jdbcConnection = DriverManager.getConnection(
                                        jdbcURL, jdbcUsername, jdbcPassword);
        }
    }
     
    protected void fermer_connexion() throws SQLException {
        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
            jdbcConnection.close();
        }
    }
    
     
    public boolean ajouterLivre(String client, Livre livre) throws SQLException {
        String sql = "INSERT INTO reservation (nom_client, titre, categorie) VALUES (?, ?, ?)";
        ouvrir_connexion();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
        statement.setString(1, client);
        statement.setString(2, livre.getTitre());
        statement.setString(3, livre.getCategorie());
         
        boolean test_ajout = statement.executeUpdate() > 0;
        statement.close();
        fermer_connexion();
        return test_ajout;
    }
     
    public List<Livre> listLivres(String client) throws SQLException {
        List<Livre> list = new ArrayList<Livre>();
         
        String sql = "SELECT * FROM reservation WHERE nom_client= ?";
         
        ouvrir_connexion();
         
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
       statement.setString(1, client);
        ResultSet resultSet = statement.executeQuery();
         
        while (resultSet.next()) {
            String nom = resultSet.getString("nom_client");
            String titre = resultSet.getString("titre");
            String categorie = resultSet.getString("categorie");
             
            Livre livre = new Livre(titre, categorie);
            System.out.println(livre.toString());
            list.add(livre);
           
        }
         
        resultSet.close();
        statement.close();
         
        fermer_connexion();
         
        return list;
    }
}
