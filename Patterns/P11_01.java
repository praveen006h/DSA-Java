import java.util.Scanner;

public class P11_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int count;
        for(int i=1; i<=n; i++){
            count = i%2;
            for(int j=1; j<=i; j++){
                System.out.print(count%2+" ");
                count++;
            }
            System.out.println();
        }

    }
}
