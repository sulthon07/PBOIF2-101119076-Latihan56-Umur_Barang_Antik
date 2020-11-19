/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg101119076.latihan56.umur.barang.antik;

/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi : Umur barang antik
 */
public class BarangAntik {
    int umur;

    public BarangAntik(int umur) {
        this.umur = umur;
    }
    
    public void tampillUmur() {
        System.out.println("Umur barang antik ini adalah : " + umur + " tahun.");
    }
}
