package DAO;

import java.sql.ResultSet;

public interface MentorDAOInterface {

    void createStudent(String name, String last_name, String _class, String email, String phone_number, int coolCoins, int lvl);

    void addQuest(String quest_name, int quest_value, int category);

    void addQuestCategory(String category_name, int cool_coins_bonus);

    void addArtifactToShop(String artifact_name, int artifact_value, int artifact_quantity);

    void editQuest(int id, String quest_name, int quest_value, int quest_category);

    void archiveQuest(int id_student, int id_quest, String status);

    ResultSet showStudents();

    ResultSet showStudentsWallet();

}
