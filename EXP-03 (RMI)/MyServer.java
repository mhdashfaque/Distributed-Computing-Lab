import java.rmi.*;

public class MyServer
{
	public static void main(String args[])throws Exception
	{
		AdderRemote obj=new AdderRemote();
		Naming.rebind("ADD",obj);
		System.out.println("Server Started...");
	}
}
	