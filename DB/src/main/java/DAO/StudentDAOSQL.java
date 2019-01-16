package DAO;

import View.View;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOSQL implements StudentDAOInterface {
    private DataBaseConnector dataBaseConnector = new DataBaseConnector();
    private View view = new View();
    @Override
    public List<ResultSet> showWallet(int id) {
        List<ResultSet> resultSetList = new ArrayList<>();
        ResultSet rs = dataBaseConnector.query("SELECT cool_coins FROM students WHERE id ="+id);
        ResultSet rs2 = dataBaseConnector.query("SELECT artifact_name FROM artifacts RIGHT JOIN students_artifacts ON artifacts.id_artifact = students_artifacts.id_artifact WHERE students_artifacts.id_student = "+id);
        resultSetList.add(rs);
        resultSetList.add(rs2);
        return resultSetList;
    }

    @Override
    public void buyArtifacts() {

    }

    @Override
    public void buyArtifactTogether() {

    }

    @Override
    public ResultSet showMyLevel(int id) {
        ResultSet rs = dataBaseConnector.query("SELECT level FROM students WHERE id ="+id);
        return rs;
    }

    public static void main(String[] args) {
        StudentDAOSQL studentDAOSQL = new StudentDAOSQL();
        View view = new View();
        view.printListOfResultSet(studentDAOSQL.showWallet(1));
        view.printResultSet(studentDAOSQL.showMyLevel(1));

    }
}
