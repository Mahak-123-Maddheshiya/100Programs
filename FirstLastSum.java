import java.util.Scanner;
class FirstLastSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the number");
        int n = sc.nextInt();
        int last = n%10;
        int first = n;
        while(first>=10){
            first = first /10;
            
        }
        int sum = first + last;
        System.out.print("First digit = "  + first);
        System.out.print("last digit = " + last);
        System.out.print("Sum = " + sum);

    }

}