package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	
	public static void main(String[] args) {

        int n = 10000;
        int x = 0;
        int y = 1;
        
        System.out.println("This program lists the Fibonacci sequence.");
        while (x < n)
        {   
        	
            System.out.println(x);

            int fib = x + y;
            x = y;
            y = fib;
        }
    }
}
