/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checkpoint1;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArsipSurat arsip = new ArsipSurat();

        int pilihan;

        do {
            System.out.println(" SISTEM PENGARSIPAN SURAT");
            System.out.println(" ASRAMA PUTRA UNIVERSITAS MULAWARMAN");
            System.out.println("");
            System.out.println("1. Kelola Surat Masuk");
            System.out.println("2. Kelola Surat Keluar");
            System.out.println("3. Kelola Data Penghuni");
            System.out.println("4. Keluar");
            System.out.println("");

            System.out.print("Pilih menu: ");
            pilihan = Integer.parseInt(input.nextLine());

            switch (pilihan) {

                case 1:

                    int pilihanSuratMasuk;

                    do {
                        System.out.println("\nMENU SURAT MASUK");
                        System.out.println("1. Tambah Surat");
                        System.out.println("2. Tampilkan Surat");
                        System.out.println("3. Ubah Surat");
                        System.out.println("4. Hapus Surat");
                        System.out.println("5. Kembali");

                        System.out.print("Pilih menu: ");
                        pilihanSuratMasuk = Integer.parseInt(input.nextLine());

                        switch (pilihanSuratMasuk) {

                            case 1:
                                arsip.tambahSuratMasuk();
                                break;

                            case 2:
                                arsip.tampilkanSuratMasuk();
                                break;

                            case 3:
                                arsip.ubahSuratMasuk();
                                break;

                            case 4:
                                arsip.hapusSuratMasuk();
                                break;

                            case 5:
                                System.out.println("Kembali ke menu utama.");
                                break;

                            default:
                                System.out.println("Pilihan tidak tersedia.");
                        }

                    } while (pilihanSuratMasuk != 5);

                    break;

                case 2:

                    int pilihanSuratKeluar;

                    do {
                        System.out.println("\nMENU SURAT KELUAR");
                        System.out.println("1. Tambah Surat");
                        System.out.println("2. Tampilkan Surat");
                        System.out.println("3. Ubah Surat");
                        System.out.println("4. Hapus Surat");
                        System.out.println("5. Kembali");

                        System.out.print("Pilih menu: ");
                        pilihanSuratKeluar = Integer.parseInt(input.nextLine());

                        switch (pilihanSuratKeluar) {

                            case 1:
                                arsip.tambahSuratKeluar();
                                break;

                            case 2:
                                arsip.tampilkanSuratKeluar();
                                break;

                            case 3:
                                arsip.ubahSuratKeluar();
                                break;

                            case 4:
                                arsip.hapusSuratKeluar();
                                break;

                            case 5:
                                System.out.println("Kembali ke menu utama.");
                                break;

                            default:
                                System.out.println("Pilihan tidak tersedia.");
                        }

                    } while (pilihanSuratKeluar != 5);

                    break;

                case 3:

                    int pilihanPenghuni;

                    do {
                        System.out.println("\nMENU DATA PENGHUNI");
                        System.out.println("1. Tambah Penghuni");
                        System.out.println("2. Tampilkan Penghuni");
                        System.out.println("3. Ubah Penghuni");
                        System.out.println("4. Hapus Penghuni");
                        System.out.println("5. Kembali");

                        System.out.print("Pilih menu: ");
                        pilihanPenghuni = Integer.parseInt(input.nextLine());

                        switch (pilihanPenghuni) {

                            case 1:
                                arsip.tambahPenghuni();
                                break;

                            case 2:
                                arsip.tampilkanPenghuni();
                                break;

                            case 3:
                                arsip.ubahPenghuni();
                                break;

                            case 4:
                                arsip.hapusPenghuni();
                                break;

                            case 5:
                                System.out.println("Kembali ke menu utama.");
                                break;

                            default:
                                System.out.println("Pilihan tidak tersedia.");
                        }

                    } while (pilihanPenghuni != 5);

                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 4);

        input.close();
    }
}
