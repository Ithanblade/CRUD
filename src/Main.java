
import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/estudiantes2024";
        String user = "root";
        String password = "123456";
        PreparedStatement pstmt = null;
        Connection conn = null;


        try {
            conn = DriverManager.getConnection(url, user, password);

            System.out.println("Conectado a ala base de datos");
            String sql="update estudiantes set b1 = ? where cedula = ?";

            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,12);
            pstmt.setString(2,"0052717064");
            pstmt.executeUpdate();
            int n=pstmt.executeUpdate();
            System.out.println("Se modificaron: "+n+" lineas");


        } catch (SQLException e1) {
            System.out.println(e1);
        }finally {
            //cerrar la conexion con la base

            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            }catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }

    }
}