package Problems;
import java.util.Scanner;
public class Simple_calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("What operation You want to perform");
		System.out.print("1.Addation(+) \t 2.subtraction(-) \t 3.Multiplication(*) \t 4.Devision(/) \t 5.Modulus(%): ");
		int operator=s.nextInt();
		System.out.print("Enter first operant: ");
		int operant1=s.nextInt();
		System.out.print("Enter second operant: ");
		int operant2=s.nextInt();
		
		
		switch(operator) {
		case 1: System.out.println(operant1+"+"+operant2+" = "+(operant1+operant2)); break;
		case 2: System.out.println(operant1+"-"+operant2+" = "+(operant1-operant2)); break;
		case 3: System.out.println(operant1+"*"+operant2+" = "+(operant1*operant2)); break;
		case 4: System.out.println(operant1+"/"+operant2+" = "+(operant1/operant2)); break;
		case 5: System.out.println(operant1+"%"+operant2+" = "+(operant1%operant2)); break;
		default: System.out.println("Invalid input");
		
		}

	}

}
