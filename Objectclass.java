package objectclass;

public class Objectclass {
	static int last_roll=100;
	int roll_no;
	//constructor
	Objectclass()
	{
		roll_no=last_roll;
		last_roll++;
	}
	//overriding hashcode()
	public int hashcode()
	{
		return roll_no;
	}
	//driver code
	public static void main(String args[])
	{
		Objectclass s=new Objectclass();
		
		//below two statements are equivalent
		System.out.println(s);
		System.out.println(s.toString());
		Object obj=new String("FACE");
		Class c=obj.getClass();
		System.out.println("Class of Object obj is :"+c.getName());
		s=null;
		//System.gc();
	}
	protected void finalize()
	{
		System.out.println("finalize method called");
	}
}
