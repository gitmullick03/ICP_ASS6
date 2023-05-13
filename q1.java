/*
 Program: Design a Simple Calculator using methods in java containing the following functionalities, namely, with Addition, Subtraction, Multiplication, Remainder, Division and Square Root. The signature of the methods are given below.
	 public static int additionSimple(int x, int y)
	 Two inputs, x and y. Return the result of adding x to y.
	 public static int subtractionSimple(int x, int y)
	 Two inputs, x and y. Return the result of subtracting x from y i.e y-x.
	 public static int multiplicationSimple(int x, int y)
	 Two inputs, x and y. Return the result of multiplying x to y i.e. x*y.
	 public static double divisionSimple(int x, int y)
	 Two inputs, x and y. Return the result of dividing y by x. Please check whether x is zero before dividing.
	 public static int remainderSimple(int n, int m)
	 Please make sure that remainderSimple() takes two inputs, namely, a number (int) n and a number (int) m. The method should return the remainder of n divided by m.
	 public static double squareRootSimple(int n)
	 Takes one input, namely a number n, and returns the square root of the number. The return should be double. Please kindly make sure that the number n is positive.
 
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class q1 {
	public static int additionSimple(int x, int y) {
		return x+y;
	}
	public static int subtractionSimple(int x, int y) {
		return y-x;
	}
	public static int multiplicationSimple(int x, int y) {
		return x*y;
	}
	public static double divisionSimple(int x, int y) {
		return y/x;
	}
	public static int remainderSimple(int n, int m) {
		return n%m;
	}
	public static double squareRootSimple(int n) {
		return Math.pow(n,0.5);
	}
	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		System.out.print("\nOPERATIONS MENU"
				+ "\n1. Addition"
				+ "\n2. Subtraction"
				+ "\n3. Multiplication"
				+ "\n4. Remainder"
				+ "\n5. Division"
				+ "\n6. Square root"
				+ "\nEnter a choice: ");
		int ch=k.nextInt(),x,y;
		switch(ch) {
		case (1):
			System.out.print("Enter x: ");x=k.nextInt();
			System.out.print("Enter y: ");y=k.nextInt();
			System.out.print("Result is "+additionSimple(x,y));break;
		case (2):
			System.out.print("Enter x: ");x=k.nextInt();
			System.out.print("Enter y: ");y=k.nextInt();
			System.out.print("Result is "+subtractionSimple(x,y));break;
		case (3):
			System.out.print("Enter x: ");x=k.nextInt();
			System.out.print("Enter y: ");y=k.nextInt();
			System.out.print("Result is "+multiplicationSimple(x,y));break;
		case (5):
			System.out.print("Enter x>0 or x<0 : ");x=k.nextInt();
			System.out.print("Enter y: ");y=k.nextInt();
			if (x!=0) {
				System.out.print("Result is "+divisionSimple(x,y));break;}
			else {
				System.out.println("Invalid input!");break;}
		case(4):
			System.out.print("Enter x: ");x=k.nextInt();
			System.out.print("Enter y: ");y=k.nextInt();
			System.out.print("Result is "+remainderSimple(x,y));break;
		case(6):
			System.out.print("Enter x: ");x=k.nextInt();
			if (x>0) {
				System.out.print("Result is "+squareRootSimple(x));break;}
			else {
				System.out.println("Invalid input!");break;}
		}
		k.close();
	}}
