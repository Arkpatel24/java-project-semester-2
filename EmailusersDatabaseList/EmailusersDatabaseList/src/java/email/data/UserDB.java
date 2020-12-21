package email.data;

import java.sql.*;

import email.user.User;

public class UserDB {
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url;
    private static String username;
    private static String password;
    
    // private member variable to hold the connection
    private static Connection conn = null;

    
    public UserDB(String url, String username, String pwd) {
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
            conn = DriverManager.getConnection(UserDB.url, 
                                UserDB.username, UserDB.password);
        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException: " + 
                    e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getSQLState());
            System.err.println("SQLException: " + e.getErrorCode());
            System.err.println("SQLException: " + e.getMessage());
        }
    }

 

    public static int insert(User user) {
        
        UserDB.createConnection();
        Connection connection = UserDB.conn;
        PreparedStatement ps = null;

        String query
                = "INSERT INTO user (email, firstName, lastName) "
                + "VALUES (?, ?, ?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getFirstName());
            ps.setString(3, user.getLastName());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            
            return 0;
        } finally {
            DBUtil.closeConnection(connection);
            DBUtil.closePreparedStatement(ps);
          }
    }

    public static int update(User user) {
        UserDB.createConnection();
        Connection connection = UserDB.conn;
        PreparedStatement ps = null;

        String query = "UPDATE user SET "
                + "firstName = ?, "
                + "lastName = ? "
                + "WHERE email = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getEmail());

            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closeConnection(connection);
            DBUtil.closePreparedStatement(ps);
          }
    }

    public static int delete(User user) {
        UserDB.createConnection();
        Connection connection = UserDB.conn;
        PreparedStatement ps = null;

        String query = "DELETE FROM users "
                + "WHERE email = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user.getEmail());

            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closeConnection(connection);
            DBUtil.closePreparedStatement(ps);
        }
    }

    public static boolean emailExists(String email) {
        UserDB.createConnection();
        Connection connection = UserDB.conn;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean exists = false;

        String query = "SELECT email FROM user "
                + "WHERE email = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            String em = (String)rs.getObject(1);
            exists = em.equals(email);
            
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            DBUtil.closeConnection(connection);
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
         }
        return exists;
    }

    public static User selectUser(String email) {
        UserDB.createConnection();
        Connection connection = UserDB.conn;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT * FROM user "
                + "WHERE email = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            User user = null;
            if (rs.next()) {
                user = new User();
                user.setFirstName(rs.getString("firstName"));
                user.setLastName(rs.getString("lastName"));
                user.setEmail(rs.getString("email"));
            }
            return user;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } finally {
            DBUtil.closeConnection(connection);
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
        }
    }
}