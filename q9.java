/*
 Program: Some websites impose certain rules for passwords.
		  Write a method that checks whether a string is a valid password. 
		  Suppose the password rules are as follows: 
		   A password must have at least eight characters. 
		   A password consists of only letters and digits. 
		   A password must contain at least two digits.
		  Write a program that prompts the user to enter a password and displays Valid Password 
		  if the rules are followed or Invalid Password otherwise.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class q9{
	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter a string for password: ");
		String str=k.nextLine(),val=checkPassword(str);
		System.out.print("The specified string is "+val+" for being a password.");
		k.close();
	}
	public static String checkPassword(String s) {
		int c1=0,c2=0;
		for(int i=0;i<s.length();i++) {
			char t=s.charAt(i);
			if ((t>=65 && t<=90)||(t>=97 && t<=122))
				c1++;
			if (t>=48 && t<=57)
				c2++;
		}
		if ((s.length()>=8)&&((c1+c2)==s.length())&&(c2>=2))
			return "valid";
		else
			return "not valid";
	}
}