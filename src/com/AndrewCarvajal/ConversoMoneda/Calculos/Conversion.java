package com.AndrewCarvajal.ConversoMoneda.Calculos;

import com.AndrewCarvajal.ConexionApi.ConexionAPI;
import com.AndrewCarvajal.ConversorMoneda.Modelos.ConversionOMDB;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;

import java.io.IOException;
import java.net.ConnectException;
import java.util.Scanner;

public class Conversion {
    private String monedaEntrada;
    private String monedaSalida;
    private String paisEntrada;
    private String paisSalida;
    private String codigoMonedaEntrada;
    private String codigoMonedaSalida;
    private double valorConversion;
    private double tasaConversion;


    public Conversion() {
    }

    public Conversion(String codigoMonedaEntrada, String codigoMonedaSalida, String monedaEntrada, String monedaSalida, String paisEntrada, String paisSalida) {
        this.codigoMonedaEntrada = codigoMonedaEntrada;
        this.codigoMonedaSalida = codigoMonedaSalida;
        this.monedaEntrada = monedaEntrada;
        this.monedaSalida = monedaSalida;
        this.paisEntrada = paisEntrada;
        this.paisSalida = paisSalida;
    }

    public void setMonedaEntrada(String monedaEntrada) {
        this.monedaEntrada = monedaEntrada;
    }

    public void setMonedaSalida(String monedaSalida) {
        this.monedaSalida = monedaSalida;
    }

    public void setPaisEntrada(String paisEntrada) {
        this.paisEntrada = paisEntrada;
    }

    public void setPaisSalida(String paisSalida) {
        this.paisSalida = paisSalida;
    }



    public String getMonedaEntrada() {
        return monedaEntrada;
    }

    public String getMonedaSalida() {
        return monedaSalida;
    }

    public String getPaisEntrada() {
        return paisEntrada;
    }

    public String getPaisSalida() {
        return paisSalida;
    }

    public String getCodigoMonedaEntrada() {
        return codigoMonedaEntrada;
    }

    public String getCodigoMonedaSalida() {
        return codigoMonedaSalida;
    }

    public double getValorConversion() {
        return valorConversion;
    }

    public double getTasaConversion() {
        return tasaConversion;
    }

    public void setTasaConversion(double tasaConversion) {
        this.tasaConversion = tasaConversion;
    }

    public void setValorConversion(double valorConversion) {
        this.valorConversion = valorConversion;
    }



    public Void calcularConversion () throws IOException, InterruptedException {
        Scanner scannerConversion =new Scanner(System.in);
        System.out.println("Ingrese el valor de " + monedaEntrada +" que desea convertir a "+monedaSalida);
        double valorConvertir=scannerConversion.nextDouble();
        String conversionUrl="https://v6.exchangerate-api.com/v6/87124616bdc1e4aa99830ec0/pair"+"/"+codigoMonedaEntrada+"/"+codigoMonedaSalida + "/"+valorConvertir;
        ConexionAPI conversionPares =new ConexionAPI(conversionUrl);
        try{
        String body= conversionPares.realizarSolicitudGet();
        Gson gson=new Gson();
        ConversionOMDB miConversionOMDB =gson.fromJson(body,ConversionOMDB.class);
        setValorConversion(miConversionOMDB.conversion_result());
        setTasaConversion(miConversionOMDB.conversion_rate());
        return null;}
        catch (JsonSyntaxException e){
            System.out.println("no tenemos internet ");
            return null;
        }
    }

    @Override
    public String toString() {
        return "el resultado de la conversion de " + monedaEntrada +" a =>>" + monedaSalida+ " es de : "+ getValorConversion()+
                " y su tasa de conversion fue de : "+tasaConversion;

    }
}
