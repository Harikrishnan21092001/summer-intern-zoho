package Zoho.Task;


	abstract class Human//abstract class
	{
		public abstract void eat();
		public void walk()
		{
			System.out.println("In abstract class");
			
		}
	}
	class man extends Human
	{
		public void eat()
		{
			System.out.println("man can eat");
		}
	}
	class woman extends Human
	{
		public void eat()
		{
			System.out.println("woman can eat");
		}
		public void walk()//override the method which is in the abstract class
		{
			System.out.println("not in abstract class");
			
		}
		
		
	}

public class AbstractClass {

		public static void main(String[] args)
		{
			Human obj=new man();
			obj.walk();
			obj.eat();
			Human obj1=new woman();
			obj1.walk();
			obj1.eat();
			

		}

	}


