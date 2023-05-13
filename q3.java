/*
 Program: Write the methods with the following headers
	// Return the reversal of an integer. Example: reverse (456), returns 654
	public static int reverse(int number)
	// Return true if number is a palindrome
	public static boolean isPalindrome(int number)
	Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same as itself.
 	Write a java program that prompts the user to enter an integer and reports whether the integer is a palindrome. 
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class q3{
	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int x=k.nextInt();
		System.out.print("Is "+x+" a palindrome number? "+isPalindrome(x));
		k.close();
	}
	public static int reverse(int x) {
		int n=0;
		while(x!=0) {
			n=(x%10)+(n*10);
			x/=10;
		}
		return n;
	}
	public static boolean isPalindrome(int x) {
		int nx=reverse(x);
		if (nx==x) {return true;}
		else {return false;}
	}
}