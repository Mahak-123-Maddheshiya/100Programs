import java.util.Scanner;
class CountDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thr number");
        int num = sc.nextInt();
         int count = 0;
         while(num != 0){
         num = num/10;
         count++;
        
        }
        System.out.print("NUmber of digits =" + count);
    }
}