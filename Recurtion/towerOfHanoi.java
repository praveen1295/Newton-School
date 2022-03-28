import java.io.*; // for handling input/output
import java.lang.reflect.Array;
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static void isPrime(int arr[] , int a, int b, int n) {
        boolean prime[] = new boolean[n + 1];
        int sum = 0;
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true)
                ;
            {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true) {
                System.out.print(arr[i] + " ");
            }
            for (int j = a; j <= b; j++) {
                arr.push(i);
                sum += arr[i];
                System.out.print(sum+" ");
            }
        }
    }

    public static void main(String[] args) {
        // Your code here
        // HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i, j, sum = 0;

        while (t-- > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int arr[] = new int[50000];
            isPrime(arr, a, b, 50000);
        }
    }
}