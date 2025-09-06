package Problems;
import java.util.Scanner;
public class Prime_or_not {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no to check prime or not: ");
		int n = s.nextInt();
		boolean prime=true;
		if (n<=1) {
			prime=false;
		}
		else {
			for (int i=2;i<=n;i++) {
				if(n%i==0 && n!=i) {
					prime=false;
					break;
				}
			}
		}
		System.out.println(prime?"Prime":"Not Prime");
	}
}
