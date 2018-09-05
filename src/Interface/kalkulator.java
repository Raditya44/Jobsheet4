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
public class kalkulator implements operasi{
    public double bil1, bil2,penj,peng,per,pem;
    public void kalkulator()
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
    public double Penjumlahan()
    {
       penj = bil1+bil2;
       return 0;
    };
    public double Pengurangan()
    {
        peng = bil1-bil2;
        return 0;
    };
    public double Perkalian()
    {
        per = bil1*bil2;
        return 0;
    };
    public double Pembagian()
    {
        pem = bil1/bil2;
        return 0;
    };
}
