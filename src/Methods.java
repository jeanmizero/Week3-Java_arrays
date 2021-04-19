
public class Methods {

	public static void main(String[] args) {
		// Method help us to reuse the code
		String firstName = "John";
		String lastName = "Doe";
		String fullName = CreateFullName(firstName ,lastName);
		System.out.println(fullName);

	}
      //	Create method outside public static method
      // public static: access modify, String: return type,CreateFullName: name of variable/use verb
      // and ():can be blank/hold parameters or inputs and use return type(String firstName)
	public static String CreateFullName(String firstName, String lastName) {
         //create fullName
		String fullName = firstName + " " + lastName;
		return fullName;
	
		//return firstName + " " + lastName;
	}

}
