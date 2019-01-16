package createDB;

import DAO.DataBaseConnector;

public class CreateStudentArtifactTable {
    public CreateStudentArtifactTable(){
        CreateStudentArtifactTable();
    }
    public void CreateStudentArtifactTable() {
        String sql = "CREATE TABLE IF NOT EXISTS students_artifacts (" +
                "id_artifact int NOT NULL," +
                "id_student int NOT NULL" +
                "quantity int" +
                ");";
        DataBaseConnector dataBaseConnector = new DataBaseConnector();
        dataBaseConnector.updateQuery(sql);
    }
}
