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
        int n = arr.length;
        for(int i=1; i<n; i++){
            int p = i;
            while(p>=1 && arr[p-1]>arr[p] ){
                int t = arr[p-1];
                arr[p-1] = arr[p];
                arr[p] = t;
                p--;
            }
        }
    }


    public static void merge(int[] arr, int st, int mid, int end){
        int p1 = st, p2=mid+1;
        int[] temp = new int[end-st+1];
        int ind = 0;
        while(p1<=mid && p2<=end){
            if(arr[p1]<=arr [p2]){
                temp[ind] = arr[p1];
                p1++;
            }
            else {temp[ind] = arr[p2]; p2++;}
            ind++;
        }
        while(p1<=mid){
            temp[ind] = arr[p1];
            p1++; ind++;
        }
        while(p2<=end){
            temp[ind] = arr[p2];
            p2++; ind++;
        }

        for(int i = st; i<=end; i++){
            arr[i] = temp[i-st];
        }
    }

    public static void mergeSort(int[] arr, int st, int end){
        if(st == end) return;
        int mid = (st+end)/2;
        mergeSort(arr,st,mid);
        mergeSort(arr, mid +1, end);
        merge(arr, st, mid, end);
        return;
    }

    public static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int zp = 0; // Pointer to the position where the next non-zero should go
    
        for (int np = 0; np < n; np++) {
            if (arr[np] != 0) {
                // Swap non-zero element at np with zero at zp
                int temp = arr[zp];
                arr[zp] = arr[np];
                arr[np] = temp;
    
                zp++; // Move the zero pointer ahead
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++) arr[i] = sc.nextInt();
        sc.close();

        //selectionSort(arr);
        //bubbleSort(arr);
        //insertionSort(arr);
        mergeSort(arr, 0, n-1);
        //pushZerosToEnd(arr);

        for(int i: arr) System.out.print(i+", ");
    }
}


