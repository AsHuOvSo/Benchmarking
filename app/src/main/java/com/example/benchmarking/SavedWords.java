package com.example.benchmarking;

import java.util.ArrayList;

public class SavedWords {
    ArrayList<String> arraySavedWords = new ArrayList<String>();
    int arraySize = 0;

    String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void Save() {
        arraySavedWords.add(word);
    }
    public int UpdateAmount() {
        arraySize = arraySavedWords.size();
        return arraySize;
    }

}
