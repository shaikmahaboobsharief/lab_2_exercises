package lab_2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_2_1 {
	public static void main(String[] args) {
		getSecondSmallest();
	}
	public static void getSecondSmallest() {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the size of an array: ");
		int size=s.nextInt();
		int array[]=new int[size];
		System.out.print("enter the nubers in an array: ");
		for(int i=0;i<size;i++) {
			array[i]=s.nextInt();
		}
		Arrays.sort(array);
		int n=array[1];
		System.out.println(n);
		s.close();
	}
}
