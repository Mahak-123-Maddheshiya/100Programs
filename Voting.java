import java.util.Scanner;
class Voting{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the age");
    int age = sc.nextInt();
    if(age>18){
        System.out.print("eligible for voting");
    }
    else{
        System.out.print("Not eligible for voting");
    }

    }
}