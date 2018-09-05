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
public class interfacebujursangkar implements interfacebangundatar {
    private double sisi;
    public interfacebujursangkar(double sisi)
    {
        this.sisi = sisi;
    }

    @Override
    public double hitungluas() {
        return sisi * sisi;
    }

    @Override
    public double hitungkeliling() {
        return sisi * 4;
    }
    
}
