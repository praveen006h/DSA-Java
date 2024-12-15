import java.util.Scanner;

public class CheckPalindrome {
    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        int rev = 0, x1=x;
        while(x>0){
            rev = rev*10+(x%10);
            x /= 10;
        }
        return (rev==x1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(isPalindrome(n));
    }
}
