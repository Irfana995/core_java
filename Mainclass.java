package case5dec;
import java.util.Scanner;
public class Mainclass {
	public static void main(String args[])
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=S.nextInt();
		int b=S.nextInt();
		inheritclass ob=new inheritclass();
		ob.add(a,b);
		ob.sub(a,b);
		ob.mul(a,b);
		ob.div(a,b);
			
	}

}
