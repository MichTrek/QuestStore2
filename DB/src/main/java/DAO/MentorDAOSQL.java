package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class MentorDAOSQL implements MentorDAOInterface {
DataBaseConnector dbConnector = new DataBaseConnector();
    @Override
    public void createStudent(String name, String last_name, String _class, String email, String phone_number, int coolCoins, int lvl) {
        String sql = "INSERT INTO students (first_name, last_name, class, email, phone_number, cool_coins, level) " +
                "VALUES(?,?,?,?,?,?,?);";
        try {
            dbConnector.connect();
            PreparedStatement stmt = dbConnector.getConnection().prepareStatement(sql);
            stmt.setString(1,name);
            stmt.setString(2,last_name);
            stmt.setString(3,_class);
            stmt.setString(4,email);
            stmt.setString(5,phone_number);
            stmt.setInt(6,coolCoins);
            stmt.setInt(7,lvl);
            stmt.executeUpdate();
        }
        catch (SQLException e){
           e.printStackTrace();
        }
    }

    @Override
    public void addQuest(String quest_name, int quest_value, int category) {
        String sql = "INSERT INTO students (quest_name, quest_value, category) " +
                "VALUES(?,?);";
        try {
            dbConnector.connect();
            PreparedStatement stmt = dbConnector.getConnection().prepareStatement(sql);
            stmt.setString(1,quest_name);
            stmt.setInt(2,quest_value);
            stmt.setInt(3,category);
            stmt.executeUpdate();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void addQuestCategory() {

    }

    @Override
    public void addArtifactToShop() {

    }

    @Override
    public void editQuest() {

    }

    @Override
    public void archiveQuest() {

    }

    @Override
    public ResultSet showStudents(){
        return null;
    }

    @Override
    public ResultSet showStudentsWallet() {

        return null;
    }

    public static void main(String[] args) {
        MentorDAOSQL mds = new MentorDAOSQL();
        mds.createStudent("adam","maczek","1b","anna.naan@buziaczek.pl","0700990880",45,0);
        mds.addQuest("zrobic_sniadanie",100, 2);
    }
}
