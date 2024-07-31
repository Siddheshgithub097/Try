package attern_Programming;

public class Student 
{
	int id ;
	String name ;
	String location ;
	
	public Student()
	{
		
	}
	
	public Student(int id, String name, String location) 
	{
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	public void displayStudent()
	{
		System.out.println(" Id : "+ id);
		System.out.println(" Name : "+ name);
		System.out.println(" Location "+ location);
	}
	
	
}
