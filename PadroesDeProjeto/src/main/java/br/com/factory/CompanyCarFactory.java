package br.com.factory;

public class CompanyCarFactory extends Factory{
    @Override
    Car retrieveCar(String requestGrade) {
        switch (requestGrade){
            case "A":
                return new Tesla(1000, "full", "blue");
            case "B":
                return new Honda(800, "full", "red");
            default:
                System.out.println("O carro solicitado nao foi avaliado");
                return null;

        }
    }
}
