package lab_2;

import java.util.Scanner;

public class Exercise_2_3 {
	public static void main(String[] args) {
		getSorted();
	}
	public static void getSorted() {
		Scanner num=new Scanner(System.in);
		System.out.print("enter the size of an array: ");
		int size=num.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the numbers in a array: ");
		for(int i=0;i<size;i++) {
			arr[i]=num.nextInt();
		}
		int[] b=new int[size];
		int a=size;
		for(int j=0;j<size;j++) {
			b[j]=arr[a-1];
			a=a-1;
		}
		for(int k=0;k<size;k++) {
			System.out.print(b[k]);
		}
		num.close();
	}
}
