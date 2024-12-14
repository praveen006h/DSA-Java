import java.util.Scanner;

public class P19VoidStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i=n; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }

            for(int j=0; j<((n-i)*2); j++){
                System.out.print(" ");
            }

            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++){
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }

            for(int j=0; j<((n-i)*2); j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
