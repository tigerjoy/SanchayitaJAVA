// Scored - 7 points
import java.util.Scanner;
public class Complex
{
    static Scanner sc = new Scanner(System.in);
    double real;
    double imag;
    Complex()
    {
        // OBSERVATION #1
        // Are these initialization values?
        this(3.0,4.0);
    }
    Complex(double real,double imag)
    {
        // OBSERVATION #2
        // If a parameterized constructor is giving
        // default values to the constructor, then
        // what will the default constructor doing?
        this.real=0.0;
        this.imag=0.0;
    }
    
    void input()
    {
        System.out.println("Enter the real part");
        real= sc.nextDouble();
        System.out.println("Enter the Imaginary part");
        imag= sc.nextDouble();  
    }
    Complex Add(Complex A)
    {
        Complex res = new Complex(real,imag);
        res.real = A.real+this.real;
        res.imag = A.imag+this.imag;
        return res;
    }
    // OBSERVATION #3
    // When you perform X - Y, do you 
    // (i) Subtract X from Y? or
    // (ii) Subtract Y from X?
        Complex Subtract(Complex A)
    {
        Complex res = new Complex(real,imag);
        res.real = A.real-this.real;
        res.imag = A.imag-this.imag;
        return res;
    }
    Complex Multiply(Complex A)
    {
        Complex res = new Complex(real,imag);
        res.real= (A.real * this.real - A.imag * this.imag) ;
        res.imag=(A.real * this.imag + A.imag * this.real) ;
        return res;
    }
    Complex Divide(Complex A)
    {
        Complex res = new Complex(real,imag);
        res.real=(this.real*A.real+this.imag*A.imag/(Math.pow(A.real,2))+(Math.pow(A.imag,2)));
         res.imag=(this.imag*A.real-this.real*A.imag/(Math.pow(A.real,2))+(Math.pow(A.imag,2)));
         return res;
    }
    double modulus()
    {
        return Math.sqrt(this.real*this.real+this.imag*this.imag);
    }
    Complex conjugate()
    {
        Complex res = new Complex(real,imag);
        if(this.imag<0)
        {
            res.imag=Math.abs(this.imag);
            res.real= this.real;
        }
        else
        {
            res.imag= this.imag-2*this.imag;
            res.real=this.real;
        }
        return res;
    }
    Complex squareRoot()
    {
        Complex res = new Complex(real,imag);
        res.real=(Math.sqrt((Math.sqrt(this.real*this.real+this.imag*this.imag))+this.real)/2.0);
        res.imag=(Math.sqrt((Math.sqrt(this.real*this.real+this.imag*this.imag))-this.real)/2.0);
        return res;
    }
    void display()
    {
        System.out.println(real+"+"+imag+"i");
    }
    public static void main(String[] args) 
    {
        Complex A = new Complex();
        A.input();
        Complex B= new Complex();
        B.input();
        System.out.println("ADDITION:");
        Complex res = A.Add(B);
        res.display();
        System.out.println("SUBTRACTION:");
        Complex res1 = A.Subtract(B);
        res1.display();
        System.out.println("MULTIPLICATION:");
        Complex res2 = A.Multiply(B);
        res2.display();
        System.out.println("DIVISION:");
        Complex res3 = A.Divide(B);
        res3.display();
        System.out.println("MODULUS A:");
        System.out.println(A.modulus());
        System.out.println("MODULUS B:");
        System.out.println(B.modulus());
        System.out.println("CONJUGATE A:");
        Complex res4 = A.conjugate();
        res4.display();
        System.out.println("CONJUGATE B:");
        Complex res5 = B.conjugate();
        res5.display();
        System.out.println("SQUARE ROOT A:");
        Complex res6 = A.squareRoot();
        res6.display();
        System.out.println("SQUARE ROOT B:");
        Complex res7 = B.squareRoot();
        res7.display();
        
    }
}


