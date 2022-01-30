import java.sql.*;

public class My_JDBC {
    public static void main(String[] args) {
        try{
            //1-Connect to a DB
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","Admin","Admin");
            //2- Write statements
            Statement firststmt = myConn.createStatement();

            //3- Execute statements
            ResultSet results = firststmt.executeQuery("select * from students");
            //4- Show the result set
            while (results.next()){
                System.out.println(results.getString("last_name")+ " , "+ results.getString("first_name"));
            }
        }catch (Exception exc){
            exc.printStackTrace();
        }
    }
}
