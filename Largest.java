import java.util.Scanner;
class Largest{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter three number");
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     if (a>b && a>c){
        System.out.print(" largest number is " + a);
     }
     else if (b > c && b>a){
        System.out.print(" largest number is " + b);
     }
     else {
        System.out.print("largest number is " + c);
     }
    }
}