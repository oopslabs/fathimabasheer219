package fathima;
import java.util.*;
import java.io.*;
public class sort {
      public static void main(String[]args)
      {
    	  String s[]=new String[10];
    	  String temp;
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("enter the Strings");
    	  for(int i=0;i<4;i++)
    	  {
    		  s[i]=sc.nextLine();
    	  }
    	  for(int i=0;i<4;i++)
    	  {
    		  for(int j=i+1;j<4;j++){
    			  if(s[i].compareTo(s[j])>0)
    			  {
    				  temp=s[i];
    				  s[i]=s[j];
    				  s[j]=temp;
    			  }
    		  }
    	  }
    	  System.out.println("the sorted string is:");
    	  for(int i=0;i<4;i++)
    	  {
    		  System.out.println(s[i]);
    	  }
      }
}