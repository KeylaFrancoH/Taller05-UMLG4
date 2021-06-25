import java.util.Date;

public class Persona {
    protected String Usuario;
    protected String clave;
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String direccion;
    protected Date fechaNac;
    private Administrador admin;

    public boolean login() {
        return false;
    }

    public boolean logOut() {
        return false;
    }
}