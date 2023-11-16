package logical;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateCalculator {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days to skip");		
		int n = sc.nextInt();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyy");
		String futureDate = format.format(today.plusDays(n));		
		System.out.println("futureDate is "+futureDate);
		sc.close();
	}

}
