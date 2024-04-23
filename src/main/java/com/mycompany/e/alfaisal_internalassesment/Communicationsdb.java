package com.mycompany.e.alfaisal_internalassesment;

import java.sql.Connection;
import java.sql.DriverManager;

public class Communicationsdb {
    public static void main(String[] args) {
        Connection dbConnection;
        try {
            Class.forName("org.postgresql.Driver");
            dbConnection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "postgres");
            System.out.println("Opened database successfully " + dbConnection);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

    }
}    
