package createDB;

import DAO.DataBaseConnector;

public class CreateAdminTable {
    public CreateAdminTable(){
        createAdminTable();
    }
    public void createAdminTable() {
    String sql = "CREATE TABLE IF NOT EXISTS admin (" +
            "ID SERIAL NOT NULL PRIMARY KEY," +
            "first_name text NOT NULL," +
            "last_name text NOT NULL," +
            "email text NOT NULL," +
            "phone_number text NOT NULL" +
            ");";
        DataBaseConnector dataBaseConnector = new DataBaseConnector();
        dataBaseConnector.updateQuery(sql);
    }
}