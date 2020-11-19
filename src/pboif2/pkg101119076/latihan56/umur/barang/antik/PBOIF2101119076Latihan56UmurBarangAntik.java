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
public class PBOIF2101119076Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Radio radio = new Radio(234);
        radio.setName("Radio AM");
        
        System.out.println("Nama barang Antik : " + radio.getName());
        radio.tampillUmur();
    }
}
    

