import java.util.Scanner;
 public class tempp
  {
 public static void main(String[] args) {
    System.out.println("enter the temp");
    Scanner sc=new Scanner(System.in);
    float cel=sc.nextFloat();
    float fer =(cel*9/5)+32;
    System.out.println("temperature in ferhneit"+fer);
 }   
}
