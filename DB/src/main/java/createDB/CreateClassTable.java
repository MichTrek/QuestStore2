package createDB;

import DAO.DataBaseConnector;

public class CreateClassTable {
    DataBaseConnector dbConnector = new DataBaseConnector();

    public CreateClassTable(){
        this.dbConnector.connect();
        creatingClassTable();
    }

    public void creatingClassTable(){
        String querry = "CREATE TABLE IF NOT EXISTS class(" +
                "id_class SERIAL PRIMARY KEY," +
                "class_name text NOT NULL); ";
        createClass(querry);
    }
    public void createClass(String querry){
        String sql = querry;
        this.dbConnector.updateQuery(sql);
    }
}