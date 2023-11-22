package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JoinCollect {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		nameList.add("Abhishek");
		nameList.add("kiara");
		nameList.add("Abhi");
		nameList.add("Rishika");
		String nameString = nameList.stream().collect(Collectors.joining(","));
		int l =nameList.stream().collect(Collectors.summingInt(String::length));
		System.out.println("The string of name "+nameString+" "+l);
	}

}
