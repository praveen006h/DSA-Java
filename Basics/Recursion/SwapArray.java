public class SwapArray {
    public static void swapArr(int[] arr, int start, int end){
        if(start>=end) return;
        int t = arr[start];
        arr[start] = arr[end];
        arr[end] = t;

        swapArr(arr, ++start, --end);
        return;
    } 

    public static void main(String[] args) {
        int[] arr = {2,4,3,9,2,1};
        swapArr(arr, 0, arr.length-1);
        for(int i:arr) System.out.print(i+", ");
    }
}
