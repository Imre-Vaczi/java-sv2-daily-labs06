package day02.numbers;

public class PerfectNumbers {

    private int getFactors(int number){
        int sumOfFactors = 0;
        for (int i = 1; i < number; i ++){
            if (number % i == 0){
                sumOfFactors += i;
            }
        }
        return  sumOfFactors;
    }

    public boolean isPerfectNumber(int number){
        return getFactors(number) == number;
    }
}