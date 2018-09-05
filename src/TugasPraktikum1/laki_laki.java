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
public class laki_laki extends manusia{
    public laki_laki(double tb)
    {
        super(tb);
    }

    @Override
    public double htgbbi() {
        return ((super.tinggibadan-100) - (10/100 * (super.tinggibadan-100)));
    }
}
