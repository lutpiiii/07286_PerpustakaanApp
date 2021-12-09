package Helper07286;

import java.sql.Connection;
import java.sql.DriverManager;

public class KoneksiDb07286 {
    public static Connection getConnection(){
        Connection conn=null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/db_perpustakaanapp";

        String user = "root";
        String pass = "";
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(url, user, pass);
            System.out.println("Berhasil Tersambung");
        }
        catch(Exception e){
             System.out.println("Tidak Tersambung");
             e.printStackTrace();
            
        }
return conn;
        
    }
}
