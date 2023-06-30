package com.example.kampuskuapp;

import java.io.Serializable;
import java.security.SecureRandom;

public class univModel implements Serializable{
    public String namaUniv;
    public String jmlFakultas;
    public String jmlProdi;
    public String favoritProdi;

    public univModel(String namaUniv, String jmlFakultas, String jmlProdi, String favoritProdi) {
        this.namaUniv = namaUniv;
        this.jmlFakultas = jmlFakultas;
        this.jmlProdi = jmlProdi;
        this.favoritProdi = favoritProdi;
    }

    public String getNamaUniv() {
        return namaUniv;
    }

    public void setNamaUniv(String namaUniv) {
        this.namaUniv = namaUniv;
    }

    public String getJmlFakultas() {
        return jmlFakultas;
    }

    public void setJmlFakultas(String jmlFakultas) {
        this.jmlFakultas = jmlFakultas;
    }

    public String getJmlProdi() {
        return jmlProdi;
    }

    public void setJmlProdi(String jmlProdi) {
        this.jmlProdi = jmlProdi;
    }

    public String getFavoritProdi() {
        return favoritProdi;
    }

    public void setFavoritProdi(String favoritProdi) {
        this.favoritProdi = favoritProdi;
    }
}
