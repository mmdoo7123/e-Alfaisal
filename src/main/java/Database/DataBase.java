package Database;

import java.sql.*;


public class DataBase {
    /* this method creates a connection to a postgreSQL database with the given
        parameters (server, username, and password). Returns the connection if
        successful, otherwise, prints error and exits.   */
    public static Connection getConnection() {
        try {
            Connection dbConnection;
            Class.forName("org.postgresql.Driver");
            dbConnection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "postgres");
            //    this.users = new HashMap<>();

            return dbConnection;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return (null);
    }

    /*The method below works based on a given  userId and a database connection, retrieves the password for
  that user from the database.    */
    public static String getUserPassword(String userId, Connection dbConnection) throws SQLException {
        Statement statement = dbConnection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select password from scheduling.scheduling_users where id = '" + userId + "'");
        resultSet.next();


        return (resultSet.getString("password"));
    }

    /*The method below works based on a given userId, password and a database connection, 
    verifies if the user exists with the given credentials in the database. 
    Returns true if the user is found, false otherwise.    */
    public static Boolean getUserIDPassword(String userId, Connection dbConnection, String password) throws SQLException {
        Statement statement = dbConnection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select password = '" + password + "' as user_found from scheduling.scheduling_users where id = '" + userId + "' and password = '" + password + "'");
        if (!resultSet.isBeforeFirst()) {
            return (false);
        }
        resultSet.next();

        return (resultSet.getBoolean("user_found"));
    }

}    
