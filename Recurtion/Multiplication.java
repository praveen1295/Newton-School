import java.util.Scanner;

public class Multiplication {
    static int multiplication(int a, int b){
        if(a==0){
            return 0;
        }
        if(a==1){
            return b;
        }
       return b + multiplication(a-1, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multiply = multiplication(a, b);
        System.out.println(multiply);
    }
}
