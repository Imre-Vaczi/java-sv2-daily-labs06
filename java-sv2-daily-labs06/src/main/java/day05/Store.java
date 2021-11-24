package day05;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product prod) {
        productList.add(prod);
    }

    public String getDetailsPerEnum() {
        int num_FRUITS = 0;
        int num_POULTRY = 0;
        int num_GRAINS = 0;
        int num_DIARY = 0;
        for (Product item : productList) {
            switch (item.getFoodType()) {
                case DIARY:
                    num_DIARY++;
                    break;
                case FRUITS:
                    num_FRUITS++;
                    break;
                case GRAINS:
                    num_GRAINS++;
                    break;
                case POULTRY:
                    num_POULTRY++;
                    break;
            }
        }
        return "FRUITS: "+ num_FRUITS+"\nPOULTRY: " + num_POULTRY+"\nGRAINS: "+num_GRAINS+"\nDIARY: " + num_DIARY;
    }

    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Product("eper", FoodType.FRUITS, 30.3));
        store.addProduct(new Product("szilva", FoodType.FRUITS, 20.3));
        store.addProduct(new Product("tej", FoodType.DIARY, 3.3));
        store.addProduct(new Product("hajdina", FoodType.GRAINS, 10.3));
        System.out.println(store.getDetailsPerEnum());
    }
}
