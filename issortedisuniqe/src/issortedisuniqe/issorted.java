package issortedisuniqe;

//*******************************************************************

//The method name is issorted accepts an array of real numbers from keyboard
//and returns true if the list is in ascending order and false otherwise.

//By: Kidane Hailemichael
//Date 11/15/19
//*******************************************************************


import java.util.Scanner;

public class issorted {

	public static void main(String[] args) {
		
		boolean checksorted;	
		
		Scanner console =new Scanner(System.in);
		
		System.out.println("This program checks if the values in the array are sorted in ascending order");
		System.out.println();
		System.out.println("How many numbers are in the array?");
		int numbers=console.nextInt();
		double[] array = new double[numbers];
		
		
		
		System.out.println("Enter the numbers?");
		
		for(int i=0; i<=numbers-1; i++) {
			array[i]=console.nextDouble();
			
		}
		
		checksorted= isSorted(array);
		System.out.println(checksorted);
		
	}
	public static boolean isSorted(double[] array) {
		
	    for (int i = 0; i < array.length - 1; i++) {
	        if (array[i] > array[i + 1])
	            return false;
	    }
	    return true;

}
}


