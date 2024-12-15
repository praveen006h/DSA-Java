import java.util.Scanner;

public class SumOfAllDivisors {

    public static int sumofDiv(int n){
        if (n==1) return 1;
        int sum = 1+n;
        for(int i = 2; i*i<=n; i++){
            if(n%i == 0){
                sum += i;
                sum += (n/i != i)? n/i : 0;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        for(int i=1; i<=n; i++)
            sum+=sumofDiv(i);
        
        System.out.println(sum);
    }
}
