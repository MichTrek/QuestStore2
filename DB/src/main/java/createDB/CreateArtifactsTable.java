package createDB;

import DAO.DataBaseConnector;

public class CreateArtifactsTable {
    private DataBaseConnector dbConnector = new DataBaseConnector();

    public CreateArtifactsTable(){
        this.dbConnector.connect();
        creatingArtifactsTable();
    }

    public void creatingArtifactsTable(){
        String querry = "CREATE TABLE IF NOT EXISTS artifacts(" +
                "id_artifact SERIAL PRIMARY KEY, " +
                "artifact_name TEXT, " +
                "artifact_cost INTEGER, " +
                "quantity INTEGER); ";
        createArtifact(querry);
    }
    public void createArtifact(String querry){
        String sql = querry;
        this.dbConnector.updateQuery(sql);
    }
}