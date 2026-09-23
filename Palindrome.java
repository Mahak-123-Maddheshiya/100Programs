import java.util.Scanner;
class Palindrome{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string");
    String str = sc.nextLine();
    String reverse = "";
    for(int i = str.length()-1; i>=0;i--){
        reverse += str.charAt(i);
    }
    if(str.equals(reverse)){
        System.out.println("Palindrome");
    }
    else{
        System.out.print("Not Pailndrome");
    }

}


    }

