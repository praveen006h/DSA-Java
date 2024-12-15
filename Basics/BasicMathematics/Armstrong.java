import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int origN = n;
        int arm=0;
        while(n>0){
            arm += Math.pow(n%10, 3);
            n /= 10;
        }

        System.out.println(arm==origN);
    }
}
