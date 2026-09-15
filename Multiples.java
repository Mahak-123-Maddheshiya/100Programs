import java.util.Scanner;
class Multiples{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter m");
       int m= sc.nextInt();
System.out.println("Enter  n");
int n= sc.nextInt();
for(int i =1;i<=n;i++){
    System.out.println(m * i);
}

    }
}