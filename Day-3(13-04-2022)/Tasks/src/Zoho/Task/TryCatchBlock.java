package Zoho.Task;

public class TryCatchBlock {

	public static void main(String[] args)
	{
		try
		{
			int n = 9 / 0;//It shows Arithmetic error
		} 
		catch (Exception e) 
		{
			System.err.println("ERROR");//if we put err instead of out in System.out.println
			System.out.println("bye");//,It shows the output in red color
		}

		finally
		{
			System.out.println("bye");
		}
	}

}