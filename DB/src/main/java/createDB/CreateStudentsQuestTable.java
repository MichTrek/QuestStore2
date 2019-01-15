package createDB;

import DAO.DataBaseConnector;

public class CreateStudentsQuestTable {
    DataBaseConnector dbConnector = new DataBaseConnector();

    public CreateStudentsQuestTable(){
        this.dbConnector.connect();
        creatingStudentsQuestTable();
    }

    public void creatingStudentsQuestTable(){
        String querry = "CREATE TABLE IF NOT EXISTS students_quests(" +
                "id_student INTEGER, " +
                "id_quest INTEGER, " +
                "quest_status TEXT); ";
        createStudentsQuest(querry);
    }
    public void createStudentsQuest(String querry){
        String sql = querry;
        this.dbConnector.updateQuery(sql);
    }
}