import java.util.Scanner;
class CountWord{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the sentences ");
    String str = sc.nextLine();
    int words = 1;
    for(int i =0;i<str.length();i++){
        if(str.charAt(i) == ' '){
            words++;
        }
    }
    System.out.println("Total words = " + words);

}
}