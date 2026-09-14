import java.util.Scanner;
class Swap{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number");
    int a =sc. nextInt();
    System.out.print("Enter the second number");
    int b = sc.nextInt();
    int temp = a;
    a = b;
    b = temp;
    System.out.print("After the swapping");
    System.out.print("\na = " + a);
    System.out.print("\nb = " + b);




}
}