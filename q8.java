/*
 Program: Write a java method to check a string is palindrome or not.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class q8 {
	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter any string: ");
		String str=k.nextLine();
		System.out.println("Is the specified string a palindrome? "+isPalindrome(str));
		k.close();
	}
	public static boolean isPalindrome(String s) {
		String rts="";
		for (int i=s.length()-1;i>=0;i--) {
			rts+=s.charAt(i);}
		if (s.equalsIgnoreCase(rts))
			return true;
		else
			return false;
	}
}
