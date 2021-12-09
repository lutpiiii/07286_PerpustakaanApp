import Controller07286.AdminControllerInterface07286;
import Controller07286.AdminControllerInterfaceImp;
import Controller07286.AnggotaControllerImp07286;
import Controller07286.AnggotaControllerInterface07286;
import Controller07286.BukuController07286;
import Controller07286.BukuControllerInterface07286;
import Controller07286.PeminjamanControllerImp;
import Controller07286.PeminjamanControllerInterface;
import java.util.Scanner;

public class PerpustakaanApp07286 {
    public static Scanner input = new Scanner(System.in);
    public static AdminControllerInterface07286 adminCon = new AdminControllerInterfaceImp();
    public static AnggotaControllerInterface07286 anggotaCon = new AnggotaControllerImp07286();
    public static BukuControllerInterface07286 bukuCon = new BukuController07286();
    public static PeminjamanControllerInterface peminjamanCon = new PeminjamanControllerImp();
    public static String nama, password, noTelp, alamat;
    public static String username, pass;
    
    public static void main(String[] args) {
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
        nama = input.nextLine();
        System.out.print("Password  : ");
        password = input.nextLine();
        System.out.print("No Telpon : ");
        noTelp = input.nextLine();
        System.out.print("Alamat    : ");
        alamat = input.nextLine();
        anggotaCon.inserAnggota(nama, password, noTelp, alamat);
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
        username = input.next();
        System.out.print("Password : ");
        pass = input.next();
        if(adminCon.login(username, pass)){
            menuAdmin();
        }else{
            System.out.println("Username atau Password salah");
        }
    }
    
    public static void loginAnggota(){
        System.out.print("Username : ");
        username = input.next();
        System.out.print("Password : ");
        pass = input.next();
        if(anggotaCon.login(username, pass) != 0){
            int id = anggotaCon.login(username, pass);
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
                    resetPassAnggota();
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
                    lihatDaftarPeminjam();
                    break;
                case 9:
                    verifikasiPengembalian();
                    break;
            }
        }while (pilih <= 10);
    }
    
    public static void daftarAnggota(){
        int size = anggotaCon.showAllData().size();
        System.out.println("Data Daftar Anggota");
        for (int i = 1; i < size; i++){
            System.out.println((i+1)+". " +anggotaCon.showAllData().get(i).getId()+ ". "
            + anggotaCon.showAllData().get(i).getNama()
            + anggotaCon.showAllData().get(i).getPassword()
            + anggotaCon.showAllData().get(i).getNoTelp()
            + anggotaCon.showAllData().get(i).getAlamat()
            );
        }
    }
    
    public static void hapusAnggota(){
        daftarAnggota();
        System.out.print("Masukkan id yang akan di HAPUS : ");
        int id = input.nextInt();
        adminCon.hapusAnggota(id);
    }
    
    public static void resetPassAnggota(){
        daftarAnggota();
        System.out.print("Id yang akan di RESET  : ");
        int id = input.nextInt();
        adminCon.resetPassAnggota(id);
    }
    
    public static void daftarBuku(){
        int size = bukuCon.showAllData().size();
        for(int i = 0; i < size; i++){
            System.out.println((i+1)+ ". " +bukuCon.showAllData().get(i).getIsbn()+ " "
            + bukuCon.showAllData().get(i).getJudul()+ " "
            + bukuCon.showAllData().get(i).getPenerbit()+ " "
            + bukuCon.showAllData().get(i).getTerbit()+ " "
            + bukuCon.showAllData().get(i).getHalaman()+ " "
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
        bukuCon.insertBuku(isbn, judul, penerbit, halaman, tgl);
    }
    
    public static void hapusBuku(){
        daftarBuku();
        System.out.print("Kode ISBN : ");
        String isbn = input.next();
        bukuCon.deleteBuku(isbn);
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
                    bukuCon.updateBuku(1, isbn, judul);
                    break;
                case 2:
                    daftarBuku();
                    System.out.print("Penerbit Baru : ");
                    String penerbit = input.next();
                    penerbit += input.nextLine();
                    System.out.print("Isbn Buku : ");
                    isbn = input.next();
                    bukuCon.updateBuku(2, isbn, penerbit);
                    break;
            }
        }while (pilih < 3);
    }
    
    public static void lihatDaftarPeminjam(){
        
    }
    
    public static void verifikasiPengembalian(){
        
    }
    
    public static void menuAnggota(int id){
        
    }
    
    public static void riwayaPeminjaman(int id){
        
    }
    
    public static void pinjamBuku(int id){
        
    }
    
    public static void editDataAnggota(int id){
        
    }
    
    public static void dataPenggunaById(int id){
        
    }
}
