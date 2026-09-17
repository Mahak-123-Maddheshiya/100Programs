import java.util.Scanner;
class Armstrongcvheck {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number");
    int n = sc.nextInt();
    int original =n;
    int digit =0;
    int sum = 0;
    int temp = n;
    while(temp !=0){
        digit++;
        temp = temp/10;
    }
    temp = n;
    while(temp!=0){ 
    int digits = temp %10;
    int power = 1;
    for(int i =1;i<=digit;i++){
        power = power * digit;
    }
    sum = sum + power;
    temp = temp / 10;


    }
    if(sum == original){
        System.out.print("Armstrong number");
    } else {
        System.out.print("Not Armstrong number");
    }
}
}