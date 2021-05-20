package com.ligtus.proyecto;

public class Functions{
    public static String countLetters(String word){
        int vow=0, cons=0;
        String vowels = "aeiou";
        boolean isVow = false;
        for (int i = 0; i < word.length(); i++) {
            isVow = false;
            for (int j = 0; j < vowels.length(); j++) {
                if (Character.toLowerCase(word.charAt(i)) == vowels.charAt(j)) {
                    vow++;
                    isVow = true;
                    break;
                }
            }
            if (!isVow) {
                cons++;
            }
        }

        return word + " tiene " + vow + " vocales y " + cons + " consonantes.";
    }

    public static String alternateCaps(String text) {
        boolean caps = true;
        String result = "";
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = "";
            for (int j = 0; j < words[i].length(); j++) {
                if (caps) {
                    word += words[i].toUpperCase().charAt(j);
                    caps = false;
                } else {
                    word += words[i].toLowerCase().charAt(j);
                    caps = true;
                }
            }
            words[i] = word + " ";
            result += words[i];
        }
        return result;
    }
}