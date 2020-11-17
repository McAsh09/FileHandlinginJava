package myFileHandling;
import java.io.*;
import java.util.Scanner;

public class writeFile 
{

	public static void main(String[] args) throws Exception
	{

		FileWriter write = new FileWriter("myName.txt");
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Write something");
		str = sc.nextLine();
		write.write(str);
		write.close();
		System.out.println("Written Successfuly!");

	}

}
