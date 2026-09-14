import java.util.Scanner;
class Marks{
public  static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter marks of subject 1 :");
    int m1 = sc.nextInt();
    System.out.print("Enter marks of subject 2");
    int m2 = sc.nextInt();
    System.out.print("Enter marks of subject 3");
    int m3 = sc.nextInt();
    System.out.print("Enter marks of subject 4");
    int m4 = sc.nextInt();
    System.out.print("Enter marks of subject 5");
    int m5 = sc.nextInt();
    int total = m1 + m2 + m3 +  m4;
    double average = total / 5.0;
System.out.println("Total = " + total);
System.out.println("average" + average);
}




}