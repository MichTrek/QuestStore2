package DAO;

import java.sql.*;

public class DataBaseConnector {

    private Connection connection;
    private Statement stmt;

    public void connect() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/queststore",
                            "queststore", "123");
            connection.setAutoCommit(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateQuery(String sql) {

        try {
            this.connect();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet query(String sql) {
        try {
            this.connect();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}