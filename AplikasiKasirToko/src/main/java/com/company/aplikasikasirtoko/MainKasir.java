/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.aplikasikasirtoko;

public class MainKasir {
    public static void main(String[] args) {
        System.out.println("=== KASIR TOKO SEDERHANA ===");

        // 1. Buat Objek Produk (Memakai ProdukTokoo)
        ProdukToko produk = new ProdukToko("Buku Tulis", 5000);
        System.out.println("Produk       : " + produk.getNamaBarang());
        System.out.println("Harga Satuan : Rp " + produk.getHarga());
        System.out.println("-------------------------------------");

        // 2. Transaksi Non-Member (Beli 4 barang)
        System.out.println("[ Transaksi Non-Member ]");
        Transaksi tBiasa = new Transaksi(4, produk.getHarga());
        tBiasa.tampilkanInfo();
        System.out.println("Total Bayar  : Rp " + tBiasa.hitungTotal());

        System.out.println("-------------------------------------");

        // 3. Transaksi Member (Beli 4 barang, diskon 10%)
        System.out.println("[ Transaksi Member (Siswa) ]");
        TransaksiMember tMember = new TransaksiMember(4, produk.getHarga(), 0.10);
        tMember.tampilkanInfo();
    }
}