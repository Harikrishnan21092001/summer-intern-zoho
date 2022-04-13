package Zoho.Task;


class Student
{  
	final int totalNumberOfStudents=100;//can't change the value
	private int roll_no;//data
	private String name;
    public int getRoll_no() //method
    {
		return roll_no;
	}
	public void setRoll_no(int roll_no)
	{
		this.roll_no = roll_no;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;//this keyword is used for refer the instance variable
	}
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + "]";
	}
	
	
}

public class AccessModifiers {

	public static void main(String[] args) {
		Student obj=new Student();
		obj.setRoll_no(556);//We can access the private variable which is declared in another class by creating
		obj.setName("mahesh");//method in that class,by calling that method in another class also.
		System.out.println("Total no of students : "+obj.totalNumberOfStudents);
		System.out.println(obj.getRoll_no()+" "+obj.getName());
		
		


	}

}

