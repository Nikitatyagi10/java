 import java.util.*;  

public class p4{ 

  public static void main(String[] args) {
    
  }



    

{ 

        int i, j; 

        int num = 1; 

  

         

        for (i = 1; i <= 5; i++) { 

            

            for (j = 1; j <= i; j++) { 

                System.out.print("*"); 

            } 

  

            

            int spaces = 2 * (5 - i); 

            for (j = 1; j <= spaces; j++) { 

                System.out.print(" "); 

            } 

  

            

            for (j = 1; j <= i; j++) { 

                System.out.print("*"); 

            } 

  

            System.out.println(); 

        } 

  

    

        for (i = 5; i >= 1; i--) { 



            for (j = 1; j <= i; j++) { 

                System.out.print("*"); 

            } 

  

            

            int spaces = 2 * (5 - i); 

            for (j = 1; j <= spaces; j++) { 

                System.out.print(" "); 

            } 

  

            

            for (j = 1; j <= i; j++) { 

                System.out.print("*"); 

            } 

  

            System.out.println(); 

 }
}
  
    
}
