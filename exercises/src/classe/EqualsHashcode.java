package classe;

public class EqualsHashcode {

	public static void main(String[] args) {
		
		User u1 = new User();
		u1.name = "Dark Magician";
		u1.email = "darkmagician@email.com.br";
		
		User u2 = new User();
		u2.name = "Dark Magician";
		u2.email = "darkmagician@email.com.br";
	
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		// System.out.println(u2.equals(new Date()));
	}
}
