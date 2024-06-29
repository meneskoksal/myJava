import java.sql.*;

public class DatabaseConnection {

    public static void main(String args[]){

        String url ="jdbc:mysql://localhost:3306/jdbc";
        String username ="root";
        String password = "root";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();
//            String insert = "Insert into student Values (4,' stallion',5)";
//
//            statement.execute(insert);

            ResultSet resultSet = statement.executeQuery("select * from student  ");

            int a = resultSet.getMetaData().getColumnCount();
            System.out.println(a +" ");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+ resultSet.getString(2)+ resultSet.getInt(3));
            }

            connection.close();

//           public void dbChecker (int a){
//
//           }

        }

        catch(Exception e){
            System.out.println(e);
        }



    }

}
