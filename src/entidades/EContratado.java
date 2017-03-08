package entidades;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class EContratado extends Empleado {
    private float salarioB;

    public EContratado () {
        super();
        salarioB = 0.0f;
    }

    public EContratado (String dni, String nombre, String apellidos, java.util.GregorianCalendar fechaIngreso, float salarioB) {
        super(dni, nombre, apellidos, fechaIngreso);
        this.salarioB = salarioB;
    }

    public void setSalario (float salarioB) {
        this.salarioB = salarioB;
    }

    public float getSalario () {
        GregorianCalendar Actual = new GregorianCalendar();
        int anios = Actual.get(Calendar.YEAR) - fechaIngreso.get(Calendar.YEAR);
        if(fechaIngreso.get(Calendar.MONTH)>Actual.get(Calendar.MONTH)
           || fechaIngreso.get(Calendar.MONTH)==Actual.get(Calendar.MONTH)
              && fechaIngreso.get(Calendar.DAY_OF_MONTH)>Actual.get(Calendar.DAY_OF_MONTH)
          ) anios--;
        switch(anios)
        {
            case 0: // break;
            case 1:
            case 2:
            case 3: return 1.05f*salarioB;
            case 4: 
            case 5:
            case 6:
            case 7: return 1.10f*salarioB;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15: return 1.15f*salarioB;
            default: return 1.20f*salarioB;
        }
    }

    @Override
    public String toString () {
        return super.toString() + "\nSalario: " + getSalario();
    }
}