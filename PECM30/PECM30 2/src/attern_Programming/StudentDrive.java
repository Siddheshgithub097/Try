package attern_Programming;

public class StudentDrive 
{
	public static void main(String[] args) {
		
		Student student = new Student(1, " Siddhesh ", " Junnar ");
		
		Student student2 = new Student(2, " Riddhi ", " Junnar ");
		
		student.displayStudent();
		student2.displayStudent();
		
		System.out.println(student.equals(student2));
	}
}
