package array;

public class Foreach {

	public static void main(String[] args) {
		
		double[] grades = { 9.9, 5.8, 4.8, 10 };
		
		System.out.println("Traditional For");
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + " ");
		}
		
		System.out.println("\n");
		System.out.println("Foreach");
		for (double grade : grades) {
			System.out.print(grade + " ");
		}
	}
}
