import java.rmi.*;
public class MyClient
{
	public static void main(String args[])throws Exception
	{
		Adder obj=(Adder)Naming.lookup("ADD");
		int result=	obj.add(3,6);
		System.out.println("Result :"+result);
	}
}