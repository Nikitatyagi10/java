import java.util.Scanner;
 public class subject
  {
    public static void main(String[] args) {
        System.out.println("enter the subject");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter math no");
        int math=sc.nextInt();
        System.out.println("enter phy no");
        int phy=sc.nextInt();
        System.out.println("enter bio no");
        int bio=sc.nextInt();
        System.out.println("enter chem no");
        int chem=sc.nextInt();

        float avg=(math+phy+bio+chem)/4;
        System.out.println("average"+avg);

    }
    
}
