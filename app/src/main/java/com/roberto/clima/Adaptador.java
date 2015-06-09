package com.roberto.clima;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    private ArrayList<ClaseLista> List;
    private LayoutInflater inflater;
    private Context contexto;


    public Adaptador(ArrayList<ClaseLista> list, Context cont)
    {
        this.List = list;
        this.inflater = LayoutInflater.from(cont);
        this.contexto = cont;

    }

    @Override
    public int getCount() {
        return List.size();
    }

    @Override
    public Object getItem(int position) {
        return List.get(position);

    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView= inflater.inflate(R.layout.climas, null);
        ClaseLista list=List.get(position);
        ImageView img = (ImageView) convertView.findViewById(R.id.imagen);
        TextView dia = (TextView) convertView.findViewById(R.id.dia);
        TextView estado = (TextView) convertView.findViewById(R.id.estado);
        TextView temperatura = (TextView) convertView.findViewById(R.id.temperatura);

        img.setImageDrawable(contexto.getResources().getDrawable(list.getImagen()));
        dia.setText(list.getDia());
        estado.setText(list.getEstado());
        temperatura.setText(list.getTemperatura());

        return convertView;
    }
}
