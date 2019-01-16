package View;

import java.sql.ResultSet;
import java.sql.SQLException;

public class View {

    public void printResultSet(ResultSet rs){
        try {
            int columnAmount = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                for(int i=1; i<=columnAmount; i++){
                    System.out.print(rs.getObject(i)+" ");
                }
                System.out.println();
            }
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }

}
