package Entity07286;

public class AnggotaEntity07286 extends UserAbstractEntity07286{
    private String noTelp;
    private String alamat;
    private int id;
    
    public AnggotaEntity07286(String nama, String password, String noTelp, String alamat){
        super(nama, password);
        this.noTelp = noTelp;
        this.alamat = alamat;
    }
    
    public AnggotaEntity07286(String nama, String password){
        super(nama, password);
    }

    public String getNoTelp() {
        return noTelp;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getId() {
        return id;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
