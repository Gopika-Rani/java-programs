import java.util.Scanner;

public class bankingSystem {
	
public static void main(String args[])
		{
		
		  Scanner scanner = new Scanner(System.in);
		   
		  float depositmoney=0;
		  float withdrawmoney;
		  float totalbalance;
		  float accountbalance=0;
	      
	      
	      while(true )  {
	    	  System.out.println("1. Check Balance ");
	    	     

	          System.out.println("2.Deposite Money ");
	          
	        
	          System.out.println("3.Withdraw Money ");
	         
	          
	          System.out.println("4.Exit ");
	          System.out.println("Enter Any Number from 1 to 4 ");
	          
	          String operator = scanner.next();
	          
	         if(operator.equals("4")){
	        	 
	        	 
	         System.out.println(" Ended ");
	         break;
	         }
	         
	         else {

	        if (operator.equals("1")) {
	         
	        	accountbalance = accountbalance + depositmoney;
	        	
	            System.out.println("Account Balance is: $ " + accountbalance);
	            
	        }
	         else if (operator.equals("2")) {
	           
	        	 System.out.println("Enter amount to deposit: "  );
	        	 
	             depositmoney = scanner.nextFloat();
	 
	             System.out.println("Deposit successful! Your new balance is: $ " + depositmoney);
	         }
	         else if (operator.equals("3")){
	             
	        	
               System.out.println("Enter amount to withdraw: "  );
	        	 
	        	  withdrawmoney = scanner.nextFloat();
	        	  
	        	  accountbalance= accountbalance - withdrawmoney;
	        	  System.out.println("Enter amount to withdraw: " );
	 
	             System.out.println("Withdrawal successful! Your new balance is: $" + accountbalance);
	             
	             	totalbalance = depositmoney-withdrawmoney;
		        	
		        	totalbalance = scanner.nextFloat();
		 
		             System.out.println("Withdrawal successful! Your new balance is: $" + totalbalance);
		              
	              
	         }
	  
	         
	      
	         
	         }
	         
	     }
	     
	      scanner.close();
	 }
		
	}
	        

	       
	    




