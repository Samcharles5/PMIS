//Problem Statement
//Quadratic equation is an equation with degree 2 in the form of ax2 +bx + c = 0 where a, b and c are the coefficients.
//Implement a program to solve a quadratic equation.
//
//Find the discriminant value using the formula given below.
//
//discriminant = b2 - 4ac
//
//If the discriminant is 0, the values of both the roots will be same. Display the value of the root.
//
//If the discriminant is greater than 0, the roots will be unequal real roots. Display the values of both the roots.
//
//If the discriminant is less than 0, there will be no real roots. Display the message "The equation has no real root"
//
//Use the formula given below to find the roots of a quadratic equation.
//
//x = (-b ± discriminant)/2a

package Problems;

public class Quadratic_equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=4,c=4;
		
		int discriminant = (b*b) - (4*a*c);
		
		double root1 = (-b + discriminant) / (2 * a);
		double root2 = (-b - discriminant) / (2 * a);
		
		if (discriminant==0){
		    System.out.println("The root is :"+root1);
		}else if (discriminant>0) {
		    System.out.print("The roots are :"+root1);
		    System.out.print(" , "+root2);
		}else{
		    System.out.println("The equation has no real roots");
		}

	}

}


