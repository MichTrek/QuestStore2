package DAO;

import java.sql.ResultSet;

public interface AdminDAOInterface {
    void createMentor(String first_name, String last_name, String email, String phone_number);
    void createClass();
    void editMentor();
    ResultSet showMentorById();
    void createLevelOfExperience();
}
