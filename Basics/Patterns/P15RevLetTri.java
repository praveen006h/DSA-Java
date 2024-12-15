import java.util.Scanner;

public class P15RevLetTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int valA = (int) 'A'-1;

        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print((char)(valA+j)+" ");
            }
            System.out.println();
        }
    }
}
