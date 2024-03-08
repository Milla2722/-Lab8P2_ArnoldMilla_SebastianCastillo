
import java.util.ArrayList;

public class Participante extends Usuario{
    private ArrayList <Torneo> torneosPart;
    private ArrayList <Torneo> torneosWin;

    public Participante() {
    }

    public Participante(ArrayList<Torneo> torneosPart, ArrayList<Torneo> torneosWin, String nombre, String password) {
        super(nombre, password);
        this.torneosPart = torneosPart;
        this.torneosWin = torneosWin;
    }

    public ArrayList<Torneo> getTorneosPart() {
        return torneosPart;
    }

    public void setTorneosPart(ArrayList<Torneo> torneosPart) {
        this.torneosPart = torneosPart;
    }

    public ArrayList<Torneo> getTorneosWin() {
        return torneosWin;
    }

    public void setTorneosWin(ArrayList<Torneo> torneosWin) {
        this.torneosWin = torneosWin;
    }
    
    
}
