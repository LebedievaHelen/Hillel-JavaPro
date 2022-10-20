package game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Game game = new Game();

        System.out.println("Computer guessed the word. What is this word?");

        while (true) {
            String userWord = scanner.next().toLowerCase();
            System.out.println("Your answer: " + userWord);
            if (userWord.equals(game.getComputerWord())) {
                System.out.println("Congratulations! You guessed the word!");
            } else {
                game.guessSymbols(game.getComputerWord(), userWord);
            }
        }
    }
}




