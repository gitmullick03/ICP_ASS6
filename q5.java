/*
 Program: A regular polygon is an n-sided polygon in which all sides are of the same length and all angles have the same degree (i.e., the polygon is both equilateral and equiangular). The formula for computing the area of a regular polygon is
		Area = (𝑛 × 𝑆^2)/(4 ×tan(𝜋/𝑛))
		Write a method that returns the area of a regular polygon using the following header:
		public static double area(int n, double side)
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
import java.util.*;
public class q5{
	public static void main(String args[]) {
		Scanner k=new Scanner(System.in);
		System.out.print("Enter the number of sides of the regular polygon: ");
		int n=k.nextInt();
		System.out.print("Enter the length of side: ");
		double s=k.nextDouble();
		System.out.println("Area of the required polygon is "+area(n,s));
		k.close();
	}
	public static double area(int n, double side) {
		double area=(n*side*side)/(4*Math.tan((Math.PI)/n));
		return area;
	}
}