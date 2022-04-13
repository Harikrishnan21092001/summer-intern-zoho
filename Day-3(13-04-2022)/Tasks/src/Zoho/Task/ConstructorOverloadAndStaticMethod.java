package Zoho.Task;



class calc
{
	int  num1,num2,result;//these are the instance variable
	static int no1,no2,output;
	public int perform()//method
	{
		return result =num1+num2;
		
	}
	public  void sub()
	{
		result=num1-num2;
	}
	public calc() //constructor
	{
		num1=6;
		num2=9;
		
	}
	public calc(int n)
	{//int n is the local variable
		num1=n;//orange colour is local variable
		num2=n;//num1,num2 are instance variable
	}
	public calc(int num1,int num2)//constructor overloading
	{
		this.num1=num1; //when we use same name for both instance and local variable this keyword is
		this.num2=num2; //used to specify the instance variable
	} //this represents the current object
	public static int multi(int a,int b)//static method
	{
		no1=a;
		no2=b;
		return no1*no2;
	}
}
public class ConstructorOverloadAndStaticMethod {
	public static void main(String[] args)
	{
		calc obj=new calc();
		//obj.num1=8;
		//obj.num2=9;
		//obj.sub();
		calc obj1=new calc(7);
		System.out.println(obj1.num1);
		System.out.println(obj.num1);
		System.out.println(obj.result);//before assign value the result value is 0 as default
		int ans = obj.perform();
		System.out.println(ans);
		System.out.println(calc.multi(7, 6));
		
	}

}
