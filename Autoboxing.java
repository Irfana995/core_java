package wrapper;

public class Autoboxing
{
	public static void main(String args[])
	{
		Integer i=20;//converting int into integer
		Integer j=i;//autoboxing,now compiler will write Integer.valueOf(a)internally
		System.out.println(i+" "+j);
	}
}
