import java.util.Scanner;
class LargestElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        int largest = 0;
        while(n!=0){
            int digit = n%10;
         if(digit > largest){
            largest = digit;
         }
         n = n/10;




        }      
    System.out.print("Largest digit  = " + largest);
    
    
    
    }
}