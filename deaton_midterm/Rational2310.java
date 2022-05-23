/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_midterm;

/**
 *
 * @author Adeat
 */
public class Rational2310 {
    private int numerator;
    private int denominator;
    public Rational2310(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Rational2310(){
        this.numerator = 0;
        this.denominator = 1;
    }
    public int getNumerator(){
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }
    public static Rational2310 multiplication(Rational2310 rn1, Rational2310 rn2){                  // takes both rational numbers, and multiplies the numerators and denominators then
        Rational2310 rnm = new Rational2310();                                                        // stores those values into another object of the class and returns it
        rnm.setNumerator(rn1.getNumerator() * rn2.getNumerator());
        rnm.setDenominator(rn1.getDenominator() * rn2.getDenominator());
        return rnm;
    }
    public static Rational2310 reverse(Rational2310 rn1){
        Rational2310 rnr = new Rational2310();
        rnr.setNumerator(rn1.getDenominator());
        rnr.setDenominator(rn1.getNumerator());
        return rnr;
    }
   /*  add your method reverse here. */


   /*  add your method multiply here. */

}

