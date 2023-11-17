package sortingandsearching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int index;;
		int target = 0;
		System.out.println("Enter the element to search");
		target = sc.nextInt();
		index = binarySearch(arr, target);
		if(index<0) {
			System.out.println("Element does not exist in array");
		}else {
			System.out.println("The element is found at index "+index);
		}
	}
	public static int binarySearch(int[] a, int k) {
		int l,r,mid;
		l = 0;
		r = a.length-1 ;
		while(l<=r) {
			mid = l + (r-l)/2 ;
			if(a[mid]==k) {
				return mid;
			}else if(a[mid]<k) {
				l=mid+1;				
			}else {
				r=mid-1;
			}
		}
		return -1;
	}

}
