package Model07286;

import Entity07286.BukuEntity07286;
import java.sql.*;
import java.util.ArrayList;

public class BukuModelEntity07286 implements BukuModelInterface07286{

    @Override
    public void add(BukuEntity07286 buku) {
        try{
            String sql = "INSERT INTO BUKU(buku_isbn, buku_judul, buku_penerbit, buku terbit, buku_halaman) values (?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, buku.getIsbn());
            stat.setString(2, buku.getJudul());
            stat.setString(3, buku.getPenerbit());
            stat.setInt(4, buku.getTerbit());
            stat.setInt(5, buku.getHalaman());
            stat.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateJudul(String isbn, String judul) {
        try{
            String sql = "UPDATE BUKU SET buku_judul = ? WHERE buku_isbn = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, judul);
            stat.setString(2, isbn);
            stat.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updatePenerbit(String isbn, String penerbit) {
        try{
            String sql = "UPDATE BUKU SET buku_penerbit = ? WHERE buku_isbn = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, isbn);
            stat.setString(2, penerbit);
            stat.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String isbn) {
        try{
            String sql = "UPDATE BUKU SET buku_ketersediaan = false WHERE buku_isbn = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, isbn);
            stat.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<BukuEntity07286> getAll() {
        ArrayList<BukuEntity07286> arrBuku = new ArrayList<>();
        try{
            String sql = "SELECT * FROM BUKU WHERE buku_ketersediaan = true";
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                BukuEntity07286 buku = new BukuEntity07286();
                buku.setIsbn(rs.getString("buku_isbn"));
                buku.setJudul(rs.getString("buku_judul"));
                buku.setPenerbit(rs.getString("buku_penerbit"));
                buku.setTerbit(rs.getInt("buku_terbit"));
                buku.setHalaman(rs.getInt("buku_halaman"));
                arrBuku.add(buku);
            }
        }catch (Exception e){
            e.printStackTrace();
        } return arrBuku;
    }

    @Override
    public BukuEntity07286 getById(String isbn) {
       BukuEntity07286 buku = null;
       try{
            String sql = "SELECT * FROM BUKU WHERE buku_ketersediaan = true AND buku_isbn = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            ResultSet rs = stat.executeQuery();
            while(rs.next()){
                buku = new BukuEntity07286();
                buku.setIsbn(rs.getString("buku_isbn"));
                buku.setJudul(rs.getString("buku_judul"));
                buku.setPenerbit(rs.getString("buku_penerbit"));
                buku.setTerbit(rs.getInt("buku_terbit"));
                buku.setHalaman(rs.getInt("buku_halaman"));
            }
        }catch (Exception e){
            e.printStackTrace();
        } return buku;
    }
}