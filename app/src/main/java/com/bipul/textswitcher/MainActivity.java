package com.bipul.textswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    //global variables declar
    MultiAutoCompleteTextView multiAutoCompleteTextView;
    String[] text = {"Java", "python", "rahim", "Karim", "ruby", "laravel", "PHP", "there", "is", "nothing", "knowladge", "challange", "clearly", "you", "are", "foolish"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        multiAutoCompleteTextView = findViewById(R.id.multi_auto_complete);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, text);
        multiAutoCompleteTextView.setAdapter(arrayAdapter);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}