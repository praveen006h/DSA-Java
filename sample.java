 

public class sample {
    public static int missingNumber(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]<0) arr[i] = 0;
        }
        for(int i=0; i<n; i++){
            int val = (arr[i]<0)? arr[i]*-1 : arr[i];
            if(val>=1 && val<=n){
                if(arr[val-1] > 0)
                    arr[val-1] *= -1;
                else if(arr[val-1] ==0)
                    arr[val-1] = -1*(n+1);
            }
        }
        for(int i=1; i<n+1; i++){
            if(arr[i-1]>=0)
                return i;
        }
        return n+1;     
    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int[] arr = {0, -10, 1, 3, -20};

        System.out.println(missingNumber(arr));
    }
}