package Easys;
import java.util.Scanner;
import java.util.*;
public class Twosum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] arr = new int[5];
		System.out.println("Enter 5 integers");			// Getting user input
	
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt(); 						// printing the array based on the user's input
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter the target");
		int target=in.nextInt();
		
		// the main task area
		
		boolean found=false;
		int n = arr.length;								// n is set to length of the array
		for(int a=0;a<arr.length-1;a++) {				// a starts from 0 ie from the first value in the array
			for(int b=a+1;b<n ; b++) {					// b starts next to a
				if(arr[a]+arr[b]==target) {				// the condition
					System.out.println(Arrays.toString(new int [] {a,b}));	// printing the array
					found=true;							// for boolean's sake
				}
			}
		}
		if(!found) {
			System.out.println("no pairs found");
		}
		in.close();
	}
}
