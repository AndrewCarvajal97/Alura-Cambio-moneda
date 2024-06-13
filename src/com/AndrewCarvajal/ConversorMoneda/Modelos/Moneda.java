package com.AndrewCarvajal.ConversorMoneda.Modelos;

public class Moneda {
    private String nombreMoneda;
    private String pais;
    private String abreviatura;

    public Moneda(String nombreMoneda,String abreviatura, String pais ) {
        this.nombreMoneda = nombreMoneda;
        this.pais = pais;
        this.abreviatura = abreviatura;
    }

    public String getNombreMoneda() {
        return nombreMoneda;
    }

    public String getPais() {
        return pais;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    @Override
    public String toString() {
        return "la moneda:"+ getNombreMoneda()+"("+getAbreviatura()+")" + "se usa principal mente en: "+getPais();
    }
}
