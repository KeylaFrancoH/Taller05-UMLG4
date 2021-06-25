import java.util.ArrayList;

public class Paciente {
    protected String email;
    private ArrayList<Cita> cita;
    private ArrayList<HistoriaClinica> historiaC;
    private ArrayList<Receta> receta;
    public boolean solicitarCita(){
        return false;
    }
}
