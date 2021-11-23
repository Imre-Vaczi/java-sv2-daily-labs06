package day04.hangman;

import java.util.Scanner;

public class HangmanMain {

    private String wordToFind = "example";
    private String wordFound = "_______";
    private int chances = 8;

    public static void main(String[] args) {
        new HangmanMain().run();
    }

    private void run() {

        while (!(wordFound.equals(wordToFind)) && chances != 0) {
            System.out.println("Itt tartasz: " + wordFound);
            System.out.println("Ennyit tippelhetsz még: " + chances);
            System.out.println("Mi a következő tipped?");

            Scanner scanner = new Scanner(System.in);
            String guess = scanner.nextLine();

            if (wordToFind.contains(guess)) {
                System.out.println("Jó tipp!");
                wordFound = updateWordFound(wordToFind, wordFound, guess);
            }else {
                System.out.println("Rossz tipp!");
                chances--;
            }
        }
        if (wordFound.equals(wordToFind)) {
            System.out.println("Nyertél, a keresett szó: " + wordFound);
        } else {
            System.out.println("Legközelebb! A keresett szó: " + wordFound);
        }


    }

    private String updateWordFound(String wordToFind, String status, String guess) {
        char[] chars = status.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                chars[i] = guess.charAt(0);
            }
        }
        return new String(chars);
    }
}
