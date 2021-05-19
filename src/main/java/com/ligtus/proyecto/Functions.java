package com.ligtus.proyecto;

public class Functions{
    public static String countLetters(String word){
        int lower=0, upper=0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upper++;
            } else if (Character.isLowerCase(word.charAt(i))){
                lower++;
            }
        }

        return word + " tiene " + lower + " minúsculas y " + upper + " mayúsculas.";
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