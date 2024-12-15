import java.util.Scanner;

public class P18Another {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int valA = (int) 'A'-1;

        for(int i=n;i>=1; i--){
            for(int j=i; j<=n; j++){
                System.out.print((char)(valA+(j))+" ");
            }
            System.out.println();
        }
    }
}
