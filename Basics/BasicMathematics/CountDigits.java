import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count =0;
        while (n>1){
            n=n/10;
            count++;
        }
        System.out.println("Number of Digits: "+count);
    }
}
