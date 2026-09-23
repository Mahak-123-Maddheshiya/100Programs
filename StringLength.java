import java.util.Scanner;
class StringLength{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String");
        String str = sc.nextLine();
        int count =0;
        char[] arr = str.toCharArray();
        for(char ch : arr){
            count++;

        }
        System.out.println("Length = " + count);
    }
}