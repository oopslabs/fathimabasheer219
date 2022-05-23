package fathima;

import java.util.Scanner;

public class result implements Student,Sports{
	
	void display(){	
		System.out.println("Name: "+name+"\nMark for Java: "+java+"\nMark for Sports: "+sm);
	}
	
	public static void main(String[] args){
		result obj=new result();
		obj.display();
			
	}
}

interface Student{	
	String name="Fathima Basheer";
	int java=90;
	
}


interface Sports{
	int sm=80;
	

}
