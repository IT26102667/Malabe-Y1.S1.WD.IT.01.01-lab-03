import java.util.Scanner;

public class IT26102667Lab3Q2 {
	
	public static void main(String[] args){
		
		int monthlySalary, otrate, othours, otamount; 
		double totalSalary;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly salary:");
		monthlySalary = input.nextInt();
		
		System.out.print("Enter the Number of OT hours:");
		othours = input.nextInt();
		
		System.out.print("Enter the OT hourly rate:");
		otrate = input.nextInt();
		
		otamount = othours * otrate;
		totalSalary = monthlySalary + otamount;
		
		System.out.println();
		System.out.println("The total salary including OT is: " + totalSalary);
	
	}

}