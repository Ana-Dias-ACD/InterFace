package com.example.aninterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){
        String [] frases = {
                "Faça sempre o seu melhor!",
                "Os problemas são oportunidades para se mostrar o que sabe.” (Duke Ellington)",
                "É costume de um tolo, quando erra, queixar-se dos outros. É costume de um sábio queixar-se de si mesmo”. (Sócrates)",
                "É sempre divertido fazer o impossível”. (Walt Disney)"

        };
        int number = new Random().nextInt(4);
        TextView text = findViewById(R.id.textResultado);
        text.setText(frases[number]);


    }
}