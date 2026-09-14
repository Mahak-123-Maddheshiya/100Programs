import java.util.Scanner;
class Grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = sc.nextInt();
        if(num >= 90){
            System.out.print("Grade A");
        }
        else if (num >= 75){
            System.out.print("Grade B");

        }
        else if (num>= 60){
            System.out.print("Grade C");

        }
        else if(num>=40){
            System.out.print("Grade D");

        }
        else {
            System .out.print("Fail");
        }
    }
}