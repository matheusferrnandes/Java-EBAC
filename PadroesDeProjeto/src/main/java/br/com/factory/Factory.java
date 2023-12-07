package br.com.factory;

public abstract class Factory {

    public Car create(String requestGrade){
          Car car = retrieveCar(requestGrade);
          car = prepararCar(car);
          return car;
    }

    private Car prepararCar(Car car) {
        car.clean();
        car.mechanicChek();
        car.fuelCar();
        return car;
    }

    abstract Car retrieveCar(String requestGrade);

}
