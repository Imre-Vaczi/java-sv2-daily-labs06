package day02.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String dealerShip;
    private int priceUpperThreshold;
    private List<Car> cars = new ArrayList<>();

    public CarShop(String dealerShip, int priceUpperThreshold) {
        this.dealerShip = dealerShip;
        this.priceUpperThreshold = priceUpperThreshold;
    }

    public boolean addCar(Car car){
        if (car.getPrice() <= priceUpperThreshold){
            cars.add(car);
            return true;
        }else{
            return false;
        }
    }

    public int sumCarPrice(){
        int totalPrice = 0;
        for (Car vehicle : cars){
            totalPrice += vehicle.getPrice();
        }
        return totalPrice;
    }

    public int numberOfCarsCheaperThan(int price){
        int carsBelowThreshold = 0;
        for (Car vehicle : cars){
            if (vehicle.getPrice() < price){
                carsBelowThreshold++;
            }
        }
        return carsBelowThreshold;
    }

    public List<Car> carsWithBrand(String brand){
        List<Car> carsOfBrand = new ArrayList<>();
        for (Car vehicle : cars){
            if (brand.equals(vehicle.getBrand())){
                carsOfBrand.add(vehicle);
            }
        }
        return carsOfBrand;
    }

    public List<Car> getCarsForSell(){
        return this.cars;
    }

    public String getDealerShip() {
        return dealerShip;
    }

    public int getPriceUpperThreshold() {
        return priceUpperThreshold;
    }

    public List<Car> getCars() {
        return cars;
    }
}