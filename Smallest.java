import java.util.Scanner;
public  class Smallest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter three number");
    int  a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a<b && a<c){
        System.out.print("Smallest number is" + a);

    }
    else if (b<a && b<c){
        System.out.print("Smallest number is "+ b);

    }
    else {
        System.out.print("Smallest number is" + c);
    }
    
    }
}