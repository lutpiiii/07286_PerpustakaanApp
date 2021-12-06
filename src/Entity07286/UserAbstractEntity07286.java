package Entity07286;

public abstract class UserAbstractEntity07286 {
    protected String nama;
    protected String password;
    
    public UserAbstractEntity07286(String nama, String password){
        this.nama = nama;
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public String getPassword() {
        return password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
