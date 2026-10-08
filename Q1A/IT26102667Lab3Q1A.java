import java.util.Scanner;
public class IT26102667Lab3Q1A {

	public static void main(String[] args) {
		
		double priceperkg,quentity,totalamount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice");
		
		priceperkg = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy");
		 
		quentity=input.nextDouble();
		
		totalamount=priceperkg*quentity;
		
		
		System.out.println();
		System.out.println("The total amount is;"+ totalamount);
 }
 
}