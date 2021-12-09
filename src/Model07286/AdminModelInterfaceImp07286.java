package Model07286;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminModelInterfaceImp07286 implements AdminModelInterface07286{

    @Override
    public boolean login(String nama, String password) {
        boolean login = false;
            try{
            String sql = "SELECT * FROM WHERE anggota_nama = ? AND anggota_passowrd = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nama);
            stat.setString(2, password);
            ResultSet rs = stat.executeQuery();
            if(rs.next()){
                login = true;
            }else{
                login = false;
            }
        }catch (Exception e){
            e.printStackTrace();
        }return login;
    }
}
