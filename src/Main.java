
import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/estudiantes2024";
        String user = "root";
        String password = "123456";
        PreparedStatement pstmt = null;


        try (Connection connection= DriverManager.getConnection(url,user,password)){

            System.out.println("Conectado a ala base de datos");
            String sql="update estudiantes set b1 = ? where cedulo = ?";

            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1,19);
            pstmt.setString(2,"0052717064");
            pstmt.executeUpdate();

            while (resultSet.next()){

                float prom=(resultSet.getFloat("b1") + resultSet.getFloat("b2"))/2;

                System.out.println(resultSet.getString("cedula"));
                System.out.println("Nombre: "+resultSet.getString("nombre"));
                System.out.println("Cedula: "+resultSet.getString("cedula"));
                System.out.println("Nota b1: "+resultSet.getString("b1"));
                System.out.println("Nota b2: "+resultSet.getString("b2"));

            }

        } catch (SQLException e1) {
            System.out.println(e1);
        }

    }
}