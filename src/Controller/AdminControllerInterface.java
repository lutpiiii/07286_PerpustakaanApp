package Controller;

public interface AdminControllerInterface {
    boolean login(String nama, String password);
    void hapusAnggota(int id);
    void resetPassAnggota(int id);
}
