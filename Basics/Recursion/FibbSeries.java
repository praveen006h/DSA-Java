import java.util.HashMap;
import java.util.Scanner;

public class FibbSeries {
    public static int fib(int n){
        if (n<=0) return 0;
        if (n==1) return 1;
        
        //System.out.println(n);
        return (fib(n-1) + fib(n-2));
    }
    public static int fibMemo(int n, HashMap<Integer, Integer> fibs){
        if (n<=0) return 0;
        if (n==1) return 1;
        if(fibs.containsKey(n)) return fibs.get(n);
        int val = fibMemo((n-1),fibs) + fibMemo(n-2, fibs);
        fibs.putIfAbsent(n, val);
        //System.out.println(fibs+" "+ n);
        return (val);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        HashMap<Integer, Integer> fibs = new HashMap<Integer, Integer>();
        System.out.println(fibMemo(n, fibs));
        System.out.println(fib(n));

    }
}
