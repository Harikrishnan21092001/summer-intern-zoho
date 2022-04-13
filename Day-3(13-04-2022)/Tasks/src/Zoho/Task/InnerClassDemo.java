package Zoho.Task;



class Outer
{
	int a;
	public void hello()
	{
		
	}
	class Inner
	{
		public void display()
		{
			System.out.println("InnerClass");
		}
	}
	static class StaticInner
	{
		public void display()
		{
			System.out.println("StaticInnerClass");
		}
	}
}

public class InnerClassDemo {
	

	public static void main(String[] args) 
	{
		Outer obj=new Outer();
		Outer.Inner obj1=obj.new Inner();
		
		Outer.StaticInner obj2=new Outer.StaticInner();
		obj2.display();
		obj1.display();
	}

}

