package com.example.benchmarking;

public class Reverse {

    String testWord;
    public String getTestWord() {
        return testWord;
    }

    public void setTestWord(String testWord) {
        this.testWord = testWord;
    }



    public String ReverseWord() {
        String rev = "";
        int length = testWord.length();

        for (int i = length; i >= 0; i--) {
            rev = rev + testWord.charAt(i);
        }
        return rev;
    }


}
