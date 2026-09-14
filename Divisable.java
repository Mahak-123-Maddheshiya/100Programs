import java.util.Scanner;
class Divisable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int a = sc.nextInt();
        if(a%3==0  && a%5==0){
            System.out.print("Divisable is 3 and 5");

        }
        else {
            System.out.print(" not Divisable 3 and 5");
        }

    }
}