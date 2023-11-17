package collections;


import java.util.Scanner;

public class LinkedList {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add();
	
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("What do want to do choose ? \n1)add\n2)remove\n3)view");
		choice = sc.nextInt();
		switch (choice) {
		case 1: {
			int count = 0;
			System.out.println("How many element you want to add?");
			for(int i=0; i<count;i++) {
				
			}
			break;
		}
		
		case 2: {
			System.out.println("Removing");
			break;
		}
		
		case 3: {
			System.out.println("Viewing");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}

}
