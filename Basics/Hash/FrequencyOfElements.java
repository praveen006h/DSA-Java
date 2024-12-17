import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrequencyOfElements {

    public static List<Integer> frequencyCount(int arr[]){
        List<Integer> count = new ArrayList<Integer>();
        for(int i=0; i<=arr.length; i++) count.add(0);
        for(int i: arr)
            count.set(i, (count.get(i))+1);

        count.remove(0);
        return count;
    }

    public static HashMap<Integer, Integer> freqHM(int arr[]){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i: arr)
            hm.put(i, hm.getOrDefault(i, 0)+1);
        return hm;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};

        System.out.println(frequencyCount(arr));
        System.out.println(freqHM(arr));
    
    }
}
