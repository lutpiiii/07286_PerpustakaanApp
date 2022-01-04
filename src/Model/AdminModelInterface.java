package Model;
import Helper.DbUtil;
import java.sql.Connection;

public interface AdminModelInterface {
    Connection conn = DbUtil.getConnection();
    boolean login(String nama, String password);
}
