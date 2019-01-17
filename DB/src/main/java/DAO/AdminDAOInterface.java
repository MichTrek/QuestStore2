package DAO;

import model.Mentor;

import java.sql.ResultSet;

public interface AdminDAOInterface {
    void createMentor(String first_name, String last_name, String email, String phone_number);

    void createClass(String class_name);

    void editMentor(String columnToChange, String update, int id);

    Mentor showMentorById(int id);

    void createLevelOfExperience();
}
