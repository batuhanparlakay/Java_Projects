import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class �nfo {

public Connection c;
public Statement s;



public �nfo() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		c = DriverManager.getConnection("jdbc:mysql:///project3","root","");
		s=c.createStatement();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
	
	
	
}
