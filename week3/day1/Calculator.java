package week3.day1;

public class Calculator 
{
	
	public void add(int x,int y)
	{
	   System.out.println(x+y);
	}

	public void add(int x,int y,int z)
	{
	   System.out.println(x+y+z);
	}
	
	public void mul(double x,double y)
	{
	   System.out.println(x*y);
	}
	
	public void mul(float x,float y)
	{
	   System.out.println(x*y);
	}
	public static void main(String[] args) {
		
	Calculator cal=new Calculator();
	cal.add(30, 50);
    cal.add(10, 20, 30);
    cal.mul(5.2f, 3.8f);
    cal.mul(30d, 50d);
	}

}
