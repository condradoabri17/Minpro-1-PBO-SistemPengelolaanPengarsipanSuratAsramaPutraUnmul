/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.checkpoint1;

/**
 *
 * @author LENOVO
 */
public class SuratMasuk {
    private int urutanSurat;
    private String nomorSurat;
    private String perihal;
    private String tanggalSurat;
    private String pengirim;
    
    public SuratMasuk(int urutanSurat, String nomorSurat, String perihal, String tanggalSurat,String pengirim) {
        this.urutanSurat = urutanSurat;
        this.nomorSurat = nomorSurat;
        this.perihal = perihal;
        this.tanggalSurat = tanggalSurat;
        this.pengirim = pengirim;
    }
    
     public int getUrutanSurat() {
        return urutanSurat;
    }

    public void setUrutanSurat(int urutanSurat) {
        this.urutanSurat = urutanSurat;
    }

    public String getNomorSurat() {
        return nomorSurat;
    }

    public void setNomorSurat(String nomorSurat) {
        this.nomorSurat = nomorSurat;
    }

    public String getPerihal() {
        return perihal;
    }

    public void setPerihal(String perihal) {
        this.perihal = perihal;
    }

    public String getTanggalSurat() {
        return tanggalSurat;
    }

    public void setTanggalSurat(String tanggalSurat) {
        this.tanggalSurat = tanggalSurat;
    }

    public String getPengirim() {
        return pengirim;
    }

    public void setPengirim(String pengirim) {
        this.pengirim = pengirim;
    }
}
