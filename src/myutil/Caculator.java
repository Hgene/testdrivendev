/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myutil;

/**
 *
 * @author TEST
 */
public class Caculator {

    private final float val1;
    private final float val2;
    Caculator(float a, float b)
    {
        this.val1 = a;
        this.val2 = b;
    }
    public float sum(){
        return val1 + val2;
    }
}
