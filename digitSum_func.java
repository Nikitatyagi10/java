import java.util.*;

public class digitSum_func {

    static int sum(int num){
        int sum=0;
        int r=0;
        while(num > 0){
            r = num % 10;
            sum = sum + r;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Digit Number: ");
        int n = sc.nextInt();
        System.out.println("The Sum is: "+sum(n));
        sc.close();
    }
}
