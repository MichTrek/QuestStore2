package createDB;

import DAO.DataBaseConnector;

public class CreateCategoryTable {
    private DataBaseConnector dbConnector = new DataBaseConnector();

    public CreateCategoryTable(){
        this.dbConnector.connect();
        creatingCategoryTable();
    }

    public void creatingCategoryTable(){
        String querry = "CREATE TABLE IF NOT EXISTS quests_category(" +
                "quest_category_id SERIAL PRIMARY KEY, " +
                "category_name TEXT, " +
                "cool_con_bonus INTEGER" +
                "); ";
        createCategory(querry);
    }
    public void createCategory(String querry){
        this.dbConnector.updateQuery(querry);
    }
}
