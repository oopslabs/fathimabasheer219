package fathima;
import java.util.*; 
import java.util.Scanner;
public class product {

	int price,pcode;
	String  pname;
	public product(String a,int b,int c)
	{
		pname=a;
		pcode=b;
		price=c;
	}
	public static void main(String[] args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("enter the name of the product:");
		String a=S.nextLine();
		System.out.println("enter the product code:");
		int b=S.nextInt();
		System.out.println("enter the PRICE of the product:");
		int c=S.nextInt();
		product obj1=new product(a,b,c);
		
		S.nextLine();
		System.out.println("enter the name of the 2nd product:");
		String d=S.nextLine();
		System.out.println("enter the product code:");
		int e=S.nextInt();
		System.out.println("enter the PRICE of the product:");
		int f=S.nextInt();
		product obj2=new product(d,e,f);
		
		S.nextLine();
		System.out.println("enter the name of the 3rd product:");
		String g=S.nextLine();
		System.out.println("enter the product code:");
		int h=S.nextInt();
		System.out.println("enter the PRICE of the product:");
		int i=S.nextInt();
		product obj3=new product(g,h,i);
		
		obj1.display();
		obj2.display();
		obj3.display();
		
		if(obj1.price > obj2.price && obj1.price > obj3.price )
		{
			System.out.println("the first product is costlier");
		}
		if(obj2.price > obj3.price && obj2.price > obj1.price)
		{
			System.out.println("the second product is costlier");
		}
		if(obj3.price > obj1.price && obj3.price > obj2.price )
		{
			System.out.println("the third product is costlier");
		}
		}
	
	
	public void display()
	{
		System.out.println("name:" +pname);
		System.out.println("code:" +pcode);
		System.out.println("price:" +price);
	}
}
