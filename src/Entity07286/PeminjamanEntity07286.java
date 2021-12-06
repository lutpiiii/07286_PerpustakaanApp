package Entity07286;

import java.util.Date;

public class PeminjamanEntity07286 {
    private String idPeminjaman;
    private BukuEntity07286 buku;
    private AnggotaEntity07286 anggota;
    private Date tglPeminjaman;
    private Date tglPengembalian;
    private boolean statusPeminjaman;

    public PeminjamanEntity07286(BukuEntity07286 buku, AnggotaEntity07286 anggota) {
        this.buku = buku;
        this.anggota = anggota;
    }

    public PeminjamanEntity07286() {
    }

    public String getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public BukuEntity07286 getBuku() {
        return buku;
    }

    public void setBuku(BukuEntity07286 buku) {
        this.buku = buku;
    }

    public AnggotaEntity07286 getAnggota() {
        return anggota;
    }

    public void setAnggota(AnggotaEntity07286 anggota) {
        this.anggota = anggota;
    }

    public Date getTglPeminjaman() {
        return tglPeminjaman;
    }

    public void setTglPeminjaman(Date tglPeminjaman) {
        this.tglPeminjaman = tglPeminjaman;
    }

    public Date getTglPengembalian() {
        return tglPengembalian;
    }

    public void setTglPengembalian(Date tglPengembalian) {
        this.tglPengembalian = tglPengembalian;
    }

    public boolean isStatusPeminjaman() {
        return statusPeminjaman;
    }

    public void setStatusPeminjaman(boolean statusPeminjaman) {
        this.statusPeminjaman = statusPeminjaman;
    }
    
    
}
