package com.AndrewCarvajal.ConexionApi;

import java.io.IOException;
import java.net.ConnectException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionAPI {

    private final String apiUri;
    private final HttpClient client;


    public ConexionAPI(String apiUri) {
        this.apiUri = apiUri;
        this.client = HttpClient.newHttpClient();
    }


    public String realizarSolicitudGet() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUri))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        }
        catch (ConnectException e){
            System.out.println("No pude acceder al api de cambio de monedas por problemas de internet");
            return "Ocurrio un error";
        }
    }



}
