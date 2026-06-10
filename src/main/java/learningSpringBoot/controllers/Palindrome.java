package learningSpringBoot.controllers;

import java.text.Normalizer;

public class Palindrome {

    public static String isPalindrome(String word) {
        if (word == null || word.isEmpty()) {
            return "introduce a Word";
        }

        // Clean the text
        String clean = Normalizer.normalize(word, Normalizer.Form.NFD);
        clean = clean.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

        // Filter: maintain only letter and numbers, normalize to lowercase
        clean = clean.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check the word's chars by storing it in two buffers, then compare the first char with the last one and so on
        int begin = 0;
        int end = clean.length() - 1;

        while (begin < end) {
            if (clean.charAt(begin) != clean.charAt(end)) {
                return "The word '"+word+"'" + " is no Palindrome"; // No palindrome
            }
            begin++;
            end--;
        }

        return "The word '"+word+"'" + " is Palindrome"; // Is palindrome
    }
}
