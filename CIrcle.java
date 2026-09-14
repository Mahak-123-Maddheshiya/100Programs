import java.util.Scanner;
class Circle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius");
        double r = sc.nextDouble();
        double area = 3.14* r*r;
        double circumference = 2 * 3.14 *r;
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    }
}