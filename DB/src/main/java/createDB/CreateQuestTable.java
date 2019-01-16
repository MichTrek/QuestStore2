package createDB;

import DAO.DataBaseConnector;

public class CreateQuestTable {
    DataBaseConnector dbConnector = new DataBaseConnector();

    public CreateQuestTable(){
        this.dbConnector.connect();
        creatingQuestTable();
    }

    public void creatingQuestTable(){
        String querry = "CREATE TABLE IF NOT EXISTS quests(" +
                "id SERIAL PRIMARY KEY, " +
                "quest_name TEXT, " +
                "quest_value INTEGER, " +
                "quest_category INTEGER); ";
        createQuest(querry);
    }
    public void createQuest(String querry){
        String sql = querry;
        this.dbConnector.updateQuery(sql);
    }
}
