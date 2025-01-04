package fundamentals;

public class TypeString {

	public static void main(String[] args) {
		System.out.println("Hello guys".charAt(0));
		
		String s = "Good morning";
		System.out.println(s.concat("!"));
		System.out.println(s + "!");
		System.out.println(s.startsWith("Good"));
		System.out.println(s.toLowerCase().startsWith("good"));
		System.out.println(s.toUpperCase().endsWith("MORNING"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("good morning"));
		System.out.println(s.equalsIgnoreCase("good morning"));
		
		var name = "Rodrigo";
		var lastName = "Sabino";
		var age = 33;
		var salary = 5385.698;
		
		System.out.println("Name: " + name + "\nLast name: " + lastName + "\nIdade: " + age + "\nSalary: " + salary);
	
		String formatString = "O senhor %s %s tem %d anos e ganha R$%.2f.\n";
		
		System.out.printf(formatString, name, lastName, age, salary);
		
		String frase = String.format(formatString, name, lastName, age, salary);
		
		System.out.println(frase);
		
		System.out.println("Rodrigo Sabino Gomes".contains("Rodrigo"));
		
		
	}
}
