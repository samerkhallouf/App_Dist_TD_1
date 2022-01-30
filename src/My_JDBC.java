import java.sql.*;
public class My_JDBC {
    public static void main(String[] args) {
        try{
            //1-Connect to a DB
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
            //2- Write statements to insert into table
//            String query = "insert into students(idStudents,last_name, first_name,notes)"+"values(?,?,?,?)";
//
//            PreparedStatement preparedStmt = myConn.prepareStatement(query);
//            preparedStmt.setInt(1,1);
//            preparedStmt.setString(2,"Khallouf");
//            preparedStmt.setString(3,"Samer");
//            preparedStmt.setInt(4,10);
//
//            PreparedStatement preparedStmt2 = myConn.prepareStatement(query);
//            preparedStmt2.setInt(1,2);
//            preparedStmt2.setString(2,"Khallouf");
//            preparedStmt2.setString(3,"Elias");
//            preparedStmt2.setInt(4,20);
            //3- Execute statements
//            preparedStmt.execute();
//            preparedStmt2.execute();

            //4- Write statements to get results from table
            Statement myStmt = myConn.createStatement();
            ResultSet results = myStmt.executeQuery("select * from students");
            //5- Show the result of the query
            while(results.next()){
                System.out.println(results.getInt("idStudents")+" "+results.getString("last_name")+ " "+results.getString("first_name")+" : "+results.getInt("notes"));
            }
            myConn.close();
        }catch (Exception exc){
            exc.printStackTrace();
        }
    }
}
