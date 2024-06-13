package com.AndrewCarvajal.Datos;

import com.AndrewCarvajal.ConversoMoneda.Calculos.Conversion;
import com.AndrewCarvajal.ConversorMoneda.Modelos.Moneda;
import com.AndrewCarvajal.ConversorMoneda.Modelos.Opcion;

import java.io.IOException;
import java.util.List;

public class GenerarOpciones {
    public void generarOpciones(List<Opcion> menu, List<Moneda>Monedas, List<Conversion> conversiones ) throws IOException, InterruptedException {
        int contador=0;

        String [][] opciones={
                {"Realizar conversion buscando por el nombre del pais",null,null},
                {"Dólar estadounidense =>> Peso Argentino","Dólar estadounidense","Peso Argentino"},
                {"Peso Argentino =>> Dólar estadounidense","Peso Argentino","Dólar estadounidense"},
                {"Dólar estadounidense =>> Real Brasileño","Dólar estadounidense","Real Brasileño"},
                {"Real Brasileño =>> Dólar estadounidense ","Real Brasileño","Dólar estadounidense"},
                {"Dólar estadounidense =>> Peso Colombiano","Dólar estadounidense","Peso Colombiano"},
                {"Peso Colombiano =>> Dólar estadounidense","Peso Colombiano","Dólar estadounidense"},
                {"Salir",null,null}};



        for (String[] row:opciones) {

            Opcion opcion= new Opcion(row[0],contador);
            menu.add(opcion);
            GenerarConversiones converciones=new GenerarConversiones();
            if (row[1]!=null){
                converciones.conversionPorMonedas(row[1],row[2],Monedas,conversiones);

                }
            contador+=1;
        }

    }
}
