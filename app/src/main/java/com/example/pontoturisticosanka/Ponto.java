package com.example.pontoturisticosanka;

import android.media.Image;
import android.widget.ImageView;

public class Ponto {

    private String nome;
    private String distancia;
    private Integer img;


    public Ponto(String nome, String distancia, Integer img) {
        this.nome = nome;
        this.distancia = distancia;
        this.img = img;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }
}


