package com.example.pontoturisticosanka;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;


public class MeuAdpter extends ArrayAdapter<Ponto> {

    private Context context;
    private List<Ponto> pontos;





    public MeuAdpter(Context context, ArrayList<Ponto> list){

        super(context, 0,list);
        this.context = context;
        pontos = list;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View listItem = convertView;
                if(listItem == null){
                    listItem = LayoutInflater.from(context).inflate(R.layout.layout_ponto,parent,false);
                }
                Ponto pontoAtual = pontos.get(position);
                TextView nome = listItem.findViewById(R.id.ponto_nome);
                nome.setText(pontoAtual.getNome());
                TextView distancia = listItem.findViewById(R.id.ponto_distancia);
                distancia.setText(pontoAtual.getDistancia());
                ImageView img =  listItem.findViewById(R.id.ponto_imagem);
                img.setImageResource(pontoAtual.getImg());


        return listItem;




    }
}
