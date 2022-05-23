/* Rational Number
 * public class RationalNumber
 * a RationalNumber is integers written as fractions.
 *
 *
 *
 *
 *
 *
 */
package deaton_assignment2_datastructures;

/**
 *
 * @author Adeat
 */
public class RationalNumber {
    int numerator, denominator;
    
    
    public RationalNumber(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        if (denominator == 0){
            throw new IllegalArgumentException("Denominator cannot equal 0");
        }
    // RationalNumber
    // public RationalNumber(int numerator, int denominator)
    // initalizes a RationalNumber with given numerator and denominator
    // Parameters:
    // numerator - numerator of the fraction
    // denominator - denominator of the fraction
    // Precondition:
    // denominator does not equal 0
    // Returns:
    // RationalNumber has been initalized with given values for numerator and denominator
    // Throws Illegal Argument Exception:
    // indicates that the given denominator is 0
    }
    public RationalNumber(){
        this.numerator = 0;
        this.denominator = 1;
    }
    // RationalNumber
    // public RationalNumber(int numerator, int denominator)
    // initalizes a RationalNumber numerator to 0 and denominator to 1
    // Parameters:
    // Precondition:
    // Returns:
    // RationalNumber has been initalized numerator to 0 and denominator to 1
    public int getNumerator(){
        return this.numerator;
    }
    // getNumerator
    // public int getNumerator();
    //
    // Parameters:
    //
    //
    // Precondition:
    //
    // Returns:
    // value for numerator on instance of class it was called on
    public int getDenominator(){
        return this.denominator;
    }
    // getDenominator
    // public int getDenominator();
    //
    // Parameters:
    //
    //
    // Precondition:
    //
    // Returns:
    // value for denominator on instance of class it was called on
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    // setNumerator
    // public void setNumerator();
    //
    // Parameters:
    // numerator - integer value for numerator
    //
    // Precondition:
    // 
    // Returns:
    // sets RationalNumbers numerator to provided numerator
    public void setDenominator(int denominator){
        if(denominator != 0){
            this.denominator = denominator;
        }
        else{
            throw new IllegalArgumentException("Denominator cannot equal 0");
        }
    }
    // setDenominator
    // public void setDenominator();
    //
    // Parameters:
    // denominator - integer value for numerator
    //
    // Precondition:
    // denominator is not 0
    // Returns:
    // sets RationalNumbers denominator to provided numerator
    // Throws Illegal Argument Exception:
    // indicates provided denominator is 0
    public static RationalNumber addition(RationalNumber rn1, RationalNumber rn2){                        // takes both rational numbers and adds the numerator and the donominator by creating a common factor in denominator then adding the numerator
        RationalNumber rna = new RationalNumber();                                                        // stores those calues into another object of the class and returns it
        rna.setNumerator((rn1.getNumerator() * rn2.getDenominator()) + (rn2.getNumerator() * rn1.getDenominator()));
        rna.setDenominator((rn1.getDenominator() * rn2.getNumerator()) + (rn2.getDenominator() * rn1.getNumerator()));
        return rna;
    }
    //
    // addition
    // public static RationalNumber addition(RationalNumber rn1, RationalNumber rn2)
    // Parameters: 
    // 2 objectos of the RationalNumbers class
    // Precondition:
    // given objects are of RationalNumbers class
    // Returns:
    // object of RationalNumbers class with values derived from adding given numerators and denominators
    //
    public static RationalNumber multiplication(RationalNumber rn1, RationalNumber rn2){                  // takes both rational numbers, and multiplies the numerators and denominators then
        RationalNumber rnm = new RationalNumber();                                                        // stores those values into another object of the class and returns it
        rnm.setNumerator(rn1.getNumerator() * rn2.getNumerator());
        rnm.setDenominator(rn1.getDenominator() * rn2.getDenominator());
        return rnm;
    }
    //
    // multiplication
    // public static RationalNumber multiplication(RationalNumber rn1, RationalNumber rn2)
    // Parameters: 
    // 2 objectos of the RationalNumbers class
    // Precondition:
    // given objects are of RationalNumbers class
    // Returns:
    // object of RationalNumbers class with values derived from multiplying given parameters
    //
    public static RationalNumber division(RationalNumber rn1, RationalNumber rn2){                         // takes both rational numbers, and multiplies one by the reciprical of the other
        RationalNumber rnm = new RationalNumber();                                                         // stores those values into another object of the class and returns it
        rnm.setNumerator(rn1.getNumerator() * rn2.getDenominator());
        rnm.setDenominator(rn1.getDenominator() * rn2.getNumerator());
        return rnm;
    }
    //
    // division
    // public static RationalNumber division(RationalNumber rn1, RationalNumber rn2)
    // Parameters: 
    // 2 objectos of the RationalNumbers class
    // Precondition:
    // given objects are of RationalNumbers class
    // Returns:
    // object of RationalNumbers class with values derived from deviding given parameters
    //
    public boolean equalsRationalNumber(RationalNumber rn1){
    if (((rn1.numerator == this.numerator) && (rn1.denominator == this.denominator)) || ((rn1.numerator / rn1.denominator) == (this.numerator / this.denominator))){
        return true;
    }
    else{
        return false;
    }
    }
    //
    // equalsRationalNumber
    // public boolean equalsRationalNumber(RationalNumber rn1)
    // Parameters:
    // object of RationalNumbers class
    // Precondition:
    // given object is of RationalNumbers class
    // Returns: 
    // boolean for if the parameter is equal to the class it was called on
    //
    public RationalNumber cloneRationalNumber(){
        RationalNumber rnc = new RationalNumber();
        rnc.numerator = this.numerator;
        rnc.denominator = this.denominator;
        return rnc;
    }
    //
    // cloneRationalNumber
    // public RationalNumber cloneRationalNumber()
    // Parameters:
    //
    // Precondition:
    // given object is of RationalNumbers class
    // Returns:
    // object clone of given parameter
    //
    @Override
    public String toString(){
        String out;
        if ((this.numerator >= 0) && (this.denominator < 0) ){
            out = (-this.numerator + "/" + Math.abs(this.denominator));
        }
        else if ((this.numerator < 0) && (this.denominator < 0)){
            out = (Math.abs(this.numerator) + "/" + Math.abs(this.denominator));
        }
        else{
            out = (this.numerator + "/" + this.denominator);
        }
        return out;
    }
    //
    // toString
    // String toString()
    // Parameters:
    //
    // Precondition:
    //
    // Returns: RationalNumber in correct format
    //
    //
    //
}
