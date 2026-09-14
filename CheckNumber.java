import java.util.Scanner;
class CheckNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = sc.nextInt();
        if(num>0){
            System.out.print("Positive number");
        }
        else if(num<0){
            System.out.print("Negative nuumber");
        }
else{
    System.out.print("Zero");
}
    }
}