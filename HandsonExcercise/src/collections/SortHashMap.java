package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class SortHashMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		int val, range;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of entries to add in hashmap");
		range = sc.nextInt();
	    for (int i = 0; i < range; i++) {
	            System.out.println("Enter key for entry");
	            String key = sc.nextLine();
	        }
		System.out.println("Hash map before sorting is \n"+ hm.entrySet());
		HashMap<String, Integer> sortMap = sortByValues(hm);
		for(Map.Entry<String, Integer> el : sortMap.entrySet()) {
			System.out.println("The key is "+el.getKey()+" and value is "+el.getValue());
		}
	}
	
	public static HashMap<String, Integer> sortByValues(HashMap<String, Integer> hm){
		List<Map.Entry<String, Integer>> mapList = new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
		Collections.sort(mapList, new Comparator<Map.Entry<String,Integer>>() {
			
			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		HashMap<String, Integer> sortedMap = new LinkedHashMap<String,Integer>();
		for(Map.Entry<String, Integer> el : mapList) {
			sortedMap.put(el.getKey(), el.getValue());
		}
		return sortedMap;	
	}

}
