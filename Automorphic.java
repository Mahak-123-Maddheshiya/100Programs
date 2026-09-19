import java.util.Scanner;
class Automorphic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        int square = n * n;
        int temp = n;
        int divisor =1;
        while(temp>0){
            divisor = divisor * 10;
            temp = temp/10;
        }
        if(square % divisor == n){
            System.out.print("Automorphic number");
        }
        else{
            System.out.print("Not Automorphic number");
        }
    }
}