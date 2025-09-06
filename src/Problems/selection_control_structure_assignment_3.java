//Problem Statement
//Implement a program to calculate the product of three positive integer values. However, if one of the integers is 7, consider only the values to the right of 7 for calculation. If 7 is the last integer, then display -1.
//
//Note: Only one of the three values can be 7.

package Problems;

public class selection_control_structure_assignment_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,5,3};
		int product=1;
		for(int x:arr){
		    if(x==7){
		        product=1;
		        continue;
		    }else{
		        product*=x;
		    }
		}
		System.out.println(arr[arr.length-1]==7? -1 : product);
	}

}
