import java.sql.Date;

public class PagoTarjeta implements Pago {
    protected float monto;
    protected String numero;
    protected Date expira;
    protected String propietario;
    protected String banco;
    @Override
    public boolean realizarPago() {
        // TODO Auto-generated method stub
        return false;
    }
    
}
