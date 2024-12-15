import java.util.Scanner;

public class GcdOf2Nums{

    public static int GCD(int a, int b){
        if(b == 0) return a;
        return(GCD(b, a%b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if(b>a){
            int t = b;
            b = a;  
            a = t;
        }
        System.out.println(GCD(a,b));
    }
}
