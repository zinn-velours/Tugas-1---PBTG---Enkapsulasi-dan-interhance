/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB RPL
 */
package com.company.aplikasikasirtoko;

public class ProdukToko {
    // 1. Atribut disembunyikan (private)
    private String namaBarang;
    private double harga;

    // 2. Constructor (metode pembuat objek)
    public ProdukToko(String namaBarang, double harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    // 3. Getter & Setter untuk namaBarang
    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    // 4. Getter & Setter untuk harga (dengan proteksi)
    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga harus lebih dari 0!");
        }
    }
}