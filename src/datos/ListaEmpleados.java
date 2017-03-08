package datos;

import entidades.Empleado; 
import java.util.ArrayList; 

public class ListaEmpleados {
    private ArrayList listaE;
    private int posicion; // Última posición.

    public ListaEmpleados () {
        listaE = new ArrayList();
        posicion = -1;
    }

    public void addEmpleado (Empleado empleado) {
        listaE.add(empleado);
        ++posicion;
    }

    public Empleado getEmpleado (int pos) {
        if(pos>=0 && pos<=posicion)
            return (Empleado) listaE.get(pos);
        return null;
    }

    public int getPosicion () {
        return posicion;
    }

 
    public String toString () {
        String cadena = "";
        for(int i=0; i<=posicion; i++)
            cadena += "\n\tEmpleado " + (i+1) + ":\n" + listaE.get(i);
        return cadena;
    }
}