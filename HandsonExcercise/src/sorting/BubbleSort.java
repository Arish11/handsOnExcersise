package sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = new int[10];
		int index;
		System.out.println("Enter 10 elements to sort");
		Scanner sc = new Scanner(System.in);
		for(index = 0;index<10;index++) {
			arr[index] = sc.nextInt();
		}
		System.out.println("Array before sorting");
		for(int el:arr) {
			System.out.print(el+",");
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j = 0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("\nArray after sorting");
		for(int el:arr) {
			System.out.print(el+",");
		}
		System.out.println("\nThe smallest element is : "+arr[0]);

	}

}
