package entidades;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellidos;
    protected java.util.GregorianCalendar fechaIngreso;

    public Empleado () {
        dni = "00000000";
        nombre = "NN";
        apellidos = "NA";
        fechaIngreso = new java.util.GregorianCalendar(1800,0,1);
    }

    public Empleado (String dni, String nombre, String apellidos, java.util.GregorianCalendar fechaIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaIngreso = fechaIngreso;
    }

    public void setDni (String dni) {
        this.dni = dni;
    }

    public String getDni () {
        return dni;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre () {
        return nombre;
    }

    public void setApellidos (String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos () {
        return apellidos;
    }

    public void setFechaIngreso (java.util.GregorianCalendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public java.util.GregorianCalendar getFechaIngreso () {
        return fechaIngreso;
    }

    @Override
    public String toString () {
        int dia, mes, año;
        dia = getFechaIngreso().get(java.util.Calendar.DAY_OF_MONTH);
        mes = getFechaIngreso().get(java.util.Calendar.MONTH)+1;
        año = getFechaIngreso().get(java.util.Calendar.YEAR);
        return "DNI: " + getDni() + "\nNombre y Apellidos: " + getNombre() + 
               " " + getApellidos() + "\nFecha de ingreso: " + 
               (dia<=9?"0"+dia:dia) + "/" + (mes<=9?"0"+mes:mes) + "/" + año;
    }
}