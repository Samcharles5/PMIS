package Problems;
import java.util.Scanner;
public class Fibonacci_series {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Value  of N: ");
		int n=s.nextInt();
		
		int n1=0;
		int n2=1;
		
		if (n==0) {
			System.out.println(n);
		}else if (n==1) {
			System.out.println(n1+" "+n2);
		}else {
			
			System.out.print(n1+" "+n2+" ");
			
			for(int i=3;i<=n;i++) {
				int n3=n1+n2;
				int temp=0;
				System.out.print(n3+" ");
				temp=n1;
				n1=n2;
				n2=n3;
			}
		}

	}

}
