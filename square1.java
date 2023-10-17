import java.util.Scanner;

public class square1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input ");
        int n = sc.nextInt();
        for (int i=0;i<n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=2*i+1;k++)
            {
              System.out.print("*");
              System.out.println();
            }
        }
    }    
}