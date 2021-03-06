package com.example.dm2.fragments;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_detalle extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detalle,container,false);
    }

    public void mostrarDetalle(Pelicula p)
    {
        TextView txtAno=(TextView)getView().findViewById(R.id.Lblano);
        txtAno.setText(String.valueOf(p.getAno()));

        TextView txtDirector=(TextView)getView().findViewById(R.id.Lbldirector);
        txtDirector.setText(p.getDirector());
    }
}
