//Problem Statement
//Implement a program to display the geometric sequence as given below for a given value n, where n is the number of elements in the sequence.
//
//1, 2, 4, 8, 16, 32, 64, ......, 1024


package Problems;

public class multiple_of_2series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		if (n>0){
		    System.out.print(1+",");
		}
		int val=1;
		for(int i=1;i<n;i++){
		    val*=2;
		    if (i==n-1){
		        System.out.print(val);
		    }else{
		        System.out.print(val+",");
		    }
		    
		}

	}

}



