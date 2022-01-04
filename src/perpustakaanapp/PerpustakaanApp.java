package perpustakaanapp;
import Controller.AdminControllerInterface;
import Controller.AdminControllerInterfaceimpl;
import Controller.AnggotaControllerInterface;
import Controller.AnggotaControllerInterfaceimpl;
import Controller.BukuControllerInterface;
import Controller.BukuControllerInterfaceimpl;
import Controller.PeminjamanControllerInterface;
import Controller.PeminjamanControllerInterfaceimpl;
import Entity.AnggotaEntity;
import Entity.BukuEntity;
import java.util.Scanner;

public class PerpustakaanApp {
    public static Scanner input = new Scanner(System.in); 
    public static AdminControllerInterface adminController = new AdminControllerInterfaceimpl();
    public static AnggotaControllerInterface anggotaController = new AnggotaControllerInterfaceimpl();
    public static BukuControllerInterface bukuController = new BukuControllerInterfaceimpl();
    public static PeminjamanControllerInterface peminjamanController = new PeminjamanControllerInterfaceimpl();
    public static String nama, password, noTelp, alamat;
    public static String username, pass;
    
    public static void main (String[] args){
        int pilih;
        do{
            System.out.println("SELAMAT DATANG");
            System.out.println("1. REGISTRASI");
            System.out.println("2. LOGIN");
            System.out.println("3. KELUAR");
            System.out.print("Pilihan : ");
            pilih = input.nextInt();
            switch(pilih){
                case 1:
                    registrasi();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("KELUAR");
                    break;
            }
        }while (pilih < 3);
    }
    
    public static void registrasi(){
        System.out.print("Nama      : ");
        nama = input.next();
        System.out.print("Password  : ");
        password = input.next();
        System.out.print("No Telpon : ");
        noTelp = input.next();
        System.out.print("Alamat    : ");
        alamat = input.next();
        anggotaController.insertAnggota(nama, password, noTelp, alamat);
    }
    
    public static void login(){
        int pilih;
        do{
            System.out.println("LOGIN AS ");
            System.out.println("1. Admin");
            System.out.println("2. Anggota");
            System.out.print("Pilihan : ");
            pilih = input.nextInt();
            switch(pilih){
                case 1:
                    loginAdmin();
                    break;
                case 2:
                    loginAnggota();
                    break;
            }
        }while (pilih < 3);
    }
    
    public static void loginAdmin(){
       System.out.print("Username : ");
        nama = input.next();
        System.out.print("Password : ");
        password = input.next();
        if(adminController.login(nama, password)){
            menuAdmin();
        }else{
            System.out.println("Username atau Password salah");
        }
    }
    
    public static void loginAnggota(){
        System.out.print("Username : ");
        nama = input.next();
        System.out.print("Password : ");
        password = input.next();
        if(anggotaController.login(nama, password) != 0){
            int id = anggotaController.login(nama, password);
            menuAnggota(id);
        }else{
            System.out.println("Username atau Password salah");
        }
    }
    public static void menuAdmin(){
        int pilih;
        do{
            System.out.println("MENU ADMIN");
            System.out.println("1. Lihat Daftar Anggota");
            System.out.println("2. Hapus Anggota");
            System.out.println("3. Reset Password Anggota");
            System.out.println("4. Lihat Daftar Buku");
            System.out.println("5. Tambah Daftar Buku");
            System.out.println("6. Hapus Daftar Buku");
            System.out.println("7. Ubah Informasi Buku");
            System.out.println("8. Lihat Daftar Peminjaman");
            System.out.println("9. Verifikasi Pengembalian");
            System.out.println("10. KELUAR");
            pilih = input.nextInt();
            switch(pilih){
                case 1:
                    daftarAnggota();
                    break;
                case 2:
                    hapusAnggota();
                    break;
                case 3:
                    resetPasswordAnggota();
                    break;
                case 4:
                    daftarBuku();
                    break;
                case 5:
                    tambahDaftarBuku();
                    break;
                case 6:
                    hapusBuku();
                    break;
                case 7:
                    ubahBuku();
                    break;
                case 8:
                    lihatDaftarPeminjaman();
                    break;
                case 9:
                    verifikasiPengembalian();
                    break;
            }
        }while (pilih < 10);
    }
    
    public static void daftarAnggota(){
        int size = anggotaController.showAllData().size();
        System.out.println("Data Daftar Anggota");
        for (int i = 1; i < size; i++){
            System.out.println("" +anggotaController.showAllData().get(i).getId()+ ". "
            + " " +anggotaController.showAllData().get(i).getNama()
            + " " +anggotaController.showAllData().get(i).getPassword()
            + " " +anggotaController.showAllData().get(i).getNoTelp()
            + " " +anggotaController.showAllData().get(i).getAlamat()
            );
        }
    }
    
    public static void hapusAnggota(){
        daftarAnggota();
        System.out.print("Masukkan id yang akan di HAPUS : ");
        int id = input.nextInt();
        adminController.hapusAnggota(id);
    }
    
    public static void resetPasswordAnggota(){
        daftarAnggota();
        System.out.print("Id yang akan di RESET  : ");
        int id = input.nextInt();
        adminController.resetPassAnggota(id);
    }
    
    public static void daftarBuku(){
        int size = bukuController.showAllData().size();
        for(int i = 0; i < size; i++){
            System.out.println((i+1)+ ". " +bukuController.showAllData().get(i).getIsbn()+ " "
            + bukuController.showAllData().get(i).getJudul()+ " "
            + bukuController.showAllData().get(i).getPenerbit()+ " "
            + bukuController.showAllData().get(i).getTerbit()+ " "
            + bukuController.showAllData().get(i).getHalaman()+ " "
            );
        }
    }
    
