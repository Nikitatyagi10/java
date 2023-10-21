import java.util.*;

// To print sum of  1+2+3+.............................n

public class sumSeries_func1{

    static void sum(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            System.out.print(i+",");
            sum=sum+i;
        }
        System.out.println("\nThe Sum OF The Given Series Is: "+sum);
    }
    public static void main(String args[]){
        System.out.println("Enter the Limit Number  to get the sum : ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sum(n);
        sc.close();
    }
}
