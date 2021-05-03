package com.example.benchmarking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView tSavedWords;
    private EditText editText;
    public ArrayList<String> arL = new ArrayList<String>();
    public static final String data = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tSavedWords = (TextView) findViewById(R.id.txtVwSavedWordsAmount);
        editText = (EditText) findViewById(R.id.editTxtWord);
        editText = editText.findViewById(Resources.getSystem().getIdentifier("editTxtWord", "id", "android"));
    }

    public void reverseWord(View view) {
        try {
            String word = editText.getText().toString();
            Reverse r = new Reverse();
            String revWord = r.ReverseWord(word);
            Intent intent = new Intent(this, BackwardsActivity.class);
            intent.putExtra(data, revWord);
            startActivity(intent);
        }
        catch (Exception ignored) {

        }
    }

    public void saveWord(View view) {
        try {
            arL.add(editText.getText().toString());

            tSavedWords.setText(arL.size());
        }
        catch (Exception ignored) {

        }



    }

}