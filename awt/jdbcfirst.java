import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
class jdbcfirst{
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/Shekhar";
    private static final String username = "pgadmin4@pgadmin.org";
    private static final String password = "root";

    public static void main(String[] args){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(JDBC_URL, username, password);
            Statement statement = connection.createStatement();
            String query = "SELECT * form class";

            ResultSet resultset = statement.executeQuery(query);

            while(resultset.next()){
                int id = resultset.getInt("id");
                String name = resultset.getString("name");

                System.out.println("Id : "+ query +"");
            }
            resultset.close();
            statement.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                if(connection != null){
                    connection.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}