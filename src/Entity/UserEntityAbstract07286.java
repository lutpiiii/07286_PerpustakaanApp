package Entity;

public abstract class UserEntityAbstract07286 {
    protected String nama, pass;
    
    public UserEntityAbstract07286(){    
    }

    public UserEntityAbstract07286 (String nama, String pass){
        this.nama=nama;
        this.pass=pass;
    }

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }

    public String getPass(){
        return pass;
    }
    public void setPass(String pass){
        this.pass=pass;
    }
}