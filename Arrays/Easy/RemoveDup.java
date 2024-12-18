import java.util.Scanner;

public class RemoveDup {

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n<2) return n;
        int pos = 1;
        int ptr = 0;
        for(int i=1; i<n; i++){
            if(nums[ptr] == nums[i]) continue;
            nums[pos] = nums[i];
            pos++;
            ptr = i;
        }
        return pos;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        sc.close();

        System.out.println(removeDuplicates(arr));
    }
}
