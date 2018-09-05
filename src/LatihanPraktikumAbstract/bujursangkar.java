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
public class bujursangkar extends bangundatar{
    private double sisi;
    public bujursangkar(double sisi)
    {
        this.sisi = sisi;
    }
    public double hitungkeliling()
    {
        return 4*sisi;
    }
    public double hitungluas()
    {
        return sisi*sisi;
    }
}
