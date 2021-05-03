package com.example.benchmarking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;

public class BackwardsActivity extends Activity {

    private TextView showResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backwards);
        showResult = (TextView) findViewById(R.id.txtVwRes);

        Intent oldIntent = getIntent();
        showResult.setText(oldIntent.getStringExtra(MainActivity.data));
    }

    public void returnToFront(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
