package DAO;

import java.sql.ResultSet;

public interface MentorDAOInterface {

    void createStudent(String name, String last_name, String _class, String email, String phone_number, int coolCoins, int lvl);

    void addQuest();

    void addQuestCategory();

    void addArtifactToShop();

    void editQuest();

    void archiveQuest();

    ResultSet showStudents();

    ResultSet showStudentsWallet();

}
