package br.com.factory;

public class Car {

    private int horsePower;
    private String fuelSoucer;
    private String color;

    public Car (int horsePower, String fuelSoucer, String color){
        this.horsePower = horsePower;
        this.fuelSoucer = fuelSoucer;
        this.color = color;

    }

    public void StartEngine(){
        System.out.println("The"+ fuelSoucer + "engine has been started, and is ready to utilize" + horsePower);
    }
    public void clean() {
        System.out.println("Car has been cleaned, and the color" + color.toLowerCase() + "color shines");
    }
    public void mechanicChek() {
        System.out.println("Car has been checkout the mechanic");
    }
    public void fuelCar() {
        System.out.println("Car is being filled with"+ fuelSoucer.toLowerCase());
    }
}
