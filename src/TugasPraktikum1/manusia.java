/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum1;

/**
 *
 * @author User
 */
public abstract class manusia {
    public double tinggibadan;
    public manusia(double tb)
    {
        this.tinggibadan = tb;
    }
    public double getTinggibadan() {
        return tinggibadan;
    }
    public abstract double htgbbi();
}
