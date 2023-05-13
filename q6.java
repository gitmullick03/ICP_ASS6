/*
 Program: Write a method that finds the number of occurrences of a specified character in a string using the following header:
		public static int count(String str, char a)
		For example, count ("Welcome", 'e') returns 2.
		Write a java program that prompts the user to enter a string followed by a character and displays the number of occurrences of the character in the string.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class q6{
	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter any word or line: \n");
		String st=k.nextLine();
		System.out.print("\nEnter any character to find its occurence in the specified string: ");
		char c=k.next().charAt(0);
		System.out.println("\nSo occurence of "+c+" in the specified string is "+count(st,c)+".");
		k.close();
	}
	public static int count(String s, char a) {
		int c=0;
		for (int i=0;i<s.length();i++) {
			if (a==s.charAt(i)) {c++;}}
		return c;
	}
}