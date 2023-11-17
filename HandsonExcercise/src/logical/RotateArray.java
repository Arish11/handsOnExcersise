package logical;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int len = arr.length;
		int arrRot = 0;
		for (int i=0; i<len; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nEnter the number of times to rotate array");
		arrRot = sc.nextInt();
		for(int k=0; k<arrRot; k++) {
			int first = arr[0];
			for(int j=0;j<len-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[len-1]=first;
		}
		System.out.println("\nAfter rotation");
		for (int i=0; i<len; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
