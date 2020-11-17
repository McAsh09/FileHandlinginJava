package myFileHandling;
import java.io.*;
import java.util.Scanner;
public class readFile 
{

	public static void main(String[] args) throws Exception
	{

		FileReader read = new FileReader("myName.txt");
		Scanner sc = new Scanner(read);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		
		

	}

}
