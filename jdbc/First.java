import java.sql.*;
class First
{
    public static void main(String[] args) {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:2000/youtube","root","root");

            if(con.isClosed()){
                System.out.println("Connection is closed");
            }
            else{
                System.err.println("Connection established...");
            }


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}