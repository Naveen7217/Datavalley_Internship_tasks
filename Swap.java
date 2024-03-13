import java.io.*;
public class swap_nums {
    public static void main(String[] args) {
        int a = 500;
        int b = 200;
  
        System.out.println("Before swapping the numbers:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //For swapping
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        //Swapped values
        System.out.println("\nAfter swapping the numbers:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}