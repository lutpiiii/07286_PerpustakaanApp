package Entity07286;

public class AdminEntity07286 extends UserAbstractEntity07286{
    int id;
    
    public AdminEntity07286(String nama, String password){
        super(nama, password);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
