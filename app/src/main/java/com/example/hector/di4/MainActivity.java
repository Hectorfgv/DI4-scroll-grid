package com.example.hector.di4;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final GridLayout layoutFotos = (GridLayout) findViewById(R.id.layoutFotos);
        final TextView albumRojo = (TextView) findViewById(R.id.albumRojo);
        albumRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (albumRojo.getId() == v.getId()){
                    layoutFotos.removeAllViews();
                    for (int i = 1; i <=30; i++){
                        TextView foto = new TextView(getApplicationContext());
                        foto.setText("Foto " + i);
                        foto.setTextSize(15);
                        layoutFotos.addView(foto);
                        foto.setBackgroundColor(Color.parseColor("#ff0000"));
                        foto.setWidth(240);
                        foto.setHeight(240);

                        GridLayout.LayoutParams margins = new GridLayout.LayoutParams();
                        margins.setMargins(10,10,10, 10);
                        foto.setLayoutParams(margins);
                    }
                }
            }
        });

        final TextView albumAzul = (TextView) findViewById(R.id.albumAzul);
        albumAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (albumAzul.getId() == v.getId()){
                    layoutFotos.removeAllViews();
                    for (int i = 1; i <=28; i++){
                        TextView foto = new TextView(getApplicationContext());
                        foto.setText("Foto " + i);
                        foto.setTextSize(15);
                        layoutFotos.addView(foto);
                        foto.setBackgroundColor(Color.parseColor("#005eff"));
                        foto.setWidth(240);
                        foto.setHeight(240);

                        GridLayout.LayoutParams margins = new GridLayout.LayoutParams();
                        margins.setMargins(10,10,10, 10);
                        foto.setLayoutParams(margins);
                    }
                }
            }
        });

        final TextView albumVerde = (TextView) findViewById(R.id.albumVerde);
        albumVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (albumVerde.getId() == v.getId()){
                    layoutFotos.removeAllViews();
                    for (int i = 1; i <=31; i++){
                        TextView foto = new TextView(getApplicationContext());
                        foto.setText("Foto " + i);
                        foto.setTextSize(15);
                        layoutFotos.addView(foto);
                        foto.setBackgroundColor(Color.parseColor("#4bf900"));
                        foto.setWidth(240);
                        foto.setHeight(240);

                        GridLayout.LayoutParams margins = new GridLayout.LayoutParams();
                        margins.setMargins(10,10,10, 10);
                        foto.setLayoutParams(margins);
                    }
                }
            }
        });

        final TextView albumNaranja = (TextView) findViewById(R.id.albumNaranja);
        albumNaranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (albumNaranja.getId() == v.getId()){
                    layoutFotos.removeAllViews();
                    for (int i = 1; i <=26; i++){
                        TextView foto = new TextView(getApplicationContext());
                        foto.setText("Foto " + i);
                        foto.setTextSize(15);
                        layoutFotos.addView(foto);
                        foto.setBackgroundColor(Color.parseColor("#f99a00"));
                        foto.setWidth(240);
                        foto.setHeight(240);

                        GridLayout.LayoutParams margins = new GridLayout.LayoutParams();
                        margins.setMargins(10,10,10, 10);
                        foto.setLayoutParams(margins);
                    }
                }
            }
        });

    }
}
