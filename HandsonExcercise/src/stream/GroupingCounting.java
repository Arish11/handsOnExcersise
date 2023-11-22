package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingCounting {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		nameList.add("Abhishek");
		nameList.add("kiara");
		nameList.add("Abhi");
		nameList.add("Rishika");
		Map<Character, Long> result = nameList.stream().collect(Collectors.groupingBy(x -> x.charAt(0), Collectors.counting()));
		System.out.println("The answer is "+result);
	}

}
