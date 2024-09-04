package project_5;

public class Inc {
	 public static void main(String[] args)
	    {
	        int num= 17, result;
	
	        result = ++num;
            System.out.println("The pre-increment is: " + result);

            result = num++;
            System.out.println("The post-increment is: " + result);
            
            result = --num;
            System.out.println("The pre-decrement is: " + result);

            result = num--;
            System.out.println("The post-decrement is: " + result);

	    }
}
