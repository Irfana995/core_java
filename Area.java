package polymorphism;

import java.util.Scanner;

public class Area {
public void findArea(int side)
{
	System.out.println("Area of the square is "+(side*side));
}
public void findArea(int length,int breadth)
{
	System.out.println("Area of the rectangle is "+(length*breadth));
}
public void findArea(float base,int height)
{
	System.out.println("Area of the triangle is "+(0.5*base*height));
}
public void findArea(float radius)
{
	System.out.print("Area of the circle is "+(3.14*radius*radius));
}
public static class main
{
	public static void main(String args[])
	{
		
		Area area=new Area();
		area.findArea(3);
		area.findArea(4,5);
		area.findArea(5.0f,3);
		area.findArea(4.0f);
		
	}
}

}
