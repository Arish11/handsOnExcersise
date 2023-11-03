package logical;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExVowel {

	public static void main(String[] args) {	
		String input;
		int vowelCount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to count vowels");
		input = sc.nextLine();
		vowelCount = count(vowelCount,input);
		System.out.println("The number of vowels in the input string is "+vowelCount);
		sc.close();
	}
	
	public static int count(int vowelCount, String s) {
		Pattern pattern = Pattern.compile("[aeiouAEIOU]"); //this will create the pattern with defined regular expression
		Matcher matcher = pattern.matcher(s); //this will match the string with the created regEx
		while(matcher.find()) { //this is used to iterate over the multiple matches found by pattern.matcher(s)
			vowelCount++;
		}
		return vowelCount;
	}

}
