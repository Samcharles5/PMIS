//Problem Statement
//Food Corner home delivers vegetarian and non-vegetarian meals to its customers based on the order.
//
//A vegetarian combo costs $12 per plate and a non-vegetarian combo costs $15 per plate. Apart from the cost per plate of food, customers are also charged for home delivery based on the distance in kms from the restaurant to the delivery point. The delivery charges are as mentioned below:
//
//
//
//Given the type of food, quantity (no. of plates) and the distance in kms from the restaurant to the delivery point, implement a program to calculate the final bill amount to be paid by a customer.
//
//The below information must be used to check the validity of the data provided by the customer: 
//
//Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.
//
//Distance in kms must be greater than 0.
//
//Quantity ordered should be minimum 1.
//
//If any of the input is invalid, the bill amount should be displayed as -1.


package Problems;
import java.util.Scanner;
public class selection_control_structure_assignment_4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Food Type 'N' or 'V': ");
		String foodType=s.nextLine();
		System.out.print("Enter Food Quantity: ");
		int foodQuantity=s.nextInt();
		System.out.print("Enter Distance: ");
		int distance=s.nextInt();
		int total=0;
			if (foodType.equals("N")) {
				total+=15;
			}else if(foodType.equals("V")) {
				total+=12;
			}else {
				System.out.println("Invalide Food Type");
			}
			
		if (foodQuantity>0) {
			total*=foodQuantity;
		}else {
			System.out.println("Invalid Food Quantity");
		}
	
		
		if (distance>6) {
			total+=2;
		}else if(distance>3) {
			total+=1;
		}else if(distance>0) {
			total+=0;
		}else {
			System.out.println("Invalide Distance");
		}	
		
		System.out.println("Total Bill: "+total+"$");

	}

}
