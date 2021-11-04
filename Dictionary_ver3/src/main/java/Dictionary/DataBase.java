package Dictionary;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class DataBase {
	// 
	static String url = "jdbc:mysql://localhost:3306/dictionary";
	static String user = "root";
	static String pass = "";
	static String sql = "select * from `từ điển`";
	
	public static void main(String[] args) {
		Graphics s = new Graphics();
		s.setVisible(true);
	}
	
	public static void insertToDatabase(Word w) {
		Connection c = null;
		Statement stmt = null;
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
	         c = DriverManager.getConnection(url,user,pass);
	         c.setAutoCommit(false);
	         stmt = (Statement) c.createStatement();
	         String sql = "INSERT INTO EnVi (wordTarget,wordExplain) " +
	                        "VALUES ('" + w.word_Target +"','" + w.word_Explain + "');"; 
	         stmt.executeUpdate(sql);
	         stmt.close();
	         c.commit();
	         c.close();
	      	} catch ( Exception e ) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	      }
	      	 System.out.println("Records created successfully");
		}
	
	public static void deleteRowWithKey(String del) {
		System.out.println("Enter the Word Need to be Removed: ");
		Connection c = null;
		Statement stmt = null;
		try {
			 Class.forName("com.mysql.jdbc.Driver");
	         c = DriverManager.getConnection(url,user,pass);
		     c.setAutoCommit(false);
		     stmt = (Statement) c.createStatement();
			 stmt.executeUpdate("DELETE FROM EnVi WHERE wordTarget = '" + del + "' OR wordExplain = '" + del + "';");
			 stmt.close();
		     c.commit();
		     c.close();
		} catch (Exception e) {
			System.err.println("No Word Found, Escaped Method!");
			return;
		}
		System.out.println("Word has been Removed Successful");
	}
	
	public static String EnToViSearch(String pat) {
		// System.out.println("Enter the Pattern Need to Search:");
		String res = "This word does not exist";
		Connection c = null;
		Statement stmt = null;
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
	         c = DriverManager.getConnection(url,user,pass);
		     c.setAutoCommit(false);
		     stmt = (Statement) c.createStatement();
		      ResultSet rs = stmt.executeQuery("SELECT * FROM EnVi WHERE wordTarget LIKE '" + pat + "%';");
		      if(rs.next()){
		    	  return rs.getString(3);
		    	}		      
		   } catch (Exception e) {
		    System.err.println(e.getClass().getName() + ": " + e.getMessage());
		    System.exit(0);
		   }
		 return res;
	}
	
}
