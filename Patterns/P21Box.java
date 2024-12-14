import java.util.Scanner;

public class P21Box {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++)
            System.out.print((i==1 || i==n || j==1 || j==n)?"*":" ");
            System.out.println();
        }
    }
}
