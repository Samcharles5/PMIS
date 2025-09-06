package Problems;
import java.util.Scanner;
public class Student_marks_to_grades {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student Mark Range[0-100]: ");
		int mark= s.nextInt();
		if (mark>90) {
			System.out.println("A Grade");
		}
		else if (mark>75) {
			System.out.println("B Grade");
		}
		else if(mark>50) {
			System.out.println("C Grade");
		}
		else if(mark>40) {
			System.out.println("D Grade");
		}
		else {
			System.out.println("FAIL");
		}
	}

}
