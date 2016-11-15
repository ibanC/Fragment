package com.example.dm2.fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by dm2 on 09/11/2016.
 */
public class DetalleActivity extends AppCompatActivity{
    public static final String EXTRA_TEXTO="com.example.dm2.fragments.EXTRA_TEXTO";

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        Fragment_detalle detalle=(Fragment_detalle)getSupportFragmentManager().findFragmentById(R.id.FrgDetalle);

        //detalle.mostrarDetalle(getIntent().getStringExtra(EXTRA_TEXTO));
        detalle.mostrarDetalle((Pelicula)getIntent().getSerializableExtra(EXTRA_TEXTO));

    }
}
