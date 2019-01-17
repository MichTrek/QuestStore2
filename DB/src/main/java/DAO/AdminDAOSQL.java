package DAO;

import View.View;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAOSQL implements AdminDAOInterface {
    DataBaseConnector dataBaseConnector = new DataBaseConnector();

    @Override
    public void createMentor(String first_name, String last_name, String email, String phone_number) {
        String sql = "INSERT INTO mentors (first_name, last_name, email, phone_number) " +
                "VALUES(?,?,?,?);";
        try {
            dataBaseConnector.connect();
            PreparedStatement stmt = dataBaseConnector.getConnection().prepareStatement(sql);
            stmt.setString(1, first_name);
            stmt.setString(2, last_name);
            stmt.setString(3, email);
            stmt.setString(4, phone_number);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void createClass(String class_name) {
        String sql = "INSERT INTO class (class_name)" +
                "VALUES(?);";
        try {
            dataBaseConnector.connect();
            PreparedStatement stmt = dataBaseConnector.getConnection().prepareStatement(sql);
            stmt.setString(1, class_name);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void editMentor(String columnToChange, String update, int id) {
        String sql ="UPDATE mentors SET "+columnToChange+" = ? WHERE id = ?;";
        try {
            dataBaseConnector.connect();
            PreparedStatement stmt = dataBaseConnector.getConnection().prepareStatement(sql);
            stmt.setString(1,update);
            stmt.setInt(2,id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public ResultSet showMentorById(int id) {
        return dataBaseConnector.query("SELECT * FROM mentors WHERE id =" + id);
    }

    @Override
    public void createLevelOfExperience() {

    }

    public static void main(String[] args) {
        View view = new View();
        AdminDAOSQL adminDAOSQL = new AdminDAOSQL();
        adminDAOSQL.createMentor("adam", "maczek", "asd@assa.pl", "0700990880l");
        adminDAOSQL.createClass("klsaas");
        view.printResultSet(adminDAOSQL.showMentorById(1));
        adminDAOSQL.editMentor("email", "piotrek3", 2);
    }
}
