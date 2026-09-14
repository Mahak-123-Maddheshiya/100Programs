import java.util.Scanner;
 class Operation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number");
        int  a = sc.nextInt();
System.out.println("Enter the second number");
int b = sc.nextInt();
System.out.println("Sum =" + (a+b));
System.out.println("Difference = "+ (a-b));
System.out.println("Product = " + (a* b));
System.out.println("Quotient = "+(a / b));



    }
 }