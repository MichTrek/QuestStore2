package createDB;

import DAO.DataBaseConnector;

public class CreateStudentArtifactTable {
    public CreateStudentArtifactTable() {
        CreateStudentArtifactTable();
    }

    public void CreateStudentArtifactTable() {
        String sql = "CREATE TABLE IF NOT EXISTS students_artifacts (" +
                "id_artifact INTEGER NOT NULL, " +
                "id_student INTEGER NOT NULL, " +
                "quantity INTEGER" +
                ");";
        DataBaseConnector dataBaseConnector = new DataBaseConnector();
        dataBaseConnector.updateQuery(sql);
    }
}
