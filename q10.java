/*
 Program: Write a java program to calculate the area of triangle, square, circle, rectangle by using method overloading.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class q10{
	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter the base of triangle: ");
		int b=k.nextInt();
		System.out.print("Enter the height of triangle: ");
		int h=k.nextInt();
		System.out.println("Area of triangle: "+area(b,h)+"\n");
		System.out.print("Enter the length of the side of respective square: ");
		int sq=k.nextInt();
		System.out.println("Area of square: "+area(sq)+"\n");
		System.out.print("Enter the radius of respective circle: ");
		double r=k.nextDouble();
		System.out.println("Area of circle: "+area(r)+"\n");
		System.out.print("Enter the length of rectangle (as integer): ");
		int le=k.nextInt();
		System.out.print("Enter the breadth of rectangle: ");
		double be=k.nextDouble();
		System.out.println("Area of rectangle: "+area(le,be)+"\n");
		k.close();
	}
	public static double area(int b, int h) {
		return (0.5*b*h);
	}
	public static double area(int s) {
		return Math.pow(s, 2);
	}
	public static double area(double r) {
		return Math.PI*Math.pow(r, 2);
	}
	public static double area(int l, double b) {
		return l*b;
	}
}