public class First{
    public static void main(String[] args){
        String str = "Programming";
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)){
        System.out.println("First non-repating character  = " + ch);
        break;
            }
        }

    }
}