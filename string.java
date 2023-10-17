
import java.util.*;
public class string
{
  public static void main(String[] args) 
  {    
        
        Scanner sc=new Scanner(System.in);    
        int count = 0,i=0;    
        System.out.print("Please Enter a String to Count Characters =  ");
		String str = sc.nextLine();
		
		while(i < str.length())
		{
			if(str.charAt(i) != ' ') 
			{
				count++;
			}
			i++;
		}		
		System.out.println("\nThe Total Number of Characters  =  " + count);     
  }
}