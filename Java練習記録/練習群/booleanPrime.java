import java.util.*;

pblic class booleanPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] Array=new int[n];
        int max=0;

        // 入力＋最大値取得
        for(int i=0; i < n; i++) {
            Array[i]=sc.nextInt();
            if(Array[i] > max) {
                max=Array[i];
            }
        }

        // 素数表
        boolean[] isPrime=new boolean[max+1];
        Arrays.fill(isPrime, true);

        if(max >= 0) isPrime[0]=false;
        if(max >= 1) isPrime[1]=false;

        // エラトステネスの篩
        for(int i=2; i*i <= max; i++) {
            if(isPrime[i]) {
                for(int j=i*i; j <= max; j+=i) {
                    isPrime[j]=false;
                }
            }
        }

        // 出力
        for(int x : Array) {
            if(isPrime[x]) {
                System.out.println("pass");      //素数なら"pass"
            } else {
                System.out.println("failure");   //素数でなければ"failure"
            }
        }
    }
}