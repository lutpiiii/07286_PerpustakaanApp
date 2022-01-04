package Controller;

public class AdminControllerInterfaceimpl implements AdminControllerInterface {
    @Override
    public boolean login(String nama, String password) {
      return AllObjectModel.adminModel.login(nama, password);
    }
    @Override
    public void hapusAnggota(int id) {
       AllObjectModel.anggotaModel.remove(id);
    }
    @Override
    public void resetPassAnggota(int id) {
        AllObjectModel.anggotaModel.resetPassword(id);
    }
}
