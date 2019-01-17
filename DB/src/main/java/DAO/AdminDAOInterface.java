package DAO;

import java.sql.ResultSet;

public interface AdminDAOInterface {
    void createMentor(String first_name, String last_name, String email, String phone_number);

    void createClass(String class_name);

    void editMentor(String columnToChange, String update, int id);

    ResultSet showMentorById(int id);

    void createLevelOfExperience();
}
