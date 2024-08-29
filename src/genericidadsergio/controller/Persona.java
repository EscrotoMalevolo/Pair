package genericidadsergio.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private Integer edad;
    private String  eps;
    private LocalDate fecha;
    private static List<Persona> personas= new ArrayList<>();

    public Persona(String nombre, Integer edad, String eps, LocalDate fecha) {
        this.nombre = nombre;
        this.edad = edad;
        this.eps = eps;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getEps() {
        return eps;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Persona> getPersonas() {
        return (ArrayList<Persona>) personas;
    }

    public static void setPersonas(Persona personita) {
        personas.add(personita);
    } 
}
