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

    public static void recurBubSort(int[] arr, int n){
        if(n==1) return;
        boolean didSwap = false; 
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                didSwap = true;
                int t = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = t;
            }
        }
        if(!didSwap) return;
        recurBubSort(arr, n-1);
    }

    public static void recurInsSort(int[] arr, int st){
        if(st==arr.length) return;
        int p = st;
        while(p>0 && arr[p-1]>arr[p]){
            int t = arr[p];
            arr[p] = arr[p-1];
            arr[p-1] = t;
            p--;
        }
        recurInsSort(arr, st+1);
    }

    public static int quick(int[] arr, int low, int high){
        int pivot = arr[low];
        int i=low, j=high;
        
        while (i<j) {
            while (arr[i]<=pivot && i<=high-1) {
                i++;
            }
            while (arr[j]>pivot && j>=low+1) {
                j--;
            }
            if(i<j){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }

        int t = arr[low];
        arr[low] = arr[j];
        arr[j] = t;

        return j;
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low >= high) return;
        int partInd = quick(arr, low, high);
        quickSort(arr, low, partInd-1);
        quickSort(arr, partInd+1, high);
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
        //mergeSort(arr, 0, n-1);
        //recurBubSort(arr, n);
        //recurInsSort(arr, 0);
        quickSort(arr, 0, n-1);

        //pushZerosToEnd(arr);

        for(int i: arr) System.out.print(i+", ");
    }
}


