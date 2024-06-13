package com.AndrewCarvajal.Datos;

import com.AndrewCarvajal.ConversoMoneda.Calculos.Conversion;
import com.AndrewCarvajal.ConversorMoneda.Modelos.Moneda;
import com.AndrewCarvajal.ConversorMoneda.Modelos.Opcion;

import java.io.IOException;
import java.util.List;

public class GenerarConversiones {

    public void registrarConversion(String monedaEntrada,String monedaSalida ,List<Moneda>Monedas,List<Conversion>conversiones){
        GenerarPaisesMonedas monedas = new GenerarPaisesMonedas();
        Moneda entrada=monedas.buscarMonedaPorMoneda(monedaEntrada,Monedas);
        Moneda salida=monedas.buscarMonedaPorMoneda(monedaSalida,Monedas);
        Conversion conversion=new Conversion
                (entrada.getAbreviatura(),
                        salida.getAbreviatura(),
                        entrada.getNombreMoneda(),
                        salida.getNombreMoneda(),
                        entrada.getPais(),
                        salida.getPais());
        conversiones.add(conversion);
    }

    public void conversionPorPais(String paisEntrada, String paisSalida , List<Moneda>Monedas,List<Conversion>conversiones) throws IOException, InterruptedException {
        GenerarPaisesMonedas monedas = new GenerarPaisesMonedas();
        Moneda entrada=monedas.buscarMonedaPorPais(paisEntrada,Monedas);
        Moneda salida=monedas.buscarMonedaPorPais(paisSalida,Monedas);
        Conversion conversion=new Conversion
                (entrada.getAbreviatura(),
                salida.getAbreviatura(),
                entrada.getNombreMoneda(),
                salida.getNombreMoneda(),
                entrada.getPais(),
                salida.getPais());
        conversiones.add(conversion);



    }
    public void conversionPorMonedas(String monedaEntrada,String monedaSalida,List<Moneda>Monedas,List<Conversion>conversiones) throws IOException, InterruptedException {
        GenerarPaisesMonedas monedas = new GenerarPaisesMonedas();
        Moneda entrada=monedas.buscarMonedaPorMoneda(monedaEntrada,Monedas);
        Moneda salida=monedas.buscarMonedaPorMoneda(monedaSalida,Monedas);
        Conversion conversion=new Conversion
                (entrada.getAbreviatura(),
                        salida.getAbreviatura(),
                        entrada.getNombreMoneda(),
                        salida.getNombreMoneda(),
                        entrada.getPais(),
                        salida.getPais());
        conversiones.add(conversion);
    }
}
