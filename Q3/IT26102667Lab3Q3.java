import java.util.Scanner;

public class IT26102667Lab3Q3 {
	
	public static void main(String[] args){
	
	//Declare and Initialize variables
	int amount = 0;
	
	int count5000 = 0;
	int count1000 = 0;
	int count500 = 0;
	int count200 = 0;
	int count100 = 0;
	int count50 = 0;
	int count20 = 0;
	int count10 = 0;
	int count5 = 0;
	int count2 = 0;
	int count1 = 0;
	
	//Create a Scanner object to read user input
	Scanner input = new Scanner(System.in);
	
	//Input the Rupee amount
	System.out.print("Enter the Rupee amount: ");
	amount = input.nextInt();    //If amount entered is 2754
	
	// Calculate the number of 5000 rupee notes 
	count5000 = amount / 5000;  // count5000: (2754 / 5000 = 0.55 => 0) = 0
	amount = amount % 5000;     // amount: (2754 % 5000 = 2754) = 2754
	
	// Calculate the number of 1000 rupee notes
	count1000 = amount / 1000;  // count1000: (2754 / 1000 = 2.754 => 2) = 2
	amount = amount % 1000;     // amount: (2754 % 1000 = remainder => 754) = 754 
	                            // Now the amount variable is updated to 754 no longer 2574
								
	// Calculate the number of 500 rupee notes						
	count500 = amount / 500;    // count500: (754 / 500 = 1.508 => 1) = 1
	amount = amount % 500;      // amount: (754 % 500 = remainder => 254) = 254
	                            // Now the amount variable is updated to 254 no longer 754
	
	// Calculate the number of 200 rupee notes
	count200 = amount / 200;    // count200: (254 / 200 = 1.27 => 1) = 1
	amount = amount % 200;      // amount: (254 % 200 = remainder => 54) = 54
	                            // Now the amount variable is updated to 54 no longer 254
	                   
	// Calculate the number of 100 rupee notes		   
	count50 = amount / 100;     // count100: (54 / 100 = 0) = 0
	amount = amount % 100;      // amount: (54 % 100 = 54) = 54  **First Rule Applied
	
	// Calculate the number of 50 rupee notes
	count50 = amount / 50;      // count50: (54 / 50 = 1.08 => 1) = 1
	amount = amount % 50;       // amount: (54 % 50 = remainder => 4) = 4
	
	// Calculate the number of 20 rupee notes
	count20 = amount / 20;      // count20: (4 / 20 = 0) = 0
	amount = amount % 20;       // amount: (4 % 20 = 4) = 4  **First Rule Applied
	
	// Calculate the number of 10 rupee coins
	count10 = amount / 10;      // count10: (4 / 10 = 0) = 0
	amount = amount % 10;       // amount: (4 % 10 = 4) = 4  **First Rule Applied
	
	// Calculate the number of 5 rupee coins
	count5 = amount / 5;        // count5: (4 / 5 = 0) = 0
	amount = amount % 5;        // amount: (4 % 5 = 4) = 4  **First Rule Applied
	
	// Calculate the number of 2 rupee coins
	count2 = amount / 2;        // count2: (4 / 2 = 2) = 2
	amount = amount % 2;        // amount: (4 % 2 = No Remainder => 0) = 0
	
	// Calculate the number of 1 rupee coins
	count1 = amount / 1;        // count1: (0 / 2 = 0) = 0
	amount = amount % 1;        // amount: (0 % 2 = 0) = 0
	
	//Print the resilts
	System.out.println();
	System.out.println("5000 Notes - " + count5000);
	System.out.println("1000 Notes - " + count1000);
	System.out.println("500 Notes - " + count500);
	System.out.println("200 Notes - " + count200);
	System.out.println("100 Notes - " + count100);
	System.out.println("50 Notes - " + count50);
	System.out.println("20 Notes - " + count20);
	System.out.println("10 Coins - " + count10);
	System.out.println("05 Coins - " + count5);
	System.out.println("02 Coins - " + count2);
	System.out.println("01 Coins - " + count1);
	}
}