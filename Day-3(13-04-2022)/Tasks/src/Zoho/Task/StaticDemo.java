package Zoho.Task;



class Emp
{
	int emp_id,salary;
	static String ceo;//when static key word used the variable value independent of each object creation
	public void show()//static keyword takes the last object creation value for assigned that variable
	{
		System.out.println(emp_id+":"+salary+":"+ceo);
	}
	/*
	 static
	 {
	 ceo="monika";
	 } // we use static block to assign the value for static value
	 */
}
public class StaticDemo {
	public static void main(String args[])
	{
		Emp naveen=new Emp();
		naveen.emp_id=77;
		naveen.salary=75764;
		naveen.ceo="mahesh";
		
		Emp rahul=new Emp();
		rahul.emp_id=78;
		rahul.salary=75777;
		rahul.ceo="guna";//we dont need object
		naveen.show();
		rahul.show();
		
		Emp.ceo="nikita";//when static keyword used , we can use obj name or else class name 
		naveen.show();
		rahul.show();
		
		
	}

}

