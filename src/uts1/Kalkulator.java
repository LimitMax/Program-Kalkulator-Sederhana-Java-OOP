/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts1;

public class Kalkulator {
    //
    private int bilangan1;
    private int bilangan2;

    //Constructor
    public Kalkulator(int bilangan1, int bilangan2) {
        this.bilangan1 = bilangan1;
        this.bilangan2 = bilangan2;
    }

    //Getter & Setter
    public int getBilangan1() {
        return bilangan1;
    }

    public void setBilangan1(int bilangan1) {
        this.bilangan1 = bilangan1;
    }

    public int getBilangan2() {
        return bilangan2;
    }

    public void setBilangan2(int bilangan2) {
        this.bilangan2 = bilangan2;
    }
    
    //Penjumlahan
    public int penjumlahan(){
        return bilangan1 + bilangan2;
    }
    
    //Pengurangan
    public int pengurangan(){
        return bilangan1 - bilangan2;
    }
    
    //perkalian
    public int perkalian(){
        return bilangan1 * bilangan2;
    }
    
    //pembagian
    public double pembagian(){
        return bilangan1 / bilangan2;
    }
    
    //hitung faktorial
    public long hitungfaktorial(int bilangan){
     int faktorial = 1;
        for (int i=bilangan; i>0; i--){
            faktorial *=i;
        } return faktorial;
    }
}
