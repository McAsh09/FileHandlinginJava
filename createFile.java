package myFileHandling;
import java.io.*;
public class createFile 
{

	public static void main(String[] args)
	{

		File myFile = new File("myName.txt");
		try
		{
			if(myFile.createNewFile())
			{
				System.out.println("File created with name: "+myFile.getName());
			}
			else
				System.out.println("File already Exists!");
		}
		catch(Exception e)
		{
			System.out.println("ERRORRR");
		}
		

	}

}
