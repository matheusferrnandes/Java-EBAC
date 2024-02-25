package org.example;

import java.util.List;
import java.util.ArrayList;

class Carro{
    private String marcas;

    public Carro (String marcas){
        this.marcas = marcas;

    }
    public String getMarcas(){
        return marcas;
    }
}

public class Main {
    public static void Main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Toyota"));
        listaCarros.add(new Carro("Hyundai"));
        listaCarros.add(new Carro("Audi"));

        for (Carro carro : listaCarros) {
            System.out.println("Marca do Carro: " + carro.getMarcas());
        }
    }
}