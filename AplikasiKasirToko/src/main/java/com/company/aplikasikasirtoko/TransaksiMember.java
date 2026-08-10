/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.aplikasikasirtoko;

public class TransaksiMember extends Transaksi {
    private double persentaseDiskon; // Contoh: 0.10 artinya diskon 10%

    // Constructor anak
    public TransaksiMember(int jumlahBeli, double hargaSatuan, double persentaseDiskon) {
        super(jumlahBeli, hargaSatuan); // Memanggil constructor milik Transaksi
        this.persentaseDiskon = persentaseDiskon;
    }

    // Menghitung total harga setelah diskon
    @Override
    public double hitungTotal() {
        double diskon = totalHargaAwal * persentaseDiskon;
        return totalHargaAwal - diskon;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        double nominalDiskon = totalHargaAwal * persentaseDiskon;
        System.out.println("Diskon Member    : Rp " + nominalDiskon + " (" + (persentaseDiskon * 100) + "%)");
        System.out.println("Total Bayar Akhir: Rp " + hitungTotal());
    }
}
