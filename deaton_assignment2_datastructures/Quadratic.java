/* Quadratic
 * public class Quadratic
 * simulates a quadratic function and proivides some methods
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
public class Quadratic {
    double a, b, c;                 // ax^2+bx+c
    
    
    
    public Quadratic(){
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
    }
    // Quadratic
    // public Quadratic()
    // initalizes a quadratic function with 0 for a, b and c
    // Parameters:
    // Precondition:
    // Returns:
    // Quadratic that has been initialized with 0 for a, b and c
    public void setA(double z){
        this.a = z;
    }
    // setA
    // public void setA(double z)
    // Parameters:
    // z - double value
    // Precondition:
    // Returns:
    // Quadratic that the value for a has been changed to given
     public void setB(double z){
        this.b = z;
    }
    // setB
    // public void setB(double z)
    // Parameters:
    // z - double value
    // Precondition:
    // Returns:
    // Quadratic that the value for b has been changed to given
      public void setC(double z){
        this.c = z;
    }
    // setC
    // public void setC(double z)
    // Parameters:
    // z - double value
    // Precondition:
    // Returns:
    // Quadratic that the value for c has been changed to given
      public double getA(){
        return this.a;
    }
    // getA
    // public void getA()
    // Parameters:
    // Precondition:
    // Returns:
    // value stored in a
      public double getB(){
        return this.a;
    }
    // getB
    // public void getB()
    // Parameters:
    // Precondition:
    // Returns:
    // value stored in b
      public double getC(){
        return this.a;
    }
    // getC
    // public void getC()
    // Parameters:
    // Precondition:
    // Returns:
    // value stored in c
      public double evaluateQuadraticFor(double x){
          double ans = ((this.a)*( x * x ) + (this.b) * x + this.c);            // taking an input and evaluating the quadratic at that point for ax^2 + bx + c
          return ans;
      }
    // evaluateQuadraticFor
    // public double evaluateQuadraticFor(double x)
    // Parameters:
    // double x 
    // Precondition:
    // Returns:
    // value for quadratic function evaluated at given x
      public Quadratic cloneQuadratic(){
          Quadratic cq = new Quadratic();                                       // creating a new object in memory, setting its values equal to the values of the class that
          cq.a = this.a;                                                        // invoked the method, then returning the object reference of that class;
          cq.b = this.b;
          cq.c = this.c;
          return cq;
      }
    // cloneQuadratic
    // public Quadratic cloneQuadratic()
    // Parameters:
    // Precondition:
    // Returns:
    // object reference for cloned quadratic function
      public boolean equalsQuadratic(Quadratic x){
          if (x.a == this.a && x.b == this.b && x.c == this.c ) {               // if the input classs' values for a, b, and c are the same as the calling class then return true, else return false
              return true;
          }
          else{
              return false;
          }
      }
    // equalsQuadratic
    // public boolean equalsQuadratic(Quadratic x)
    // Parameters:
    // Quadratic x 
    // Precondition:
    // given parameter is an object of the quadratic class 
    // Returns:
    // boolean value of weather the given quadratic is equal to quadratic is what its called on
      public static Quadratic sum(Quadratic q1, Quadratic q2){                  // creating a new object in memory, and then setting its a, b, and c values to the sum of each of the a, b, and 
          Quadratic qs = new Quadratic();                                       // c values of the given quadratic objects respectively.
          qs.a = q1.a + q2.a;
          qs.b = q1.b + q2.b;
          qs.c = q1.c + q2.c;
          return qs;
      }
    // sum
    // public static Quadratic sum(Quadratic q1, Quadratic q2)
    // Parameters:
    // Quadratic q1, Quadratic q2
    // Precondition:
    // given parameters are an object of the quadratic class 
    // Returns:
    // object of quadratic class that is the sum of the given quadratics
      public static Quadratic scale(double r, Quadratic q1){
          Quadratic qs = new Quadratic();                                       // creating a new object in memory, and then setting its a, b, and c values to their values multiplied by given r
          qs.a = q1.a * r;
          qs.b = q1.b * r;
          qs.c = q1.c * r;
          return qs;
      }
    // scale
    // public static Quadratic scale(double r, Quadratic q1)
    // Parameters:
    // double r, Quadratic q1
    // Precondition:
    // given parameter is an object of the quadratic class 
    // Returns:
    // object of quadratic class that is the given Quadratic scaled up by the given double r
}
