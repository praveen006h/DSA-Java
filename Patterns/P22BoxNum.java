import java.util.Scanner;
public class P22BoxNum {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=n; i>=1; i--){
            for(int j=n; j>=1; j--)
            System.out.print(((j>i)?j:i));
            for(int j=2; j<=n; j++)
            System.out.print(((j>i)?j:i));
            System.out.println();
        }
        for(int i=2; i<=n; i++){
            for(int j=n; j>=1; j--)
            System.out.print(((j>i)?j:i));
            for(int j=2; j<=n; j++)
            System.out.print(((j>i)?j:i));
            System.out.println();
        }
    }
}
