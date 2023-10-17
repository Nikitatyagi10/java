import java.util.Scanner;
public class salary {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    
        System.out.println("enter the bsic salary");
        float salary=sc.nextFloat();

        float hra=salary*(30/100);
        float ta=salary*(20/100);
        float da=salary*(10/100);
        int pf=1500;

        float net_salary=salary+hra+ta+da-pf;

        System.out.println("basic salary"+ salary);
        System.out.println("hra"+ hra);
        System.out.println("ta"+ta);
        System.out.println("net salary"+net_salary);

    }
}
