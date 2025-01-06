package array;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas notas você quer registrar? ");
		int numberGrade = sc.nextInt();
		
		double[] grade = new double[numberGrade];
		
		for (int i = 0; i < grade.length; i++) {
			System.out.print("informe a nota " + (i + 1) + " : ");
			grade[i] = sc.nextDouble();
		}
		
		double total = 0.0;
		for (double grades : grade) {
			total += grades;
		}
		
		double average = total / grade.length;
		
		System.out.println("A média é: " + average);
		sc.close();
	}
}
