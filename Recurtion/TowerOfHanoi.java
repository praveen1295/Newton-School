import java.util.Scanner;

class TowerOfHanoi {
    static void towerOfHanoi(int n, char Source, char Hepler, char Destination) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, Source, Destination, Hepler);
        System.out.println(n + ":" + Source + "->" + Destination);
        towerOfHanoi(n - 1, Hepler, Source, Destination);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of discs:");
        int n = sc.nextInt();
        System.out.println("Movement of discs:");
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}