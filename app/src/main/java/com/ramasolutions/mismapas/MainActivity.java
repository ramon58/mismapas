package com.ramasolutions.mismapas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irMapas(View view) {
        Intent i = new Intent(this, MapsActivity.class);
        switch (view.getId()) {
            case R.id.ivCafeteria:
                i.putExtra("LUGAR", "Cafetería Lucrecia Cerdeño");
                i.putExtra("LATITUD", 43.3692504);
                i.putExtra("LONGITUD", -5.8189226);
                i.putExtra("PUNTERO", R.drawable.puntero);
                break;

            case R.id.ivSupermercado:
                i.putExtra("LUGAR", "Alimerka La Tenderina Baja");
                i.putExtra("LATITUD", 43.3694800);
                i.putExtra("LONGITUD", -5.820887);
                i.putExtra("PUNTERO", R.drawable.puntero);
                break;

            case R.id.ivHospital:
                i.putExtra("LUGAR", "Hospital HUCA");
                i.putExtra("LATITUD", 43.3760916);
                i.putExtra("LONGITUD", -5.8295085);
                i.putExtra("PUNTERO", R.drawable.puntero);
                break;

            case R.id.ivCine:
                i.putExtra("LUGAR", "Parque Principado");
                i.putExtra("LATITUD", 43.3900018);
                i.putExtra("LONGITUD", -5.8040844);
                i.putExtra("PUNTERO", R.drawable.puntero);
                break;

            case R.id.ivBiblioteca:
                i.putExtra("LUGAR", "Biblioteca Municipal");
                i.putExtra("LATITUD", 43.3695575);
                i.putExtra("LONGITUD", -5.8282103);
                i.putExtra("PUNTERO", R.drawable.puntero);
                break;

            case R.id.ivOficina:
                i.putExtra("LUGAR", "Oficina");
                i.putExtra("LATITUD", 43.36941121);
                i.putExtra("LONGITUD", -5.81769883);
                i.putExtra("PUNTERO", R.drawable.puntero);
                break;
        }

        startActivity(i);
    }
}
