import java.util.*;

class Accio{
    static String ReverseStrings(String s){
        // write code here
		StringBuilder reversed = new StringBuilder(s);
        reversed.reverse();
        return reversed.toString();
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Accio obj = new Accio();
        String ans=obj.ReverseStrings(s);
        System.out.println(ans);
    }
}