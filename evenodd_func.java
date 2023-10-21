import java.util.*;

public class evenodd_func {

    static void Even(int num){
        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.println("Even Number: "+i);
            }
        }
    }

    static void Odd(int num){
        for(int i=1;i<=num;i++){
            if(i%2!=0){
                System.out.println("Odd Number: "+i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit to print Even Odd numbers");
        int n=sc.nextInt();
        Even(n);
        Odd(n);
        sc.close();

    }
}
