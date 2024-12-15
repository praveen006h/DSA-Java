import java.util.Scanner;

public class Palindrome {
    public static boolean checkPalin(String s, int lp, int rp){
        if (lp==0) return true;
        if(s.charAt(lp) != s.charAt(rp)) return false;
        return checkPalin(s, --lp, ++rp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int lp = s.length()/2-1;
        int rp = (s.length()%2==0)?s.length()/2:s.length()/2+1;
        System.out.println(checkPalin(s,lp,rp));
    }
}
