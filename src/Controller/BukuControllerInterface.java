package Controller;
import Entity.BukuEntity;
import java.util.ArrayList;

public interface BukuControllerInterface {
   void insertBuku(String isbn, String judul, String penerbit, int terbit, int halaman);
   void deleteBuku(String isbn);
   void updateBuku(int pilihan, String data, String isbn);
   ArrayList<BukuEntity> showAllData();
   BukuEntity getData(String isbn);   
}
