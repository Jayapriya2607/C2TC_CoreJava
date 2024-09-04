package com.tns_day1;

public class Operators {

	public static void main(String[] args) {
		
		//Arithmetic Operators
		System.out.println("Arithmetic Operators:");
		int num1=50;
		int num2=26;
		int sum, sub,  mult,  div,  mod;
		
		sum=num1+num2;
		System.out.println("The Sum= " + sum);
		
		sub = num1 - num2;
        System.out.println("Subtraction = " + sub);
        
        mult = num1 * num2;
        System.out.println("Multiplication = " + mult);
        
        div = num1 / num2;
        System.out.println("Division = " + div);
        
        mod = num1 % num2;
        System.out.println("Remainder = " + mod);
	
	
	   //Relational Operators
        System.out.println("\nRelational Operators:");
        int a = 5, b = 10, c = 5;
	      
        System.out.println("a == c is " + (a == c));
        
        System.out.println("a != b is " + (a != b));
        
        System.out.println("a > b is " + (a > b));
        
        System.out.println("b < c is " + (b < c));
        
        System.out.println("b >= c is " + (b >= c));
        
        System.out.println("a <= b is " + (a <= b));
        
        
        //Assignment operators
        System.out.println("\nAssignment Operators:");
        int num, m= 10, n= 20;
        
        num = m;
        System.out.println("num is assigned: " + m);
        
        m += n;
        System.out.println("m = " + n);
        
        m -= n;
        System.out.println("m = " + n);
        
        m *= n;
        System.out.println("m = " + n);
        
        m /= n;
        System.out.println("m = " + n);
        
        m %= n;
        System.out.println("m = " + n);
        
        
        //Ternary Operators
        System.out.println("\nTernary Operators:");
        int t = 5, s = 10, result;

        result = (t > s) ? (t + s) : (t - s);
        System.out.println("Result = " + result);
        
        result = (t < s) ? (t + s) : (t - s);
        System.out.println("Result = " + result);
        
        
        //Increment Decrement Operators
        System.out.println("\nIncrement Decrement Operators:");
        int u= 17, result1;
		
	    result1 = ++num;
        System.out.println("The pre-increment is: " + result1);

        result1 = num++;
        System.out.println("The post-increment is: " + result1);
        
        result1 = --num;
        System.out.println("The pre-decrement is: " + result1);

        result1 = num--;
        System.out.println("The post-decrement is: " + result1);



    }    

    

 
}

	
        
    
    

