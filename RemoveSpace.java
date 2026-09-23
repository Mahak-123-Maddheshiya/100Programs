import java.util.Scanner;
class RemoveSpace{
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the string");
   String str = sc.nextLine();
   String result = " ";
for(int i =0;i<str.length();i++){
    if(str.charAt(i) != ' '){
        result += str.charAt(i);
    }
}
System.out.println("After removing space");
System.out.println(result);
}
}