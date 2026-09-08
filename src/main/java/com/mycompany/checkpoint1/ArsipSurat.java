/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.checkpoint1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ArsipSurat {

    private ArrayList<SuratMasuk> daftarSuratMasuk;
    private ArrayList<SuratKeluar> daftarSuratKeluar;
    private ArrayList<Penghuni> daftarPenghuni;

    public ArsipSurat() {
        daftarSuratMasuk = new ArrayList<>();
        daftarSuratKeluar = new ArrayList<>();
        daftarPenghuni = new ArrayList<>();
    }
    
    public void tambahSuratMasuk() {

        Scanner input = new Scanner(System.in);

        System.out.println("\nTAMBAH SURAT MASUK");

        System.out.print("Urutan surat: ");
        int urutan = Integer.parseInt(input.nextLine());

        System.out.print("Nomor surat: ");
        String nomor = input.nextLine();

        System.out.print("Perihal: ");
        String perihal = input.nextLine();

        System.out.print("Tanggal surat: ");
        String tanggal = input.nextLine();

        System.out.print("Pengirim: ");
        String pengirim = input.nextLine();

        SuratMasuk surat = new SuratMasuk(
                urutan,
                nomor,
                perihal,
                tanggal,
                pengirim
        );

        daftarSuratMasuk.add(surat);

        System.out.println("Surat berhasil ditambahkan.");
    }

    public void tampilkanSuratMasuk() {

        System.out.println("\nDAFTAR SURAT MASUK");

        if (daftarSuratMasuk.size() == 0) {
            System.out.println("Belum ada surat masuk.");
        } else {

            for (SuratMasuk surat : daftarSuratMasuk) {

                System.out.println("Urutan   : " + surat.getUrutanSurat());
                System.out.println("Nomor    : " + surat.getNomorSurat());
                System.out.println("Perihal  : " + surat.getPerihal());
                System.out.println("Tanggal  : " + surat.getTanggalSurat());
                System.out.println("Pengirim : " + surat.getPengirim());
                System.out.println();
            }
        }
    }
    
    public void ubahSuratMasuk() {

        Scanner input = new Scanner(System.in);

        System.out.println("\nUBAH SURAT MASUK");

        System.out.print("Masukkan nomor surat: ");
        String nomor = input.nextLine();

        for (SuratMasuk surat : daftarSuratMasuk) {

            if (surat.getNomorSurat().equalsIgnoreCase(nomor)) {

                System.out.print("Perihal baru: ");
                surat.setPerihal(input.nextLine());

                System.out.print("Tanggal baru: ");
                surat.setTanggalSurat(input.nextLine());

                System.out.print("Pengirim baru: ");
                surat.setPengirim(input.nextLine());

                System.out.println("Surat berhasil diubah.");

                return;
            }
        }

        System.out.println("Surat tidak ditemukan.");
    }

    public void hapusSuratMasuk() {

        Scanner input = new Scanner(System.in);

        System.out.println("\nHAPUS SURAT MASUK");

        System.out.print("Masukkan nomor surat: ");
        String nomor = input.nextLine();

        for (int i = 0; i < daftarSuratMasuk.size(); i++) {

            if (daftarSuratMasuk.get(i)
                    .getNomorSurat()
                    .equalsIgnoreCase(nomor)) {

                daftarSuratMasuk.remove(i);

                System.out.println("Surat berhasil dihapus.");

                return;
            }
        }

        System.out.println("Surat tidak ditemukan.");
    }
    
    // untuk surat keluar
    
    public void tambahSuratKeluar() {

        Scanner input = new Scanner(System.in);

        System.out.println("\nTAMBAH SURAT KELUAR");
        System.out.println("1. Surat Biasa");
        System.out.println("2. Surat Peringatan");
        System.out.println("3. Surat Izin");

        System.out.print("Pilih jenis surat: ");
        int pilihan = Integer.parseInt(input.nextLine());

        String jenisSurat;

        if (pilihan == 1) {
            jenisSurat = "Surat Biasa";
        } else if (pilihan == 2) {
            jenisSurat = "Surat Peringatan";
        } else if (pilihan == 3) {
            jenisSurat = "Surat Izin";
        } else {
            System.out.println("Pilihan tidak tersedia.");
            return;
        }

        System.out.print("Urutan surat: ");
        int urutan = Integer.parseInt(input.nextLine());

        System.out.print("Nomor surat: ");
        String nomor = input.nextLine();

        System.out.print("Perihal: ");
        String perihal = input.nextLine();

        System.out.print("Tanggal surat: ");
        String tanggal = input.nextLine();

        System.out.print("Tujuan: ");
        String tujuan = input.nextLine();

        SuratKeluar surat = new SuratKeluar(
                urutan,
                nomor,
                jenisSurat,
                perihal,
                tanggal,
                tujuan
        );

        daftarSuratKeluar.add(surat);

        System.out.println("Surat keluar berhasil ditambahkan.");
    }

    public void tampilkanSuratKeluar() {

        System.out.println("\nDAFTAR SURAT KELUAR");

        if (daftarSuratKeluar.size() == 0) {
            System.out.println("Belum ada surat keluar.");
        } else {

            for (SuratKeluar surat : daftarSuratKeluar) {

                System.out.println("Urutan  : " + surat.getUrutanSurat());
                System.out.println("Nomor   : " + surat.getNomorSurat());
                System.out.println("Jenis   : " + surat.getJenisSurat());
                System.out.println("Perihal : " + surat.getPerihal());
                System.out.println("Tanggal : " + surat.getTanggalSurat());
                System.out.println("Tujuan  : " + surat.getTujuan());
            }
        }
    }
    
    public void ubahSuratKeluar() {

        Scanner input = new Scanner(System.in);

        System.out.println("\nUBAH SURAT KELUAR");

        System.out.print("Masukkan nomor surat: ");
        String nomor = input.nextLine();

        for (SuratKeluar surat : daftarSuratKeluar) {

            if (surat.getNomorSurat().equalsIgnoreCase(nomor)) {

                System.out.print("Jenis surat baru: ");
                surat.setJenisSurat(input.nextLine());

                System.out.print("Perihal baru: ");
                surat.setPerihal(input.nextLine());

                System.out.print("Tanggal baru: ");
                surat.setTanggalSurat(input.nextLine());

                System.out.print("Tujuan baru: ");
                surat.setTujuan(input.nextLine());

                System.out.println("Surat berhasil diubah.");

                return;
            }
        }

        System.out.println("Surat tidak ditemukan.");
    }

    public void hapusSuratKeluar() {

        Scanner input = new Scanner(System.in);

        System.out.println("\nHAPUS SURAT KELUAR");

        System.out.print("Masukkan nomor surat: ");
        String nomor = input.nextLine();

        for (int i = 0; i < daftarSuratKeluar.size(); i++) {

            if (daftarSuratKeluar.get(i)
                    .getNomorSurat()
                    .equalsIgnoreCase(nomor)) {

                daftarSuratKeluar.remove(i);

                System.out.println("Surat berhasil dihapus.");

                return;
            }
        }

        System.out.println("Surat tidak ditemukan.");
    }
    
    public void tambahPenghuni() {

        Scanner input = new Scanner(System.in);

        System.out.println("\nTAMBAH PENGHUNI");

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("NIM: ");
        String nim = input.nextLine();

        System.out.print("Asal daerah: ");
        String asalDaerah = input.nextLine();

        System.out.print("Fakultas: ");
        String fakultas = input.nextLine();

        System.out.print("Jurusan: ");
        String jurusan = input.nextLine();

        System.out.print("Status: ");
        String status = input.nextLine();

        Penghuni penghuni = new Penghuni(
                nama,
                nim,
                asalDaerah,
                fakultas,
                jurusan,
                status
        );

        daftarPenghuni.add(penghuni);

        System.out.println("Data penghuni berhasil ditambahkan.");
    }

    public void tampilkanPenghuni() {

        System.out.println("\nDAFTAR PENGHUNI");

        if (daftarPenghuni.size() == 0) {
            System.out.println("Belum ada data penghuni.");
        } else {

            for (Penghuni penghuni : daftarPenghuni) {

                System.out.println("Nama        : " + penghuni.getNama());
                System.out.println("NIM         : " + penghuni.getNim());
                System.out.println("Asal Daerah : " + penghuni.getAsalDaerah());
                System.out.println("Fakultas    : " + penghuni.getFakultas());
                System.out.println("Jurusan     : " + penghuni.getJurusan());
                System.out.println("Status      : " + penghuni.getStatus());
                System.out.println();
            }
        }
    }

    public void ubahPenghuni() {

        Scanner input = new Scanner(System.in);

        System.out.println("\nUBAH PENGHUNI");

        System.out.print("Masukkan NIM penghuni: ");
        String nim = input.nextLine();

        for (Penghuni penghuni : daftarPenghuni) {

            if (penghuni.getNim().equalsIgnoreCase(nim)) {

                System.out.print("Nama baru: ");
                penghuni.setNama(input.nextLine());

                System.out.print("Asal daerah baru: ");
                penghuni.setAsalDaerah(input.nextLine());

                System.out.print("Fakultas baru: ");
                penghuni.setFakultas(input.nextLine());

                System.out.print("Jurusan baru: ");
                penghuni.setJurusan(input.nextLine());

                System.out.print("Status baru: ");
                penghuni.setStatus(input.nextLine());

                System.out.println("Data penghuni berhasil diubah.");

                return;
            }
        }

        System.out.println("Penghuni tidak ditemukan.");
    }

    public void hapusPenghuni() {

        Scanner input = new Scanner(System.in);

        System.out.println("\nHAPUS PENGHUNI");

        System.out.print("Masukkan NIM penghuni: ");
        String nim = input.nextLine();

        for (int i = 0; i < daftarPenghuni.size(); i++) {

            if (daftarPenghuni.get(i)
                    .getNim()
                    .equalsIgnoreCase(nim)) {

                daftarPenghuni.remove(i);

                System.out.println("Data penghuni berhasil dihapus.");

                return;
            }
        }

        System.out.println("Penghuni tidak ditemukan.");
    }
}
