package day01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PositiveNumberContainer positiveNumberContainer = new PositiveNumberContainer();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Szám hozzáadása a listához: ");
            double input = Double.parseDouble(scanner.nextLine());
            if (input <= 0) {
                System.out.println(positiveNumberContainer.getNumList());
                break;
            }else{
                positiveNumberContainer.add(input);
            }
        }
    }
}
