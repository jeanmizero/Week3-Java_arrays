
public class Arrays {

	public static void main(String[] args) {
		// Create an array
		String [] students = new String[3];
		
		// Access an array 
		students[0] = "Tom Sawyer";
		students[1] = "Jack Smith";
		students[2] = "Bill Turner";
//		System.out.println(students[0]);
		
		//Loop an array
		for(int i = 0; i< students.length; i++) {
			System.out.println(students[i]);	
		}
		
//		Enhance for loop(for each student in students array , print every student(student)
		for(String student: students){
			System.out.println(student);
		}
		
		int [] multiplesOf5 = new int[10];
		for (int i = 0; i < multiplesOf5.length; i++) {
			multiplesOf5[i] = i * 5;
			System.out.println(multiplesOf5[i]);
		
			
			
		}

	}

}
