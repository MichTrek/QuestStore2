package createDB;

import DAO.DataBaseConnector;

public class CreateStudentTable {
    DataBaseConnector dbConnector = new DataBaseConnector();

    public CreateStudentTable(){
        this.dbConnector.connect();
        creatingStudentTable();
    }

    public void creatingStudentTable(){
        String querry = "CREATE TABLE IF NOT EXISTS students(" +
                "id SERIAL PRIMARY KEY, " +
                "class TEXT, " +
                "first_name TEXT, " +
                "last_name TEXT, " +
                "email TEXT, " +
                "phone_number TEXT, " +
                "cool_coins INTEGER, " +
                "level INTEGER); ";
        createStudent(querry);
    }
    public void createStudent(String querry){
        String sql = querry;
        this.dbConnector.updateQuery(sql);
    }


}
