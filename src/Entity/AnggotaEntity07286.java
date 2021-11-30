package Entity;

public class AnggotaEntity07286 extends UserEntityAbstract07286{
    private String noTelp;
    private String alamat;
    private int id;
    
    public void AnggotaEntity07286(String nama, String password, String noTelp, String alamat){
        this.noTelp = noTelp;
        this.alamat = alamat;
    }
    
    public void AnggotaEntity07286(String nama, String pass){
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
