import java.util.Scanner;

public class Pelindrome {
    static boolean check_Pelindrome(String str, int start, int end){
        if(start==end){
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        if(start<end){
            return check_Pelindrome(str, start+1, end-1);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int m = 0;
        int n = str.length()-1;
        System.out.println(check_Pelindrome(str, m, n));
    }
}
