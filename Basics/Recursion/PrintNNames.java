import java.util.Scanner;

public class PrintNNames {
    public static void printName(String Str, int n){
        if(n==0) return;
        printName(Str, n-1);
        System.out.print(Str+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.next();
        int n = sc.nextInt();
        sc.close();
        
        printName(Str, n);
    }
}
