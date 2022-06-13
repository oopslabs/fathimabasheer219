package exam;


public class circle implements shape {

	int r;
	public circle(int i)
	{
		r=i;
	}
	
	public void area()
	{
		System.out.println(3.14*r*r);
	}
	
	public void perimeter()
	{
		System.out.println(2*3.14*r);
	}
	
	
}