package day03;

import java.util.Arrays;
import java.util.Random;

public class Methods {
    public int roundNumber(int input) {
        int temp = Integer.parseInt(String.valueOf(Integer.toString(input).charAt( Integer.toString(input).length()-1 )));
            switch (temp) {
                case 0, 5:
                    return input;
                case 1, 2, 3, 4:
                    return input - temp;
                case 6, 7, 8, 9:
                    return input + (10 - temp);
            }
        return input;
    }
    public int[] generateArrayWithEvens() {
        int[] result = new int [5];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(10000)*2 +1;
        }
        return result;
    }

    public static void main(String[] args) {
        Methods methods = new Methods();
        System.out.println(methods.roundNumber(136));
        System.out.println(methods.roundNumber(137));
        System.out.println(methods.roundNumber(138));
        System.out.println(methods.roundNumber(139));
        System.out.println(methods.roundNumber(140));
        System.out.println(methods.roundNumber(141));
        System.out.println(methods.roundNumber(142));
        System.out.println(methods.roundNumber(143));
        System.out.println(methods.roundNumber(144));
        System.out.println(methods.roundNumber(145));
        System.out.println();
        System.out.println(Arrays.toString(methods.generateArrayWithEvens()));
    }
}
