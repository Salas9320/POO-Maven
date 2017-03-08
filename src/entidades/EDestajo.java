package entidades;

public class EDestajo extends Empleado {
    private int clientesCaptados;
    public static final float salarioD = 130.05f;

    public EDestajo () {
        super();
        clientesCaptados = 0;
    }

    public EDestajo (String dni, String nombre, String apellidos, java.util.GregorianCalendar fechaIngreso, int clientesCaptados) {
        super(dni, nombre, apellidos, fechaIngreso);
        this.clientesCaptados = clientesCaptados;
    }

    public void setClientesCaptados (int clientesCaptados) {
        this.clientesCaptados = clientesCaptados;        
    }

    public int getClientesCaptados () {
        return clientesCaptados;
    }
    
    public float getSalario () {
        return salarioD*clientesCaptados;
    }

    @Override
    public String toString () {
        return super.toString() + "\nSalario: " + getSalario();
    }
}