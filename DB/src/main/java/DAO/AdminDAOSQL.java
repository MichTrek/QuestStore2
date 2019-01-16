package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAOSQL implements AdminDAOInterface{
    DataBaseConnector dataBaseConnector = new DataBaseConnector();
    @Override
    public void createMentor(String first_name, String last_name, String email, String phone_number) {
        String sql = "INSERT INTO mentors (first_name, last_name, email, phone_number) " +
                "VALUES(?,?,?,?);";
        try {
            dataBaseConnector.connect();
            PreparedStatement stmt = dataBaseConnector.getConnection().prepareStatement(sql);
            stmt.setString(1,first_name);
            stmt.setString(2,last_name);
            stmt.setString(3,email);
            stmt.setString(4,phone_number);
            stmt.executeUpdate();
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public void createClass() {

    }

    @Override
    public void editMentor() {

    }

    @Override
    public ResultSet showMentorById() {
        return null;
    }

    @Override
    public void createLevelOfExperience() {

    }
    public static void main(String[] args) {
        AdminDAOSQL adminDAOSQL = new AdminDAOSQL();
        adminDAOSQL.createMentor("adam","maczek","asd@assa.pl","0700990880l");
    }
}
