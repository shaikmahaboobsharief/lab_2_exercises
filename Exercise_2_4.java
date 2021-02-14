package lab_2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_2_4 {
	public static void main(String[] args) {
		modifyArray();
	}
	public static void modifyArray() {
		Scanner num=new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		//taking the size of an array
		int n=num.nextInt();
		System.out.println("Enter the elements of an array: ");
		int[] arr=new int[n];
		//reading elements of an array
		for(int i=0;i<n;i++) {
			arr[i]=num.nextInt();
		}
		//sorting array
		Arrays.sort(arr);
		int k=0;
		int[] temp=new int[n];
		//removing the duplicate elements in array.
		for(int j=0;j<n-1;j++) {
			if(arr[j]!=arr[j+1]) {
				temp[k]=arr[j];
				k=k+1;	
			}
		}
		temp[k++]=arr[n-1];
		for(int l=0;l<k;l++) {
			System.out.println(temp[l]);
		}
		num.close();
	}

}
