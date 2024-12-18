import java.util.Scanner;

public class checkRotatedSorted {

    public static boolean check(int[] nums) {
        byte count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i%nums.length] > nums[(i+1)%nums.length])  count++;
            if(count>1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        sc.close();

        System.out.println(check(arr));
    }
}
