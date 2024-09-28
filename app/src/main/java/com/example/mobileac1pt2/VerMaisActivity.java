package com.example.mobileac1pt2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class VerMaisActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ver_mais);

        ImageView entrada, vistaDeCima;

        entrada = findViewById(R.id.entrada);
        vistaDeCima = findViewById(R.id.vistaDeCima);

        Button btnVerNoMapa, btnAbrirSite, btnLigar;

        btnVerNoMapa = findViewById(R.id.verNoMapa);
        btnAbrirSite = findViewById(R.id.abrirSite);
        btnLigar = findViewById(R.id.ligar);

        int itemId = getIntent().getIntExtra("item", 0);

        TextView descricaoDoItem = findViewById(R.id.descricaoItem);

        switch (itemId) {
            case 1:
                descricaoDoItem.setText("O Parque Zoológico Municipal Quinzinho de Barros é um jardim zoológico de Sorocaba - SP, " +
                        "sendo considerado o segundo zoológico do Brasil em número de espécies. " +
                        "Inserido na Vila Hortência, dentro da região leste da cidade, em uma área de cerca de 130.000 m², " +
                        "tem em seu interior uma faixa de mata atlântica, um lago, " +
                        "o Museu Histórico Sorocabano e abriga diversas espécies entre mamíferos, aves e répteis. " +
                        "O zoológico é referência na América Latina no que se refere a lazer, pesquisa, preservação " +
                        "e educação ambiental.");
                entrada.setImageResource(R.drawable.zoo_entrada);
                vistaDeCima.setImageResource(R.drawable.zoo_de_cima);

                btnVerNoMapa.setOnClickListener(view -> {
                    Uri uri = Uri.parse("geo:0,0?q=-23.5015,-47.4547(Zoológico de Sorocaba)");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    intent.setPackage("com.google.android.apps.maps");
                    startActivity(intent);
                });

                btnAbrirSite.setOnClickListener(view -> {
                    Uri uri = Uri.parse("https://agendasorocaba.com.br/zoologico-municipal-quinzinho-de-barros/");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                });

                btnLigar.setOnClickListener(view -> {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel: +551532275511"));
                    startActivity(intent);
                });
                break;

            case 2:
                descricaoDoItem.setText("O Iguatemi Esplanada é o maior empreendimento de uso misto do Interior de São Paulo. " +
                        "Com um mix de lojas completo, o empreendimento conta com mais de 400 lojas.\n" +
                        "\n" +
                        "Além de importantes marcas do varejo nacional, oferece diversos serviços para facilitar " +
                        "o dia a dia de seus clientes que buscam, cada vez mais, conforto e qualidade.");
                entrada.setImageResource(R.drawable.iguatemi_entrada);
                vistaDeCima.setImageResource(R.drawable.iguatemi_de_cima);

                btnVerNoMapa.setOnClickListener(view -> {
                    Uri uri = Uri.parse("geo:0,0?q=-23.5226,-47.4625(Iguatemi Esplanada Sorocaba)");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    intent.setPackage("com.google.android.apps.maps");
                    startActivity(intent);
                });

                btnAbrirSite.setOnClickListener(view -> {
                    Uri uri = Uri.parse("https://iguatemi.com.br/esplanada/");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                });

                btnLigar.setOnClickListener(view -> {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel: +551530421400"));
                    startActivity(intent);
                });
                break;

            case 3:
                descricaoDoItem.setText("O Parque Tecnológico de Sorocaba (PTS) é um ambiente criado para atrair " +
                        "e acomodar empresas intensivas em tecnologia, instituições de ensino e pesquisa, " +
                        "assim como empresas de consultoria ou organizações, públicas e/ou privadas, " +
                        "que possam oferecer serviços de apoio técnico e de mercado. " +
                        "Desta forma, o PTS facilitará, às partes interessadas, " +
                        "o acesso ao conhecimento bem como ao mercado, pela aproximação com possíveis desenvolvimentos " +
                        "e inovação tecnológica assim como oportunidades comerciais, em nível nacional e internacional.");
                entrada.setImageResource(R.drawable.parque_entrada);
                vistaDeCima.setImageResource(R.drawable.parque_de_cima);

                btnVerNoMapa.setOnClickListener(view -> {
                    Uri uri = Uri.parse("geo:0,0?q=-23.5299,-47.4512(Parque Tecnológico de Sorocaba)");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                });

                btnAbrirSite.setOnClickListener(view -> {
                    Uri uri = Uri.parse("https://www.parquetecsorocaba.com.br/");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                });

                btnLigar.setOnClickListener(view -> {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel: +551533162323"));
                    startActivity(intent);
                });
                break;
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}