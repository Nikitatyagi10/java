import java.util.*;

// To print sum of 12+22+32+..........................n

public class sumSeries_func2{

    static void sum(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            int s = 2*(5*i + 1);
            sum=sum + s;
            System.out.print(s+",");
        }
        System.out.println("\nThe sum OF The Given Series is : "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Limit Number  to get the sum : ");
        int n = sc.nextInt();
        sum(n);
        sc.close();
    }
} 
    
