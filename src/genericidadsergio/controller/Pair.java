package genericidadsergio.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author sergiopro
 */
public class Pair <T, U>{
    
    private T nombre;
    private U[] datos;
    private static List<Pair> guardados= new ArrayList<>();

    public Pair(T nombre, U[] datos) {
        this.nombre = nombre;
        this.datos = datos;
    }

    public T getNombre() {
        return nombre;
    }

    public U[] getDatos() {
        return datos;
    }

    public static ArrayList getGuardados() {
        return (ArrayList) guardados;
    }
    
    public static void setGuardados(Pair guardado) {
        guardados.add(guardado);
        
    } 

    @Override
    public String toString() {
        return (String) nombre + Arrays.toString(datos);
    }  
}
