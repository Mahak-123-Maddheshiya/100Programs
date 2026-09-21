import java.util.Scanner;
public class Po{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base(x)");
        int x = sc.nextInt();
        System.out.print("Enter power(y)");
        int y = sc.nextInt();
        int result = 1;
        for(int i =1;i<=y;i++){
            result = result *  x;

        }
        System.out.print("Answer  = "+ result );
    }
}