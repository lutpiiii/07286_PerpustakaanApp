package Controller07286;

import Entity07286.BukuEntity07286;
import java.util.ArrayList;

public class BukuController07286 implements BukuControllerInterface07286{

    @Override
    public void insertBuku(String isbn, String judul, String penerbit, int terbit, int halaman) {
        AllObjectModel07286.bukuModel.add(new BukuEntity07286(isbn, judul, penerbit, terbit, halaman));
    }

    @Override
    public void deleteBuku(String isbn) {
        AllObjectModel07286.bukuModel.delete(isbn);
    }

    @Override
    public void updateBuku(int pilihan, String isbn, String data) {
        if(pilihan == 1){
            AllObjectModel07286.bukuModel.updateJudul(isbn, data);
        }else if(pilihan == 2){
            AllObjectModel07286.bukuModel.updatePenerbit(isbn, data);
        }
    }

    @Override
    public ArrayList<BukuEntity07286> showAllData() {
        return AllObjectModel07286.bukuModel.getAll();
    }

    @Override
    public BukuEntity07286 getData(String isbn) {
        return AllObjectModel07286.bukuModel.getById(isbn);
    }
   
}
