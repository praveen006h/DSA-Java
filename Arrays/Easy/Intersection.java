import java.util.ArrayList;

public class Intersection {

    public static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2, int m,int n){
        ArrayList<Integer> Intersection = new ArrayList<Integer>();
        int i=0; int j=0;
        while(i<m && j<n){
            if(arr1[i]>arr2[j]) j++;
            else if(arr1[i]<arr2[j]) i++;
            else if(arr1[i] == arr2[j]){
                if(Intersection.size()==0 || Intersection.get(Intersection.size()-1)!=arr1[i]){
                    Intersection.add(arr1[i]);
                }
                i++; j++;
            }
        }
        return Intersection;
    }

    public static void main(String args[]) {
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {2, 4, 6, 7, 8};
        int m = arr1.length, n = arr2.length;
        ArrayList<Integer> Union = findIntersection(arr1, arr2, m, n);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union)
        System.out.print(val+" ");
    }
}
