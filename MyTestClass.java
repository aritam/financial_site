
/* Marisol A. Friday August 27 2021
// Checking for change within integers 0 - 99
// giveChange function counts the least numbers of quarters, dimes, nickels and pennies needed to give change. 
// Thank you for your time today as well as viewing this file. While I'm not used to coding / speaking my code out loud it is something I will work on. 
// I didn't ask for your method to solve this particular issue because I wanted to figure it out myself. Thanks again. 
  */



import java.util.Scanner;


public class MyTestClass {

	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);
	    
	    System.out.print("Enter amount of change: ");
	    int num = input.nextInt();
	    
	    giveChange(num);
	    

	    input.close();
	    
	}
	 
	    
	   public static void giveChange (int num) {
		   
		    int quarters = 0;
		    int dimes = 0;
		    int nickels = 0;
		    int pennies = 0;
	    	
	    	if(num == 0) {
	    		System.out.println("Sorry you can't enter zero!");
	    		return;
	    	} 
	    	
	    	if((num / 25) >= 1 ) {
	    		quarters = quarters + (num / 25);
	    		num %= 25;
	    	} if ((num / 10) >= 1) {
	    		dimes = dimes + (num / 10);
	    		num %= 10;
	    	} if ((num / 5) >= 1) {
	    		nickels = nickels + (num / 5 );
	    		num %= 5;
	    	} 
	    	if ((num / 1) >= 1) {
	    		pennies = pennies + (num / 1);
	    	}
  	
		
	    	System.out.println(quarters + " quarter(s)" + ", " + dimes + " dime(s) " + ", "+ nickels + " nickel(s)" + ", " + pennies + " penny(ies).");
	   } 
		
	   


}


