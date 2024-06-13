package com.AndrewCarvajal.ConversorMoneda.Modelos;

public class Pais {
    private String nombrePais;
    private Moneda monedaPais;

    public Pais(String nombrePais, Moneda monedaPais) {
        this.nombrePais = nombrePais;
        this.monedaPais = monedaPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public Moneda getMonedaPais() {
        return monedaPais;
    }

    @Override
    public String toString() {
        return "El pais: "+getNombrePais()+" principalmente usa la moneda :"+getMonedaPais().getNombreMoneda()+"("+getMonedaPais().getAbreviatura()+")" ;
    }
}
