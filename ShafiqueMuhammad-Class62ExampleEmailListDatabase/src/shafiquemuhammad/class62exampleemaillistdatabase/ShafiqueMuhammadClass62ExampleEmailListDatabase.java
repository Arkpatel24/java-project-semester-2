package shafiquemuhammad.class62exampleemaillistdatabase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Class 6-2 Example
 * Insert and retrieve data from a database
 * Author: Muhammad Shafique
 * Date: October 7, 2019
 */
public class ShafiqueMuhammadClass62ExampleEmailListDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
            // Declare database URL  
            final String DATABASE_URL = 
                    "jdbc:mysql://localhost:3306/user"; 
            
            // Database insert as an SQL parametric statement
            final String SQL_INSERT = 
             "insert into user (Email, firstName, lastName) "
                    + "values (?, ?, ?);";
            
            // SQL select query
            final String SQL_SELECT = 
             "SELECT Email, firstName, lastName FROM user;";
      
          // Declare Connection, statement, and 
          // PreparedStatement objects
          Connection usersConnect;   // to manage connection object 
          PreparedStatement stmt1;  // to manage SQL insert
          Statement stmt2;  // to manage SQL select
          
          // Create a Scanner object to get data from the keyboard
           Scanner in = new Scanner(System.in);

          // use try-catch block to connect, insert, and 
          // query the database and handle exceptions
          try { 

             // Step1: Establish database connection
              usersConnect = DriverManager.getConnection( DATABASE_URL, "root", "ARKpatel@24");

             // Step 2: Create  PreparedStatement on userConnect object to insert data
              stmt1 = usersConnect.prepareStatement(SQL_INSERT);

              // Get email, first name and last name from the user to insert into the database table
           
            System.out.println("Please type email, first name and  last name of the user:" );
            String em = in.next();
            String fn = in.next();
            String ln = in.next();
        
        // Append user provided data to the insert statement
        stmt1.setString(1, em);
        stmt1.setString(2, fn);
        stmt1.setString(3, ln);
        
        // Execute the insert statement
        
        long input = stmt1.executeUpdate();
              
         // Create and execute select query and 
         // get result as ResultSet object
         stmt2 = usersConnect.createStatement();
         ResultSet queryResult = 
                 stmt2.executeQuery( SQL_SELECT);
            
         // Get ResultSet's meta-data
         ResultSetMetaData metaData = 
                 queryResult.getMetaData();
         int numberOfColumns = metaData.getColumnCount();     
         
         System.out.printf("Users from the users Database:%n%n");

         // display the names of the columns in the ResultSet
         for (int i = 1; i <= numberOfColumns; i++)
            System.out.printf("%-8s\t", metaData.getColumnName(i));
         System.out.println();
         
         // Display query results
         while (queryResult.next()) 
         {
            for (int i = 1; i <= numberOfColumns; i++)
               System.out.printf("%-8s\t", queryResult.getObject(i));
            System.out.println();
         }
         
         // close the database connection
        usersConnect.close();
      } // end of try-block 
      catch (SQLException sqlException)                                
      {                                                                  
         sqlException.printStackTrace();
      }  // end of catch block
      
   }  // end of main ( ) method
    
}
