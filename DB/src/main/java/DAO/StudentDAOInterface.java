package DAO;

import java.sql.ResultSet;
import java.util.List;

public interface StudentDAOInterface {
    List<ResultSet> showWallet(int id);
    void buyArtifacts();
    void buyArtifactTogether();
    ResultSet showMyLevel(int id);
}
