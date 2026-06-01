import java.util.*;

public class quick_sort {
    static long count=0;
    // swap関数
    static void swap(int[] Array, int i, int j) {
        int temp=Array[i];
        Array[i]=Array[j];
        Array[j]=temp;
    }
    // クイックソート
    static void quick_sort(int[] Array, int left, int right) {
        // 要素数1以下なら終了
        if(left+1 >= right) {
            return;
        }
        // 末尾をpivotにする
        int pivot=Array[right-1];
        // pivot未満を入れる位置
        int curIndex=left;

        // pivot未満を左側へ集める
        for(int i=left; i <= right-2; i++) {
            if(Array[i] < pivot) {
                swap(Array, curIndex, i);
                curIndex++;
                count++;
            }
        }
        // pivotを正しい位置へ
        swap(A, curIndex, right - 1);

        // 左側
        quickSort(A, left, curIndex);

        // 右側
        quickSort(A, curIndex + 1, right);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] Array=new int[n];
        for(int i=0; i < n; i++) {
            Array[i]=sc.nextInt();
        }
        quick_sort(Array, 0, n);

        // ソート結果出力
        for(int i=0; i < n; i++) {
            System.out.print(Array[i]);
            if(i != n-1) System.out.print(" ");
        }
        System.out.println();
        System.out.println(count);
    }
}