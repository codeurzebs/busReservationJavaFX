package com.codeurzebs.busreservationjavafx.model.database.DAO.DAOfactoryICT;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionMySQL {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/ictbus";
    private static final String USER = "root";
    private static final String PASSWORD = "*******";
    private Connection connection;
    public ConnexionMySQL() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            System.out.println("Connexion à MySQL réussie !");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.err.println("Erreur lors de la connexion à MySQL : " + e.getMessage());
        }
    }
    public Connection getConnection() {
        return connection;
    }
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connexion à MySQL fermée !");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Erreur lors de la fermeture de la connexion à MySQL : " + e.getMessage());
        }
    }

}
