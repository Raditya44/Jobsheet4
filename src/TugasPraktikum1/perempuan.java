/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum1;

import java.util.Scanner;

/**
 *
 * @author User
 */
final class perempuan{
    
    public double tinggibadan;
    public perempuan(double tb)
    {
        this.tinggibadan = tb;
    }
    final double htgbbi()
    {
        return ((169-100)-(15/100*(169-100)));
    }
    public static void main(String[] args) {
        laki_laki l = new laki_laki(0);
        perempuan p = new perempuan(0);
        String pilihan = "P, L, l, p";
        int tinggi;
        int i = 0;
        Scanner input = new Scanner(System.in);
        do{      
        for(i = 1;i<=2;i++)
        {
            System.out.println("User "+i);        
            System.out.print("Masukkan Tinggi Badan Anda (cm)        : ");
            l.tinggibadan = p.tinggibadan = input.nextDouble();
            System.out.print("Masukkan Jenis Kelamin Anda (L/P)      : ");
            pilihan = input.next();
        switch(pilihan)
        {
            case "L" : System.out.println("Berat Badan Ideal Laki-laki Ini Adalah "+l.htgbbi());break;
            case "P" : System.out.println("Berat Badan Ideal Perempuan Ini Adalah "+p.htgbbi());break; 
            case "l" : System.out.println("Berat Badan Ideal Laki-laki Ini Adalah "+l.htgbbi());break;
            case "p" : System.out.println("Berat Badan Ideal Perempuan Ini Adalah "+p.htgbbi());break; 
        }   
        }       
          
        }while(i != 3);                       
    }
}
