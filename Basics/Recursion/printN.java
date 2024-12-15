import java.util.Scanner;

public class printN {
    public static void printNos(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        printNos(n-1);
        System.out.print(n+" ");
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        printNos(n);
    }
}
