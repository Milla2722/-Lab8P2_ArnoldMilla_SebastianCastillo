import java.io.Serializable;
import java.util.ArrayList;

public class Torneo implements Serializable{
    private String nombre;
    private boolean terminado, entry;
    private ArrayList<Participante> participantes;
    private Participante p;
    public Torneo() {
    }

    public Torneo(String nombre, boolean terminado, boolean entry, ArrayList<Participante> participantes) {
        this.nombre = nombre;
        this.terminado = terminado;
        this.entry = entry;
        this.participantes = participantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    public boolean isEntry() {
        return entry;
    }

    public void setEntry(boolean entry) {
        this.entry = entry;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

    public Participante getP() {
        return p;
    }

    public void setP(Participante p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
}
