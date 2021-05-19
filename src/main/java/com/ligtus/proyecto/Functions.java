package com.ligtus.proyecto;

public class Functions{
    public String countLetters(String word){
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
}