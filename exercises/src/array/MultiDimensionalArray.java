package array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students? ");
		int qtStudents = sc.nextInt();
		
		System.out.print("How many grade for students? ");
		int qtGrades = sc.nextInt();
		
		double[][] gradesOfClass = new double[qtStudents][qtGrades];
		
		double total = 0.0;
		for (int s = 0; s < gradesOfClass.length; s++) {
			for (int g = 0; g < gradesOfClass[s].length; g++) {
				
				System.out.printf("Enter the student's %d grade %d: ", s + 1, g + 1);
				gradesOfClass[s][g] = sc.nextDouble();
				total += gradesOfClass[s][g];
			}
		}
		
		double average = total / (qtStudents * qtGrades);
		System.out.printf("The class average is %.2f \n", average);
		
		for (double[] gradeStudent : gradesOfClass)
			System.out.println(Arrays.toString(gradeStudent));
		
		sc.close();
	}
}
