package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		Scanner sc = new Scanner(System.in);
		int range,value;
		String key,searchKey;
		System.out.println("How many entries to add in the hash map?");
		range = sc.nextInt();
		System.out.println("Enter the values");
		for(int i=0;i<range;i++) {
			System.out.println("Key: ");
			key = sc.next();
			System.out.println("Value: ");
			value = sc.nextInt();
			hm.put(key, value);
		}
		List<Map.Entry<String, Integer>> mapList = new ArrayList<Map.Entry<String,Integer>>(hm.entrySet());
		System.out.println("The elements in array are\n");
		for (Map.Entry<String, Integer> el : mapList) {
			System.out.println("Key: "+el.getKey());
			System.out.println("Value: "+el.getValue());
		}
		System.out.println("Enter the key to fetch the value from the hash map");
		searchKey = sc.next();
		if(hm.containsKey(searchKey)) {
			System.out.println("The value is"+hm.get(searchKey));
		}else {
			System.out.println("The key is invalid");
		}
		
	}

}
