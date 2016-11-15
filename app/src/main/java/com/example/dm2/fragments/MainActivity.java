package com.example.dm2.fragments;

import com.example.dm2.fragments.Fragment_listado.PeliculasListener;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements PeliculasListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   Fragment_listado frgListado = (Fragment_listado)getSupportFragmentManager().findFragmentById(R.id.FrgListado);
        frgListado.setPeliculasListener(this);

    }
    public void onPeliculaSeleccionada(Pelicula p){
        boolean hayDetalle = (getSupportFragmentManager().findFragmentById(R.id.FrgDetalle)!=null);
        if (hayDetalle) {
            ((Fragment_detalle)getSupportFragmentManager().findFragmentById(R.id.FrgDetalle)).mostrarDetalle(p);
        }
        else {
            Intent i= new Intent(this,DetalleActivity.class);
            i.putExtra(DetalleActivity.EXTRA_TEXTO,p);
            startActivity(i);

        }


}}
