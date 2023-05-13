/*
 Program: A pentagonal number is defined as n (3n–1)/2 for n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . . .
		Write a method with the following header that returns a pentagonal number:
		public static int getPentagonalNumber(int n)
		Write a java program that uses this method to display the first 100 pentagonal numbers with 10 numbers on each line.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
public class q2{
	public static int getPentagonalNumber(int n) {
		int i=(3*n-1)/2;
		return i;
	}
	public static void main(String args[]) {
		int n=1;
		for (int i=1;i<=10;i++) {
			for (int j=1;j<=10;j++) {
				System.out.print(getPentagonalNumber(n++)+" ");
			}
			System.out.println();
		}
	}
}