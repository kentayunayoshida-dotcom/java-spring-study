import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //入力要素数
        int size = sc.nextInt();

        //ソートする配列を入力
        int[] Array = new int[size];
        for(int i=0; i < size; i++) {
            Array[i] = sc.nextInt();
        }
        
        //挿入ソート
        for(int i=1; i < size; i++) {
            int x=Array[i];   //挿入する値を保存
            int j=i-1;        //比較対象
            
            //大きい要素を右にずらす
            while(j >= 0 && Array[j] > x) {
                Array[j+1] = Array[j];
                j--;
            }

            //適切な位置に挿入
            Array[j+1] = x;

            //各タイミングでのソート状況を出力
            for(int k=0;k < size; k++) {
                System.out.print(Array[k]);
                if(k != size-1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}