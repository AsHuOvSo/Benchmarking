package com.example.benchmarking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView showRes;
    private TextView tSavedWords;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showRes = (TextView) findViewById(R.id.txtVwResult);
        tSavedWords = (TextView) findViewById(R.id.txtVwSavedWordsAmount);
        editText = (EditText) findViewById(R.id.editTxtWord);
    }

    public void reverseWord(View view) {
        editText = findViewById(Resources.getSystem().getIdentifier("editTxtWord", "id", "android"));
        try {
            if(editText.getText().toString().matches("") || editText.getText().toString() == null) {
                System.out.println("Error: No input in EditText");
            }
            else {
                Backwards wordB = new Backwards();
                wordB.setTestWord(editText.getText().toString());
                String outputWord = wordB.ReverseWord();
                showRes.setText(outputWord);
            }
        }
        catch (Exception e) {

        }
    }

    public void saveWord(View view) {
        editText = findViewById(Resources.getSystem().getIdentifier("editTxtWord", "id", "android"));
        try {
            if(editText.getText().toString().matches("") || editText.getText().toString() == null) {
                System.out.println("Error: No input in EditText");
            }
            else {
                SavedWords wordS = new SavedWords();
                wordS.setWord(editText.getText().toString());
                wordS.Save();
                tSavedWords.setText(wordS.UpdateAmount());
            }
        }
        catch (Exception e) {

        }



    }

}