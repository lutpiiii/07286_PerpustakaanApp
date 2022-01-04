package Entity;

public abstract class UserAbstractEntity {
    protected String nama;
    protected String password;
    
    public UserAbstractEntity(String nama, String password) {
        this.nama = nama;
        this.password = password;
    }public String getNama() {
        return nama;
    }public void setNama(String nama) {
        this.nama = nama;
    }public String getPassword() {
        return password;
    }public void setPassword(String password) {
        this.password = password;
    }   
}
