import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //入力要素数
        int size=sc.nextInt();

        //ソート対象の配列を入力
        int[] Array=new int[size];
        for(int i=0;i<size;i++) {
            Array[i]=sc.nextInt();
        }

        //バブルソート    
        for(int i=0; i <= size-2; i++) {
            for(int j=size-1; j>=i+1; j--) {
                if(Array[j-1]>Array[j]) {
                    //swap処理
                    int temp=Array[j];
                    Array[j]=Array[j-1];
                    Array[j-1]=temp;
                }
            }

            //各ソートタイミングで出力
            for(int k=0;k<size;k++) {
                System.out.print(Array[k]);
                if(k!=size-1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}