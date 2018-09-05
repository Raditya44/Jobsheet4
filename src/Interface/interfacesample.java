/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author User
 */
public class interfacesample {
    
    public static void main(String[] args) {
    interfacebujursangkar obyek1 = new interfacebujursangkar(10);
    System.out.println("Luas Bujur Sangkar dengan sisi 10 = "+obyek1.hitungluas());
    System.out.println("Kelilingnya                       = "+obyek1.hitungkeliling());
    System.out.println("\n");
    interfacebangundatar obyek2 = new interfacesegitiga(6,8);
    System.out.println("Luas Segitiga dengan Alas 6 dan Tinggi 8 = "+obyek2.hitungluas());
    System.out.println("Kelilingnya                              = "+obyek2.hitungkeliling());

    }
    
    
}
