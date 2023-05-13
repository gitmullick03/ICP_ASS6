/*
 Program: Write a method that returns the number of days in a year using the following header:
			public static int numberOfDaysInAYear(int year)
		  Write a java program that displays the number of days in year from 2000 to 2020.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
public class q4{
	public static void main(String args[]) {
		for (int i=2000;i<=2020;i++) {
			System.out.println("Number of days in the year "+i+" is "+ numberOfDaysInAYear(i) +".\n");}
	}
	public static int numberOfDaysInAYear(int year) {
		if ((year%4==0 && year%100!=0) || year%400==0) {
			return 366;}
		else
			return 365;
	}
}