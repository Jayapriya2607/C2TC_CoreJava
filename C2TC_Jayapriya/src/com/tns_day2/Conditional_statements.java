package com.tns_day2;

public class Conditional_statements {

	public static void main(String[] args) {
		   
		   //if statement
		   System.out.println("if Statement:");
		   int i=5;
		   if (i < 15)
               System.out.println("5 is less than 15");
	
		
            //if-else Statement
		    System.out.println("\nif-else Statement:");
		    int j = 10;
		 
	        if (i < 15)
	            System.out.println("j is smaller than 15");
	        else
	            System.out.println("j is greater than 15");
	        
	        
	        //nested-if
	        System.out.println("\nnested-if Statement:"); 
	        int k = 10;
	        
	        if (k == 10 || k<15) {
	            // First if statement
	            if (k < 15)
	                System.out.println("k is smaller than 15");
	 
	            // Nested - if statement
	            if (k < 12)
	                System.out.println(
	                    "k is smaller than 12 too");
	        } else{
	                System.out.println("k is greater than 15");
	        }  
	        
	        
	        //if-else-if ladder
	        System.out.println("\nif-else-if ladder Statement:"); 
	        int l = 20;
	        
	        if (l == 10)
	            System.out.println("l is 10");
	        else if (l == 15)
	            System.out.println("l is 15");
	        else if (l == 20)
	            System.out.println("l is 20");
	        else
	            System.out.println("l is not present");
	        
	        
	        //switch case
	        System.out.println("\nSwitch Statement:");
	        int num=20;
	          switch(num){
	          case 5 :  System.out.println("It is 5");
	                    break;
	          case 10 : System.out.println("It is 10");
	                    break;
	          case 15 : System.out.println("It is 15");
	                    break;
	          case 20 : System.out.println("It is 20");
	                    break;
	          default:  System.out.println("Not present");
	             
	        }
	         
      }
	
}
