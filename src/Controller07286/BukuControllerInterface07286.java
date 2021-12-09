package Controller07286;

import Entity07286.BukuEntity07286;
import java.util.ArrayList;

public interface BukuControllerInterface07286 {
    void insertBuku(String isbn, String judul, String penerbit, int terbit, int halaman);
    void deleteBuku(String isbn);
    void updateBuku(int pilihan, String isbn, String data);
    ArrayList<BukuEntity07286> showAllData();
    BukuEntity07286 getData(String isbn);
}
