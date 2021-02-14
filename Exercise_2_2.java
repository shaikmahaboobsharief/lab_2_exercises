package lab_2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_2_2 {
	public static void main(String[] args) {
		sortStrings();
	}
	public static void sortStrings() {
		Scanner e=new Scanner(System.in);
		System.out.println("enter the size of the strig");
		int n=e.nextInt();
		String[] arr=new String[n];
		System.out.print("Add elements to string array: ");
		for(int i=0;i<n;i++) {
			arr[i]=e.next();
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
			e.close();
		}
		
	}
	
}
