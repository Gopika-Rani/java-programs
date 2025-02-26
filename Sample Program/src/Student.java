import java.util.Scanner;

public class Student {

	public static int addNumbers (int a , int b) {
      
    return a + b;
	}
	
    public static void isEvenOrOdd(int number) {
   
    
    	if (number % 2 == 0){
    		System.out.println("the given number"  +  number  +  " is even" );  		
    	}
    	
    	else{
    		System.out.println("the given number" +  number +" is odd");
    		
    	}		
    		
    }
    
    public static int calculateArea(int length , int width)
    {
    	return length * width ;
    	
    }
    
    public static void findLargest(int num1 , int num2 , int num3)
    {
    	if (num1 > num2 && num1 > num3)
    	{
    		
    		System.out.println("the given number"  +  num1 +  " is largest " );  		
    	}
    	
    
    		else if (num2 > num1 && num2 > num3)
    	{
    			System.out.println("the given number" +  num2 +" is largest ");
    			
        }

    	else if (num3 > num1 && num3 > num2)
        {
        		System.out.println("the given number" +  num3 +" is largest ");
        			
        }
    
    }
    
    public static void printMultiplicationTable() {
    	
    	System.out.print("Enter a number "  );
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	int n = scanner.nextInt();
    	
    	for(int i=1 ; i <= 10 ; i++){
    		
    		int result1 = n * i ;
    
    		System.out.println(n + " * " + i + " = " + result1 );
    
    		scanner.close();
    	}
    }
    
	
   public static void main(String args[]){

	int result = addNumbers( 2 , 2);
		
	System.out.println("Result is: "  + result );
	
	isEvenOrOdd(8);
	isEvenOrOdd(9);
		
		int rectangle = calculateArea (5,8);
		System.out.println("The area of a rectangle with lenght 5 and  width 8 is : "  + rectangle );
		
		findLargest(16,15,1);
		
		printMultiplicationTable();
		
		
		
	}
    
}