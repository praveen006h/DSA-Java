import java.util.Scanner;

public class printNto1 {
    public static void printnto1(int n){
        if(n==0) return;
        System.out.print(n+" ");
        printnto1(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        printnto1(n);
    }
}
