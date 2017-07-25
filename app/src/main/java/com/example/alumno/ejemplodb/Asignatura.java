package com.example.alumno.ejemplodb;

/**
 * Created by alumno on 24/07/2017.
 */

public class Asignatura {


    private int codigo, cantidadestudiantes;
    private String nombre;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidadestudiantes() {
        return cantidadestudiantes;
    }

    public void setCantidadestudiantes(int cantidadestudiantes) {
        this.cantidadestudiantes = cantidadestudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura(int codigo, int cantidadestudiantes, String nombre) {
        this.codigo = codigo;
        this.cantidadestudiantes = cantidadestudiantes;
        this.nombre = nombre;


        public String toString(){

        return "codigo: " + codigo +
                "nombre: " + nombre +
                "cantEstudiantes: " + cantidadestudiantes;



    }
}
