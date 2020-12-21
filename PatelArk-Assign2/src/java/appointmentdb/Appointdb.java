/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointmentdb;

import model.Appointment;

import java.sql.*;


/**
 *
 * @author ARK PATEL
 */
public class Appointdb 
{
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url;
    private static String username;
    private static String password;
    
    // private member variable to hold the connection
    private static Connection conn = null;

    
    public Appointdb(String url, String username, String pwd) {
        this.url = url;
        this.username = username;
        this.password = pwd;
    }
    
   
  
    /**
     * A method that will connect to the specified JDBC driver
     *
     * @param driver driver to connect to, 
     *              typically com.mysql.jdbc.Driver
     * @param url url pointing to your database server; 
     *              i.e. jdbc:mysql://localhost:3306/
     * @param databaseName the database you want to connect to
     * @param username the db username to connect with
     * @param password password correspond to db username
     */
    public static void createConnection() {
        try {
            Class.forName(driver);
            // get the connection from the DriverManager
            conn = DriverManager.getConnection(Appointdb.url, 
                                Appointdb.username, Appointdb.password);
        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException: " + 
                    e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getSQLState());
            System.err.println("SQLException: " + e.getErrorCode());
            System.err.println("SQLException: " + e.getMessage());
        }
    }

 

    public static int insert(Appointment app) {
        
        Appointdb.createConnection();
        Connection connection = Appointdb.conn;
        PreparedStatement ps = null;

        String query
                = "INSERT INTO appointments (firstName,lastName,age,address,mobile,gender,issue,timing) "
                + "VALUES (?, ?, ?, ?, ?, ? ,? ,?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, app.getFirstName());
            ps.setString(2, app.getLastName());
            ps.setString(3, app.getAge());
            ps.setString(4, app.getAddress());
            ps.setString(5, app.getMobile());
            ps.setString(6, app.getGender());
            ps.setString(7, app.getIssue());
            ps.setString(8, app.getTiming());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } 
    }

   

    public static Appointment selectAppoint(String firstName) {
        Appointdb.createConnection();
        Connection connection = Appointdb.conn;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT * FROM appointments where firstName=?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, firstName);
            rs = ps.executeQuery();
            Appointment app = null;
            if (rs.next()) {
                app = new Appointment();
                app.setFirstName(rs.getString("firstName"));
                app.setLastName(rs.getString("lastName"));
                app.setAge(rs.getString("age"));
                app.setAddress(rs.getString("address"));
                app.setMobile(rs.getString("mobile"));
                app.setGender(rs.getString("gender"));
                app.setIssue(rs.getString("issue"));
                app.setTiming(rs.getString("timing"));
            }
            return app;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } 
    }
}
