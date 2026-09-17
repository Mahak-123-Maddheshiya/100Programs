import java.util.Scanner;
class ArmstrongNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        for(int num =1;num<=n;num++){
            int temp = num;
            int digits =0;
            int sum =0;
            while(temp!=0){
                digits++;
                temp = temp /10;
            }
            temp = num;
            while(temp!=0){
                int digit = temp % 10;
                int power =1;
                for(int i =1;i<=digits;i++){
                    power  = power * digit;
                                 
                }
                sum = sum +power;
                temp = temp /10;
            }
            if(sum == num){
                System.out.print(num + " ");
            }
        }
    }
}