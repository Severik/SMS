package ua.gotsman.sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbWriter {

    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found.");
            e.printStackTrace();
        }
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stszpua_db","stszpua_severik", "Derparol12!@");
        connection.close();
    }
}
