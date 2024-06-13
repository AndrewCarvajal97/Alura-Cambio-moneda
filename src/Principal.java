import com.AndrewCarvajal.ConexionApi.ConexionAPI;
import com.AndrewCarvajal.ConversoMoneda.Calculos.Conversion;
import com.AndrewCarvajal.ConversorMoneda.Modelos.Moneda;
import com.AndrewCarvajal.ConversorMoneda.Modelos.Opcion;
import com.AndrewCarvajal.ConversorMoneda.Modelos.Pais;
import com.AndrewCarvajal.Datos.GenerarConversiones;
import com.AndrewCarvajal.Datos.GenerarOpciones;
import com.AndrewCarvajal.Datos.GenerarPaisesMonedas;
import com.google.gson.Gson;


import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        List<Opcion>menu=new ArrayList<>();
        List<Conversion>conversiones=new ArrayList<>();
        List<Moneda>Monedas=new ArrayList<>();
        List<Pais>Paises=new ArrayList<>();
        GenerarPaisesMonedas generarMonedas=new GenerarPaisesMonedas();
        generarMonedas.generarMonedas(Monedas,Paises);
        GenerarOpciones generarMenu =new GenerarOpciones();
        generarMenu.generarOpciones(menu,Monedas,conversiones);

        int eleccion=10;

        while (eleccion!=7){
            Scanner scanner =new Scanner(System.in);
            System.out.println("********************************************************");
            System.out.println("Sea bienvenido/a al conversor de moneda =]");
            System.out.println("");
            for (int i = 0; i <menu.size() ; i++) {
                System.out.println(menu.get(i));
            }
            System.out.println("Elija una opcion valida:");
            eleccion=scanner.nextInt();
            switch (eleccion){
                case 0:
                    System.out.println("no hacemos nada aun");

                    break;
                case 1:
                    conversiones.get(0).calcularConversion();
                    System.out.println(conversiones.get(0));

                    break;
                case 2:
                    conversiones.get(1).calcularConversion();
                    System.out.println(conversiones.get(1));

                    break;
                case 3:
                    conversiones.get(2).calcularConversion();
                    System.out.println(conversiones.get(2));

                    break;
                case 4:
                    conversiones.get(3).calcularConversion();
                    System.out.println(conversiones.get(3));

                    break;
                case 5:
                    conversiones.get(4).calcularConversion();
                    System.out.println(conversiones.get(4));

                    break;
                case 6:
                    conversiones.get(5).calcularConversion();
                    System.out.println(conversiones.get(5));
                    break;

            }
            eleccion =9;

        }

    }
}

