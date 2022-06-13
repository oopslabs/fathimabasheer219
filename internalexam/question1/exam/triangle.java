package exam;

public class triangle implements shape
{
	int b,h,l;
	public triangle(int i,int j,int k){
		h=j;
		b=i;
		l=k;
	}
	
	public void area(){
		System.out.println(0.5*b*h);
	}
	
	public void perimeter(){
		System.out.println(b+h+l);
	}
	
}
