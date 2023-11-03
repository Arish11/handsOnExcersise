package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int items;
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of items you want to add in the list");
		items = sc.nextInt();
		System.out.println("Enter the intems");
		for(int i=0; i<items; i++) {
			list.add(sc.nextInt());
		}
		
		//Here I have used Optional because that is the return type of .max method
		//It will either return an int value or empty when there are no elements in the list
		Optional<Integer> largest = list.stream()
		        .max((a, b) -> Integer.compare(a,b));
		
		//"::" is method reference in java, it allows to access a method inside a class directly especially when using lambda expression
		//eg - list.forEach(x->System.out.println(x)) ==== list.forEach(System.out::println)
		int smallest = list.stream()
						.min(Integer::compareTo)//compareTo implements comparable interface in Integer class
						.orElseThrow(() -> new IllegalArgumentException("List is empty"));
		
		//orElseThrow will handle the exception when compareTo in min returns empty using orElseThrow allows us to use
		//int instead of Optional
		int secondSmallest = list.stream()		        
		        .filter(n -> n != smallest)
		        .min(Integer::compareTo) //same as ((a,b)-> Integer.compareTo(a,b))
		        .orElseThrow(() -> new IllegalArgumentException("List contains only one unique element"));
		
		System.out.println(largest.get()+" "+secondSmallest);


	}

}
