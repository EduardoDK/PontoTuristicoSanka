package com.example.pontoturisticosanka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ListView listView;
    private List<Ponto> pontos = new ArrayList<>();
    private ArrayAdapter<Ponto> arrayAdapterPonto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CriarPontos();

        listView = findViewById(R.id.list_view_pontos);
        arrayAdapterPonto = new MeuAdpter(MainActivity.this,(ArrayList<Ponto>)pontos);
        listView.setAdapter(arrayAdapterPonto);




    }


    public void CriarPontos(){

        this.pontos.add(new Ponto("Catedral","1,90KM",R.drawable.catedral));
        this.pontos.add(new Ponto("Museu de pedra","1,30KM",R.drawable.museupedra));
        this.pontos.add(new Ponto("Fazenda Pinhal","4,40KM",R.drawable.fazendapinhal));


    }



}