    public static void tambahDaftarBuku(){
        System.out.print("Isbn Buku            : ");
        String isbn = input.next();
        System.out.print("Judul Buku           : ");
        String judul = input.next();
        judul += input.nextLine();
        System.out.print("Penerbit Buku        : ");
        String penerbit = input.next();
        penerbit += input.nextLine();
        System.out.print("Jumblah Halaman Buku : ");
        int halaman = input.nextInt();
        System.out.print("Tahun Terbit Buku    : ");
        int tgl = input.nextInt();
        bukuController.insertBuku(isbn, judul, penerbit, halaman, tgl);
    } 
    
    public static void hapusBuku(){
        daftarBuku();
        System.out.print("Kode ISBN : ");
        String isbn = input.next();
        bukuController.deleteBuku(isbn);
    } 
    
    public static void ubahBuku(){
        int pilih;
        do{
            System.out.println("1. Ubah Judul Buku");
            System.out.println("2. Ubah Pnerbit Buku");
            System.out.println("3. Kembali ke Menu");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            switch(pilih){
                case 1:
                    daftarBuku();
                    System.out.println("Judul Baru : ");
                    String judul = input.next();
                    judul += input.nextLine();
                    System.out.print("Isbn Buku : ");
                    String isbn = input.next();
                    bukuController.updateBuku(1, judul, isbn);
                    break;
                case 2:
                    daftarBuku();
                    System.out.print("Penerbit Baru : ");
                    String penerbit = input.next();
                    penerbit += input.nextLine();
                    System.out.print("Isbn Buku : ");
                    isbn = input.next();
                    bukuController.updateBuku(2, penerbit, isbn);
                    break;
            }
        }while (pilih < 3);
    } 
    
    public static void lihatDaftarPeminjaman(){
        int size = peminjamanController.showAllData().size();
        for (int i =0; i < size ; i++){
           String status = !peminjamanController.showAllData().get(i).isStatusPeminjaman() ?"Masih dipinjam ":"Telah Kembali ";
           System.out.println((i+1)+". "+peminjamanController.showAllData().get(i).getIdPeminjaman()+" "+
                peminjamanController.showAllData().get(i).getBuku().getIsbn()+" "+
                peminjamanController.showAllData().get(i).getBuku().getJudul()+" "+
                peminjamanController.showAllData().get(i).getAnggota().getNama()+" "+
                peminjamanController.showAllData().get(i).getTglPeminjaman()+" "+
                peminjamanController.showAllData().get(i).getTglpengembalian()+" "+status);
        }
    } 
    
    public static void verifikasiPengembalian(){
        lihatDaftarPeminjaman();
        System.out.println("Id Peminjam : ");
        String idPeminjaman = input.next();
        peminjamanController.verifPengembalian(idPeminjaman);
    } 
    
    public static void menuAnggota(int id){
        int pilih;
        do{
            System.out.println("id");
            System.out.println("1. Lihat Riwayat Peminjaman");
            System.out.println("2. Lakukan Peminjaman");
            System.out.println("3. Edit Data Diri");
            System.out.println("4. Keluar");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            switch(pilih){
                case 1:
                    lihatRiwayatPeminjaman(id);
                    break;
                case 2:
                    pinjamBuku(id);
                    break;
                case 3:
                    editDataAnggota(id);
                    break;
            }
        }while(pilih < 4);
    } 
    
    public static void lihatRiwayatPeminjaman(int id){
        int size = peminjamanController.showDataByPeminjam(id).size();
        for (int i =0; i < size ; i++){
           String status = !peminjamanController.showDataByPeminjam(id).get(i).isStatusPeminjaman() ? "Masih dipinjam ":"Telah Kembali ";
           System.out.println((i+1)+". "+peminjamanController.showDataByPeminjam(id).get(i).getIdPeminjaman()+" "+
                peminjamanController.showDataByPeminjam(id).get(i).getBuku().getJudul()+" "+
                peminjamanController.showDataByPeminjam(id).get(i).getTglPeminjaman()+" "+
                peminjamanController.showDataByPeminjam(id).get(i).getTglpengembalian()+" "+
                status
           );
        }
    } 
    
    public static void pinjamBuku(int id){
        daftarBuku();
        System.out.print("Isbn Buku : ");
        String isbn = input.next();
        BukuEntity buku = bukuController.getData(isbn);
        AnggotaEntity anggota = anggotaController.getByDataId(id);
        peminjamanController.insertPeminjaman(buku, anggota); 
    } 
    
    public static void editDataAnggota(int id){
        int pilih;
        do{
            System.out.println("1. Ubah Password");
            System.out.println("2. Ubah Alamat");
            System.out.println("3. Ubah No Telp");
            System.out.println("4. Keluar");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            if(pilih == 1){
                dataPenggunaById(id);
                System.out.print("Password Baru : ");
                String password = input.next();
                anggotaController.updateAkun(1, password, id);
            }else if(pilih == 2){
                dataPenggunaById(id);
                System.out.print("Ubah Alamat : ");
                String alamat = input.next();
                anggotaController.updateAkun(2, alamat, id);
            }else if(pilih == 3){
                dataPenggunaById(id);
                System.out.print("Ubah No Telp : ");
                String noTelp = input.next();
                anggotaController.updateAkun(3, noTelp, id);
            }
        }while(pilih < 4);

    } 
    public static void dataPenggunaById(int id){
        System.out.println(
                anggotaController.getByDataId(id).getNama()+ " " +
                anggotaController.getByDataId(id).getPassword()+ " " +
                anggotaController.getByDataId(id).getNoTelp()+ " " +
                anggotaController.getByDataId(id).getAlamat()
        );
    }
}