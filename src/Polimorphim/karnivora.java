/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorphim;

/**
 *
 * @author User
 */
public class karnivora {
    public static void main(String[] args) {
        System.out.println("===== HEWAN DEFAULT =====");
        hewan h = new hewan();
        h.setNama();
        h.setSuara();
        h.setBerat();
        System.out.println("===== HEWAN KUCING =====");
        kucing k = new kucing();
        k.setNama();
        k.setSuara();
        k.setBerat();
        System.out.println("===== HEWAN SINGA =====");
        singa s = new singa();
        s.setNama();
        s.setSuara();
        s.setBerat();
    }
}
