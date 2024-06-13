package com.AndrewCarvajal.ConversorMoneda.Modelos;

public class Opcion{
    private int numeroOpcion;
    private String nombreOpcion;

    public Opcion(String nombreOpcion,int numeroOpcion) {
        this.numeroOpcion=numeroOpcion;
        this.nombreOpcion = nombreOpcion;
    }

    public String getNombreOpcion() {
        return nombreOpcion;
    }
    public int getNumeroOpcion() {
        return numeroOpcion;
    }


    @Override
    public String toString() {
        return getNumeroOpcion() + "-" + getNombreOpcion();
    }
}
