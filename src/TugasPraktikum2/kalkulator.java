/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class kalkulator implements interfaceoperasi{
    public double bil1, bil2;
    public kalkulator()
    {
        
    }
    public kalkulator(double bil1, double bil2)
    {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    public double getBil1() {
        return bil1;
    }

    public double getBil2() {
        return bil2;
    }
    
    @Override
    public double Penjumlahan() {
        double penjumlahan = bil1+bil2;
        return penjumlahan;
    }

    @Override
    public double Pengurangan() {
        double pengurangan = bil1-bil2;
        return pengurangan;
    }

    @Override
    public double Perkalian() {
        double perkalian = bil1*bil2;
        return perkalian;
    }

    @Override
    public double Pembagian() {
        double pembagian = bil1/bil2;
        return pembagian;
    }
    public static void main(String[] args) {
        
        kalkulator k = new kalkulator();
        Scanner masuk = new Scanner(System.in);
        
        System.out.print("Masukkan Bilangan Pertama: ");
        k.bil1 = masuk.nextDouble();
        System.out.print("Masukkan Bilangan Kedua  : ");
        k.bil2 = masuk.nextDouble();
        System.out.println("\nHasil Penjumlahan   = "+k.Penjumlahan());
        System.out.println("Hasil Pengurangan   = "+k.Pengurangan());
        System.out.println("Hasil Perkalian     = "+k.Perkalian());
        System.out.println("Hasil Pembagian     = "+k.Pembagian());
        
    }
}
