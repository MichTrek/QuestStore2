package View;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

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

    public String input(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }

}
