package com.example.myfirstapp.Model;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String noTelp;

    public Mahasiswa(String nama, String nim, String noTelp) {
        this.nama = nama;
        this.nim = nim;
        this.noTelp = noTelp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

}
