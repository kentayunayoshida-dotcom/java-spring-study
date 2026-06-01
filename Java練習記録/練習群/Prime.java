import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        boolean[] isPrime=new boolean[n];
        for(int i=2 ;i <= n; i++) {
            isPrime[i]=true;
        }

        // エラトステネスの篩
        for(int i=2; i <= n; i++) {
            // iが素数なら
            if(isPrime[i]) {
                // iの倍数をfalseにする
                for(int j=i*2; j <= n; j+=i) {
                    isPrime[j]=false;
                }
            }
        }

        // Nが素数か判定
        if(n >= 2 && isPrime[n]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}