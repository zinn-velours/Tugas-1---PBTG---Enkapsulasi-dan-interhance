/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.aplikasikasirtoko;

public class Transaksi {
    protected int jumlahBeli;
    protected double totalHargaAwal;

    // Constructor induk
    public Transaksi(int jumlahBeli, double hargaSatuan) {
        this.jumlahBeli = jumlahBeli;
        this.totalHargaAwal = jumlahBeli * hargaSatuan;
    }

    // Hitung total normal (tanpa diskon)
    public double hitungTotal() {
        return totalHargaAwal;
    }

    // Tampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Jumlah Beli      : " + jumlahBeli);
        System.out.println("Total Harga Awal : Rp " + totalHargaAwal);
    }
}
