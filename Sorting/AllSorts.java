import java.util.Scanner;

public class AllSorts {

    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length-1; j++){
                minIndex = (arr[j]<arr[minIndex]) ? j : minIndex;
            }
            int t = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = t;
        }
    }

    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
    }

    public static void insertionSort(int[] arr){
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++) arr[i] = sc.nextInt();
        sc.close();

        //selectionSort(arr);
        bubbleSort(arr);

        for(int i: arr) System.out.print(i+", ");
    }
}
