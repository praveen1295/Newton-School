import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
	public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int t = sc.nextInt();

                      for(int T=1; T<=t; T++){
                          int n = sc.nextInt();
                          int arr[] = new int[n];

                          for(int i=0; i<n; i++)
                          arr[i] = sc.nextInt();

                          for(int i=0; i<n; i++){
                              int current = arr[i];
                              int j = i-1;

                              while(j>=0 && current<arr[j]){
                                  arr[j+1] = arr[j];
                                  j--;
                              }
                              arr[j+1] = current;
                          }
                      printArray(arr);
                      }
                      
	}
}
