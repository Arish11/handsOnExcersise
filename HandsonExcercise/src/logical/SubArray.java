package logical;

import java.util.ArrayList;

public class SubArray {

	public static void main(String[] args) {
		ArrayList subList = new ArrayList();
		int[] arr = {1,2,3,5,6,74,2};
		int len = arr.length;
		subList = subarraySum(arr,len,11);
		System.out.println(subList.get(0));
		System.out.println(subList.get(1));
	}
	
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
       ArrayList subList = new ArrayList();
       
       for(int i = 0; i<n; i++){
    	   int tempSum = 0;
           for(int j=i;j<n;j++){
               tempSum += arr[j];
               if(tempSum == s){
                   subList.add(i+1);
                   subList.add(j+1);
                   break;
               }
           }
       }
       return subList;
    }

}
