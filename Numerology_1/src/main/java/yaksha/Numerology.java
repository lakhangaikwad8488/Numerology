package main.java.yaksha;

import java.util.Scanner;

public class Numerology
{
	static String[][] arr = { { "A", "B" ,"C", "D" ,"E", "F" ,"G", "H" ,"I", "J" ,"K", "L" ,"M", "N" ,"O", "P" ,"Q", "R" ,"S", "T" ,"U", "V" ,"W", "X" ,"Y", "Z" },  
			   { "1", "2" ,"3", "4" ,"5", "8" ,"3", "5" ,"1", "1" ,"2", "3" ,"4", "5" ,"7", "8" ,"1", "2" ,"3", "4" ,"6", "6" ,"6", "5" ,"1", "7" } };

	  public static int findValue(String n) {
		  int sum=0;
		  for(int i=0;i<n.length();i++)
	        {
	        	char c=n.charAt(i);
	        	if(!(c>='A' &&  c<='Z'))
	        	{
	        		
	        		return -1;
	        	}
	        }
		for(int i=0;i<n.length();i++)
        {
        	
        	String s=Character.toString(n.charAt(i));
        	for(int j=0;j<26;j++)
        	{
            	if(s.equals(arr[0][j]))
            	{
            		int m=Integer.parseInt(arr[1][j]);
            		sum=sum+m;
            	}
        	}
        }
		   
		return sum;
	}
    public static void main (String[] args)  
    {	
    	 
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String n=sc.next();
        int t=findValue(n);        
       if(t==-1) {
    	   System.out.println("Invalid name");
    	   }
       else {
    	   System.out.println("Your numerology no is:"+t);
       }
    
    }
}