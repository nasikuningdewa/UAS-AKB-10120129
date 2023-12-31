package com.ahmett.uas_akb_if4_10120129.Model;

// 10120129, Ahmad Syafii Assidiq, IF4

public class CatatanModel extends CatatanId {

    private String judul, catatan, tanggal;
    private transient String key;

    public CatatanModel(String judul, String catatan, String tanggal) {
        this.judul = judul;
        this.catatan = catatan;
        this.tanggal = tanggal;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public CatatanModel() {
    }

    public String getJudul() {
        return judul;
    }

    public String getCatatan() {
        return catatan;
    }

    public String getTanggal() {
        return tanggal;
    }
}

