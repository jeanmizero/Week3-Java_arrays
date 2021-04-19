
public class Objects {

	public static void main(String[] args) {
		// String is object which has method and property
		String name = "Sally Mae";
		System.out.println(name.length());
		System.out.println(name.charAt(6));
		
		// primitive data
		int [] numbers = new int[3];
		
		// equality
		//primitive data(point the same thing in memory)
		int x = 5;
		int y = 5;
		System.out.println(x);
		System.out.println(y);
		System.out.println(x==y);
		
		//string data(point the different thing in memory/ create instance)
		String a = new String("Hello");
		String b = new String("Hello");
		System.out.println(a == b); // is false bcs point different
		System.out.println(a.equals(b)); // is true 
	// Point the same memory
		String c = new String("Hello");
		String d = c; 
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(c==d);
		
		
		
		
		
		
				

	}

}
