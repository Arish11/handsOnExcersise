package sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {	
		int size = 0;
		int index;
		System.out.println("Enter number elements to sort");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements");
		for(index = 0;index<size;index++) {
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
		sc.close();

	}

}
