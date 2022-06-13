
import java.io.*;
import java.util.*;

public class genimp{
	public static void main(String[] args){
		
		
		
		
		System.out.println("A String type stack");
		Stack<String> obj2=new Stack<>(3);
		obj2.push("Java");
		obj2.push("Programming");
		obj2.push("Tutorial");
		obj2.display();
		System.out.println("Top= "+obj2.topp());
		
	}
}
class Stack<T>{
	ArrayList<T> stack;
	int n,top=-1;
	
	
	Stack(int i){
		this.n=i;
		this.stack=new ArrayList<T>(i);
	}
	
	void push(T data){
		if((top+1)==n){
			System.out.println("Stack overflow");
		}
		else{
			top++;
			if(stack.size()>top){
				stack.set(top,data);
			}
			else{
				stack.add(data);
			}
		}
	}
	
	void display(){
		for(int i=top;i>-1;i--){
			System.out.println(stack.get(i));
		}
	}
	
		
	
	void pop(){
		if(top==-1){
			System.out.println("Stack Underflow");
		}
		else{
			top--;
		}
	}
	T topp(){
		return(stack.get(top));
	}
	
}

	

