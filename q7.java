/*
 Program: Write java method called count accepts a string as input and returns the number of vowels in it. The method header is given below.
			public static int count(String str)
		  For example, count ("Welcome") returns 2.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class q7{
	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter any string: ");
		String st=k.nextLine();
		System.out.print("Vowel count in the specified string is: "+count(st));
		k.close();
	}
	public static int count(String s) {
		int c=0,c1=0,c2=0,c3=0,c4=0,c5=0;
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)=='a') 
				c1++;
			if (s.charAt(i)=='e')
				c2++;
			if (s.charAt(i)=='i')
				c3++;
			if (s.charAt(i)=='o')
				c4++;
			if (s.charAt(i)=='u')
				c5++;
		}
		if (c1>0)
			c++;
		if (c2>0)
			c++;
		if (c3>0)
			c++;
		if (c4>0)
			c++;
		if (c5>0)
			c++;
		return c;
	}
}