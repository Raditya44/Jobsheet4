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
public class interfacesegitiga implements interfacebangundatar{
    private double alas, tinggi;
    public interfacesegitiga(double alas, double tinggi)
    {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungluas() {
        return((alas*tinggi)/2);
    }

    @Override
    public double hitungkeliling() {
        return 2 * alas * tinggi;
    }
}
