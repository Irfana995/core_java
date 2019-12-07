package case4dec;

import java.util.Scanner;

public class abstraction {

	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		int a,b;
		System.out.println("Enter two numbers");
		a=S.nextInt();
		b=S.nextInt();
		abs ob=new inherit();
		ob.add(a,b);
		ob.sub(a,b);
			
		
	}
}
