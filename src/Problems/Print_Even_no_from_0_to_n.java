package Problems;
import java.util.Scanner;
public class Print_Even_no_from_0_to_n {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of N: ");
		int n= s.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}

}
