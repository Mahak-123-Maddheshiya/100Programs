import java.util.Scanner;
class PrimeNumbers{
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the number");
 int n = sc.nextInt();
 for(int num = 2;num<=n;num++){
    int count = 0;
    for(int i =2;i<=num;i++){
        if(num % i == 0){
            count++;

            
                }
            }
            if(count == 2){
                System.out.print(num + " ");
            }
        }
    }
 }
    