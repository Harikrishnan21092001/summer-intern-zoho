package Zoho.Task;
interface interface1
{
	int method1();
	float method2();
}
interface interface2
{
	String method3();
	Double method4();
}
class classA implements interface1
{
	public int method1()
	{
		System.out.println("It returns Integer data type");
		return 1;
	}
	public float method2()
	{
		System.out.println("It returns Float data type ");
		return 1.5f;
	}
}	
class classB implements interface2
{
	public String method3()
	{
		System.out.println("It returns String type");
		return "string";
	}
	public Double method4()
	{
		System.out.println("It returns double data type");
		return 5.8888;
	}
}
public class InterfaceDemo
{
	public static void main(String[] args)
	{
		interface1 obj=new classA();
		obj.method1();
		obj.method2();
		interface2 obj1=new classB();
		obj1.method3();
		obj1.method4();
	}
}
