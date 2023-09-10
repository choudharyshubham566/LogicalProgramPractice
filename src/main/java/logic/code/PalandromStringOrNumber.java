package logic.code;
public class PalandromStringOrNumber {

	public static void main(String[] args) {
		  int r,sum=0,temp;    
		  int n=14323;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("This is palindrome number ");    
		  else    
		   System.out.println("This is not palindrome");    
		
	}

}
