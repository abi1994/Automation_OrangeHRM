public class Employee {
 
	String name;
	int age;
	
	public Employee()
	{
		System.out.println("Calling no arg constructor");
	}
	public void workOnAssignment()
	{
		// Working on assignment
	}
	
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public int getAge() {
		return age;
	}
 
	public void setAge(int age) {
		this.age = age;
	}
 
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.setName("John");
		e1.setAge(20);
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
	}
}