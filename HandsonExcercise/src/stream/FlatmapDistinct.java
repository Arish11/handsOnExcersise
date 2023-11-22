package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapDistinct {

	public static void main(String[] args) {
		List<List<Integer>> listOfLists = Arrays.asList(
		        Arrays.asList(1, 2, 3),
		        Arrays.asList(3, 4, 5),
		        Arrays.asList(5, 6, 7)
		);		
		List<Integer> oneList = listOfLists.stream()
		        .flatMap(t -> t.stream()).distinct()
		        .collect(Collectors.toList());
		System.out.println(oneList);
	}

}
