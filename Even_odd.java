import java.util.Scanner;
class Even_odd{
public static void main (String args[]){
int r,i;
Scanner scan=new Scanner(System.in);


System.out.print("Enter the first number for the range: ");
int num1=scan.nextInt();
System.out.print("Enter the second number for the range: ");
int num2=scan.nextInt();

System.out.print("\nDisplay the even numbers between "+num1+" and "+num2+" are :");

for(i=num1; i<=num2; i++){ 
r=i%2; 
if(r==0) 
System.out.println(i);
}

System.out.print("\nDisplay the odd numbers between "+num1+" and "+num2+" are :");

for(i=num1; i<=num2; i++){ 
r=i%2; 
if(r==1) 
System.out.println(i);
}
}
}
