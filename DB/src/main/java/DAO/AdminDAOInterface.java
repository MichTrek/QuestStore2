package DAO;

import java.sql.ResultSet;

public interface AdminDAOInterface {
    void createMentor();
    void createClass();
    void editMentor();
    ResultSet showMentorById();
    void createLevelOfExperience();
}
