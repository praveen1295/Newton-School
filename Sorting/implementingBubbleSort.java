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
                      int T = sc.nextInt();
                      for(int t=1; t<=T; t++){
                      int n = sc.nextInt();
                      int arr[] = new int[n];
                      for(int i=0; i<n; i++)
                      arr[i] = sc.nextInt();

                      for(int i=0; i<n-1; i++){
                          for(int j=0; j<n-i-1; j++){
                              if(arr[j]>arr[j+1]){

                                  int temp = arr[j];
                                  arr[j] = arr[j+1];
                                  arr[j+1] = temp;
                              }
                          }
                      }
                      printArray(arr);
                      }
	}
}
