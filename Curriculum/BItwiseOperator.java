package Curriculum;

public class BItwiseOperator {
    public static void main(String[] args){
        
        int a= 15; // 00000111
        int b= 27; // 00011011
        int c=-15;
        // 15(decimal digits) --> binary digits()
        
        System.out.println(a & b);
        System.out.println(a|b);
        System.out.println(~a); // focus on this mainly

        // convert into binary 
        // if negative change the bits from 0-1
        // then inverts them again and add + 1 

        System.out.println(a>>1);
        System.out.println(a<<2);
        System.out.println(a>>2);
        System.out.println(c>>>1);

        System.out.println(a++ + ++b + b++ + a); // 15+28+ 28+ 16 = 87

    }
}
