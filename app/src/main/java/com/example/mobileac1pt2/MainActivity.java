package com.example.mobileac1pt2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ImageView zooBrand, iguatemiBrand, parqueBrand;

        zooBrand = findViewById(R.id.zooBrand);
        iguatemiBrand = findViewById(R.id.iguatemiBrand);
        parqueBrand = findViewById(R.id.parqueBrand);

        zooBrand.setImageResource(R.drawable.zoo_branding);
        iguatemiBrand.setImageResource(R.drawable.iguatemi_branding);
        parqueBrand.setImageResource(R.drawable.parque_tecnologico_branding);

        Button verMaisZoo, verMaisIguatemi, verMaisParque;

        verMaisZoo = findViewById(R.id.verMaisZoo);
        verMaisIguatemi = findViewById(R.id.verMaisIguatemi);
        verMaisParque = findViewById(R.id.verMaisParque);

        verMaisZoo.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, VerMaisActivity.class);
            intent.putExtra("item", 1);
            startActivity(intent);
        });

        verMaisIguatemi.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, VerMaisActivity.class);
            intent.putExtra("item", 2);
            startActivity(intent);
        });

        verMaisParque.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, VerMaisActivity.class);
            intent.putExtra("item", 3);
            startActivity(intent);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}