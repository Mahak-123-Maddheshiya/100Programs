import java.util.Scanner;
class EvenOddDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        int even = 0;
        int odd =0;
        while( n != 0){
            int digit = n %10;
            if(digit %2==0){
                even++;
            }
            else{
                odd++;
            }
            n = n/10;
        }
        System.out.print("Even digit = " + even);
        System.out.print("Odd digit = " + odd);
    }

}