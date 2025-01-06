package array;

import java.util.Arrays;

public class ArrayExercise {

	public static void main(String[] args) {
		
		double[] studentA = new double[4];
		System.out.println(Arrays.toString(studentA));
		
		studentA[0] = 7.9;
		studentA[1] = 8;
		studentA[2] = 6.7;
		studentA[3] = 9.7;
		
		System.out.println(Arrays.toString(studentA));
		
		double totalStudentA = 0.0;
		for (int i = 0; i < studentA.length; i++) {
			totalStudentA += studentA[i];
		}
		
		System.out.println("Student A");
		double average = totalStudentA / studentA.length;
		System.out.println(average);
		
		double[] studentB = { 9.9, 7.7, 5.5, 10 };
		
		double totalStudentB = 0.0;
		for (int i = 0; i < studentB.length; i++) {
			totalStudentB += studentB[i];
		}
		
		System.out.println("Student B");
		average = totalStudentB / studentB.length;
		System.out.println(average);
		
		double[] studentC = new double[] { 8.8, 7.5, 10, 9.8 };
		
		double totalStudentC = 0.0;
		for (int i = 0; i < studentC.length; i++) {
			totalStudentC += studentC[i];
		}
		
		System.out.println("Student C");
		average = totalStudentC / studentC.length;
		System.out.println(average);
	}
}
