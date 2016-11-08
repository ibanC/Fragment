package com.example.dm2.fragments;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class fragment_listado extends Fragment {

    private Pelicula[] datos=
            new Pelicula[]{
                    new Pelicula("Piratas del Caribe",2008,"Gore Verbiski"),
                    new Pelicula("Harry Potter y el Caliz del Fuego",2009,"J.K.Rowling"),
                    new Pelicula("Un monstruo viene a verme",2016,"Juan Antonio Bayona"),
                    new Pelicula("Ocho Apellidos Vascos",2014,"Emilio Martínez-Lázaro"),
                    new Pelicula("Ocho Apellidos Catalanes",2015,"Emilio Martínez-Lázaro")
            };
    private ListView lstListado;
  public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
  {
      return inflater.inflate(R.layout.activity_fragment_listado,container,false);
  }

    public void onActivityCreated(Bundle state){
        super.onActivityCreated(state);
        lstListado=(ListView)getView().findViewById(R.id.lstPeliculas);
        lstListado.setAdapter(new AdaptadorPeliculas(this));


    }

class AdaptadorPeliculas extends ArrayAdapter<Pelicula>{

     Activity context;

        AdaptadorPeliculas(Fragment context)
        {
            super(context.getActivity(),R.layout.listitem_pelicula,datos);
            this.context=context.getActivity();
        }

    public View getView(int position,View convertView,ViewGroup parent){

        LayoutInflater inflater=context.getLayoutInflater();
        View item=inflater.inflate(R.layout.listitem_pelicula,null);

        TextView lblTitulo=(TextView)item.findViewById(R.id.LblTitulo);
        lblTitulo.setText(datos[position].getTitulo());
        return(item);
    }

    }




}
