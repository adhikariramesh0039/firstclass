package week1;

public class Palidromenumber2ndcode {

	public static void main(String[] args) {
		 int r,sum=0,template;
		
		  int n=45654;//It is the number variable to be checked for palindrome  
		  
		  template=n;
		  
		  while(n>0) { 
			  r=n%10; 
			  sum=(sum*10)+r;  
			  n=n/10;}
		  
		  if(template==sum)   
			  
		   System.out.println(template+" "+"is a palindrome number ");    
		  else    
		   System.out.println(template+"is not a palindrome");    
		}  

	}


