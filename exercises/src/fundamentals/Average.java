package fundamentals;

import java.util.Scanner;

public class Average {

	public static double grade1;
	public static double grade2;
	public static double grade3;
	public static double average;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Write your first grade: ");
		grade1 = sc.nextDouble();
		
		System.out.print("Write your second grade: ");
		grade2 = sc.nextDouble();
		
		System.out.print("Write your third grade: ");
		grade3 = sc.nextDouble();
		
		average = calculateAverage(grade1, grade2, grade3);
		
		System.out.printf("Your average is %.2f \n", average);
		
		sc.close();
	}
	
	public static double calculateAverage(double grade1, double grade2, double grade3) {
		double calculateAverage = (grade1 + grade2 + grade3) / 3;
		
		return calculateAverage;
	}
}
