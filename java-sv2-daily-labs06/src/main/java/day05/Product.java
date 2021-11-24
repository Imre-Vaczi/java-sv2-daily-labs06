package day05;

public class Product {
    private String name;
    private FoodType foodType;
    private double price;

    public Product(String name, FoodType foodType, double price) {
        this.name = name;
        this.foodType = foodType;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public double getPrice() {
        return price;
    }
}
