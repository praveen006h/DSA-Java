import java.util.Scanner;

public class RotateArray {
    public static void reverse(int[] arr, int st, int end){
        if(st==end) return;
        while(st<end){
            int t = arr[st];
            arr[st] = arr[end];
            arr[end] = t;
            st++; end--;
        }
    }

    public static void rotate(int[] nums, int k) {
        if (k==0) return;
        int n = nums.length;
        if(n<2) return;
        int r = k% n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, r-1);
        reverse(nums, r, n-1);
    }

    public static void rotate2(int[] arr, int k){
        int n = arr.length;
        k=k%n;
        int arr2[] = new int[k];

        for(int i=0; i<k; i++) arr2[i] = arr[i];

        for(int i=0; i<n-k; i++) arr[i] = arr[k+i];

        for(int i=n-k; i<n; i++){
            arr[i] = arr2[i-(n-k)];
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        int rot = sc.nextInt();
        sc.close();

        //rotate(arr, rot);
        rotate2(arr, rot);
        for(int i: arr) System.out.print(i+", ");

    }
}
