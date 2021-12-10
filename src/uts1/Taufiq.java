/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts1;

/**
 *
 * NIM      : 10120708
 * NAMA     : TAUFIQ QUROHMAN RUKI
 * KELAS    : IF7
 */
public class Taufiq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kalkulator = new Kalkulator(10, 5);
        
        System.out.println("Kalkulator sederhana");
        System.out.println("===========================================");
        System.out.println("Bilangan ke-1              : " + kalkulator.getBilangan1());
        System.out.println("Bilangan ke-2              : " + kalkulator.getBilangan2());
        System.out.println("");
        System.out.println("Hasil Penjumlahan Bilangan : " + kalkulator.penjumlahan());
        System.out.println("Hasil Pengurangan Bilangan : " + kalkulator.pengurangan());
        System.out.println("Hasil Perkalian Bilangan   : " + kalkulator.perkalian());
        System.out.println("Hasil Pembagian Bilangan   : " + kalkulator.pembagian());
        System.out.println("Hasil Faktorial bilangan 1 : " + kalkulator.hitungfaktorial(10));
        System.out.println("Hasil Faktorial bilangan 2 : " + kalkulator.hitungfaktorial(5));
    }
}
