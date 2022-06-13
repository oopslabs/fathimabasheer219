import exam.*;
import java.util.*;
public class exam1 {

	public static void main (String[]args) {
		
	Scanner s=new Scanner(System.in);
	System.out.println("enter the radius");
	 int a=s.nextInt();
		circle a1=new circle(a);
		System.out.println("Area of circle :");
		a1.area();
		System.out.println("perimeter of circle :");
		a1.perimeter();
		System.out.println("enter the base: ");
		 int b=s.nextInt();
		 System.out.println("enter the height : ");
		 int c=s.nextInt();
		 System.out.println("enter the hypotunus : ");
		 int d=s.nextInt();
		triangle b1=new triangle (b,c,d);
		System.out.println("Area of triangle : ");
		b1.area();
		System.out.println("perimeter of triangle : ");
		b1.perimeter();
	}

}
