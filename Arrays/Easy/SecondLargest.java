import java.util.Scanner;

public class SecondLargest {
    public static int largest2nd(int[] arr){
        int max = -1, max2nd = -1;
        for(int i: arr){
            if (i>max2nd && i<max) max2nd = i;
            if(max<i){
                if(max>max2nd) max2nd = max;
                max = i;
            }
        }
        return max2nd;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        sc.close();

        System.out.println(largest2nd(arr));
    }
}
