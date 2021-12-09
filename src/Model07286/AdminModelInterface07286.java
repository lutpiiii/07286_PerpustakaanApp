package Model07286;

import Helper07286.KoneksiDb07286;
import java.sql.Connection;

public interface AdminModelInterface07286 {
    Connection conn = KoneksiDb07286.getConnection();
    
    boolean login(String nama, String password);
}
