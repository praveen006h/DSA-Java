import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int sign = (n<0)? -1: 1;
        n = n * sign;
        int revN = 0, prevRev=0;
        while(n>0){
            prevRev = revN;
            revN *=10;
            if(revN/10!=prevRev) break; //return 0;
            revN += n%10;
            n /= 10;
        }

        System.out.println(revN*sign);
    }
}
