package array;

import java.util.Arrays;

public class Exercise {

	public static void main(String[] args) {
		
		double[] gradeStudentA = new double[4];
		System.out.println(Arrays.toString(gradeStudentA));
		
		gradeStudentA[0] = 7.9;
		gradeStudentA[1] = 8;
		gradeStudentA[2] = 6.5;
		gradeStudentA[3] = 9.8;
		
		System.out.println(Arrays.toString(gradeStudentA));
		System.out.println(gradeStudentA[0]);
		System.out.println(gradeStudentA[gradeStudentA.length -1]);
		
		System.out.println("Grades Student A");
		
		double totalStudentA = 0.0;
		for (int i = 0; i < gradeStudentA.length; i++) {
			totalStudentA += gradeStudentA[i];
		}
		
		double averageA = totalStudentA / gradeStudentA.length;
		System.out.println(averageA);

		///////////////////////////////////////////////////////////
		System.out.println("Grades Student B");
		
		double gradeStored = 5.9;
		double[] gradeStudentB = { 8.5, 7.5, 6.5, gradeStored, 9.8 };
		
		double totalStudentB = 0.0;
		for (int i = 0; i < gradeStudentB.length; i++) {
			totalStudentB += gradeStudentB[i];
		}
		
		double averageB = totalStudentB / gradeStudentB.length;
		System.out.println(averageB);
		
		///////////////////////////////////////////////////////////
		System.out.println("Grades Student C");
		
		double[] gradeStudentC = new double[] { 6.5, 6.5, 7.5, 10 };
		
		double totalStudentC = 0.0;
		for (int i = 0; i < gradeStudentC.length; i++) {
			totalStudentC += gradeStudentC[i];
		}
		
		double averageC = totalStudentC / gradeStudentC.length;
		System.out.println(averageC);
		
	}
}
