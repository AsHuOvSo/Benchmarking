package com.example.benchmarking;

public class Reverse {

    public String ReverseWord(String ogWord) {
        String rev = "";
        int length = ogWord.length();

        for (int i = length; i >= 0; i--) {
            rev = rev + ogWord.charAt(i);
        }
        return rev;
    }


}
