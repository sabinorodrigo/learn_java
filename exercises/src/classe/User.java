package classe;

public class User {

	String name;
	String email;

	public boolean equals(Object object) {
		
		if (object instanceof User) {
			User other = (User) object;
			
			boolean equalsName = other.name.equals(this.name);
			boolean equalsEmail = other.email.equals(this.email);
			
			return equalsName && equalsEmail;
		} else {
			return false;
		}
		
	}
	
	//
	
	public int hashCode() {
		return 0;
	}
	
	
}
