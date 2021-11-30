package Entity;

public class BukuEntity07286 {
    private String isbn;
    private String judul;
    private String penerbit;
    private int terbit;
    private int hal;
    
    public void BukuEntity07286(String isbn, String judul, String penerbit, int terbit, int hal){
        this.isbn = isbn;
        this.judul = judul;
        this.penerbit = penerbit;
        this.terbit = terbit;
        this.hal = hal;
    }
    
    public BukuEntity07286(){}

    public String getIsbn() {
        return isbn;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public int getTerbit() {
        return terbit;
    }

    public int getHal() {
        return hal;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setTerbit(int terbit) {
        this.terbit = terbit;
    }

    public void setHal(int hal) {
        this.hal = hal;
    }
    
    
}
