package logical;

public class LargestElement {

	public static void main(String[] args) {
		int [] arr = {1,2,512,23,11,43,64,27,8,4};
		int len = arr.length;
		int largest = 0;
		for(int i=0;i<len;i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		System.out.println("The largest element in array is "+largest);
	}

}
