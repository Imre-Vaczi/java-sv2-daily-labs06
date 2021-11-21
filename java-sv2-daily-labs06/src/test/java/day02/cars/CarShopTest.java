package day02.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarShopTest {

    Car car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
    Car car2 = new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000);
    CarShop carShop = new CarShop("Best Car", 10_000_000);

    @Test
    void testAddingCarsValid(){
        boolean toTest = carShop.addCar(car1);
        assertEquals(true, toTest);
    }
    @Test
    void testAddingCarsInValid(){
        boolean toTest = carShop.addCar(car2);
        assertEquals(false, toTest);
    }
}