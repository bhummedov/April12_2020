package Collection;

import java.util.ArrayList;

public class HW_Collection {
    public static void main(String[] args) {
        String letter = "abcdefghijklmnouprstvuyz";

        ArrayList<String> words = new ArrayList<>();
        String word;

        for (int i = 0; i < 100; i++) {
            word = "";
            while (word.length() < 5) {

                while (word.length() < 1) {
                    char c = letter.charAt((int) (Math.random() * letter.length()));
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') word += c;
                    word = word.toUpperCase();
                }

                char c = letter.charAt((int) (Math.random() * letter.length()));
                word += c;
            }
            words.add(word);
        }

        System.out.println(words);

    }
}
