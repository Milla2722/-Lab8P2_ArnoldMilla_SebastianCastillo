public class Admin extends Usuario{
    int cantTorney;

    public Admin() {
    }

    public Admin(int cantTorney) {
        this.cantTorney = cantTorney;
    }

    public Admin(int cantTorney, String nombre, String password) {
        super(nombre, password);
        this.cantTorney = cantTorney;
    }

    public int getCantTorney() {
        return cantTorney;
    }

    public void setCantTorney(int cantTorney) {
        this.cantTorney = cantTorney;
    }
    
    
}
