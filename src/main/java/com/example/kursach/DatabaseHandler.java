package com.example.kursach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DatabaseHandler extends Configs{
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:msql//" + dbHost + ":" + dbPort + "/" + dbName;

        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnection;
    }
    public void coffee_info(String latte, String raf, String cappucino, String espresso, String doppio, String americano){
        String insert = "INSERT INTO" + Const.COFFEE_TABLE + "(" + Const.LATTE + "," + Const.RAF + "," + Const.CAPPUCINO + "," + Const.ESPRESSO + "," + Const.DOPPIO + "," + Const.AMERICANO + ")"
                + "VALUES(,?,?,?,?,?,?)";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, latte);
            prSt.setString(2, raf);
            prSt.setString(3, cappucino);
            prSt.setString(4, espresso);
            prSt.setString(5, doppio);
            prSt.setString(6, americano);

            prSt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
