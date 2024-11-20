package Easys;
import java.util.Scanner;
import java.util.*;
public class Twosum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] arr = new int[5];
		System.out.println("Enter 5 integers");
	
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter the target");
		int target=in.nextInt();
		
		// the main task area
		
		boolean found=false;
		int n = arr.length;
		for(int a=0;a<arr.length-1;a++) {
			for(int b=a+1;b<n ; b++) {
				if(arr[a]+arr[b]==target) {
					System.out.println(Arrays.toString(new int [] {a,b}));
					found=true;
				}
			}
		}
		if(!found) {
			System.out.println("no pairs found");
		}
		in.close();
	}
}
