/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPraktikumAbstract;

/**
 *
 * @author User
 */
public class abstractsample {
    public static void main(String[] args) {
        bangundatar obyek1 = new bujursangkar(10);
        System.out.println("Luas Bujur Sangkar dengan Sisi 10 = "+obyek1.hitungluas());
        System.out.println("Kelilingnya                       = "+obyek1.hitungkeliling());
        System.out.println("\n");
        bangundatar obyek2 = new lingkaran(7);
        System.out.println("Luas Lingkaran dengan Jari-jari 7 = "+obyek2.hitungluas());
        System.out.println("Kelilingnya                       = "+obyek2.hitungkeliling());
    }
         
}
