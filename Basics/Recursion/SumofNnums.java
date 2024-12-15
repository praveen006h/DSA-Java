import java.util.Scanner;

public class SumofNnums {
    static public int sumof(int n){
        if(n == 0) return 0;
        return (sumof(n-1) + n);
    }

    static public int sumOfPara(int n, int sum){
        if(n==0) return (sum);
        return sumOfPara(n-1, n+sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(sumof(n));
        System.out.println(sumOfPara(n, 0));
    }
}
