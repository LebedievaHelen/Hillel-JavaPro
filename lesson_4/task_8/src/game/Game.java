package game;

public class Game {

    private final String[] WORDS = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
            "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
            "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
            "pineapple", "pumpkin", "potato"};

    int n = (int) Math.floor(Math.random() * WORDS.length);
    private final String COMPUTERWORD = WORDS[n];

    public void guessSymbols(String COMPUTERWORD, String userWord) {
        StringBuilder mascWord = new StringBuilder("###############");
        int compareResult = Math.min(COMPUTERWORD.length(), userWord.length());
        for (int i = 0; i < compareResult; i++) {
            if (COMPUTERWORD.charAt(i) == userWord.charAt(i)) {
                mascWord.setCharAt(i, userWord.charAt(i));
            }
        }
        System.out.println("Wrong. You guessed next symbols:" + "\n" + mascWord + "\n" + "Keep going.");
    }

    public String getComputerWord() {
        return COMPUTERWORD;
    }
}
