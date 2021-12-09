package Controller07286;

public class AdminControllerInterfaceImp implements AdminControllerInterface07286{

    @Override
    public boolean login(String nama, String password) {
        return AllObjectModel07286.adminModel.login(nama, password);
    }

    @Override
    public void hapusAnggota(int id) {
        AllObjectModel07286.anggotaModel.remove(id);
    }

    @Override
    public void resetPassAnggota(int id) {
        AllObjectModel07286.anggotaModel.resetPassword(id);
    }
    
}
