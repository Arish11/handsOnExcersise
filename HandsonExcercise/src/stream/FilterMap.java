package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMap {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();		
		list.add(10);
		list.add(1);
		list.add(19);
		list.add(3);
		list.add(18);
		list.add(11);
		list.add(4);
		List<Integer> sqList = list.stream().filter(x -> x%2 == 0).map( x -> x*x).collect(Collectors.toList());
		System.out.println("Squared list is "+sqList);
	}

}
