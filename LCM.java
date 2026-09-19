import java.util.Scanner;
class LCM{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.print("Enter the second number");
        int b = sc.nextInt();
        int lcm;
        if(a>b){
            lcm = a;
        }
        else{
            lcm = b;
        }
        while(true){
            
            if(lcm % a ==0 && lcm % b==0){
                break;
            }
            lcm++;
        }
        System.out.print("LCM = "+ lcm);
    }
}