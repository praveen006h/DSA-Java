import java.util.ArrayList;
import java.util.Collections;

public class sample {
    public static int minJumps(int arr[], int steps, int start){
        if (arr[start] == 0) return -1;

        ArrayList<Integer> StepArr = new ArrayList<Integer>();
        for(int i=start; i<arr[i]; i++){
            if(i>arr.length-1) return -1;
            StepArr.add(arr[i]);
        }
        Collections.sort(StepArr);

        for(int i: StepArr){
            if(start+i>arr.length-1) return 2;
            minJumps(arr, ++steps, i);
        }
        return steps;
        
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int[] arr = {1, 4, 3, 2, 6, 7};

        System.out.println(minJumps(arr,0, 0));
    }
}