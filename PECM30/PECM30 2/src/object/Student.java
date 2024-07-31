package object;

public class Student 
{
	String name;
	int id;
	String coll;
	long phno;
	
	public Student() 
	{
		// TODO Auto-generated constructor stub
	}
	public Student(String name,int id,String coll,long phno)
	{
		super();
		this.name=name;
		this.id=id;
		this.coll=coll;
		this.phno=phno;
	}
	public String toString()
	{
		return "[Name: "+name+",ID: "+id+",College: "+coll+",Phno: "+phno+"]";
	}
	public boolean equals(Object i)
	{
		Student s=(Student)i; //Downcasting
		if (this.name==s.name && this.id==s.id && this.coll==s.coll && this.phno==s.phno)
		{
			return true;
		}
		return false;
	}
}
