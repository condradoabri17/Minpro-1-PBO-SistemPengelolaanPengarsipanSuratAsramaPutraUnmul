/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.checkpoint1;

/**
 *
 * @author LENOVO
 */
public class SuratKeluar {

    private int urutanSurat;
    private String nomorSurat;
    private String jenisSurat;
    private String perihal;
    private String tanggalSurat;
    private String tujuan;

    public SuratKeluar(int urutanSurat, String nomorSurat,
                       String jenisSurat, String perihal,
                       String tanggalSurat, String tujuan) {

        this.urutanSurat = urutanSurat;
        this.nomorSurat = nomorSurat;
        this.jenisSurat = jenisSurat;
        this.perihal = perihal;
        this.tanggalSurat = tanggalSurat;
        this.tujuan = tujuan;
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

    public String getJenisSurat() {
        return jenisSurat;
    }

    public void setJenisSurat(String jenisSurat) {
        this.jenisSurat = jenisSurat;
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

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
}
