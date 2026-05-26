import java.util.Scanner;

public class merge_sort {
    static long mergeSort(int[] Array, int left, int right) {
        if(right-left<=1) return 0;

        int mid=(left+right)/2;
        long count=0;

        count+=mergeSort(Array, left, mid);
        count+=mergeSort(Array, mid, right);

        int[] temp=new int[right-left];
        int i=left, j=mid, k=0;

        while(i < mid && j < right) {
            if(Array[i] <= Array[j]) {
                temp[k++]=Array[i++];
            } else {
                temp[k++]=Array[j++];
                count+=(mid-i);
            }
        }

        while(i < mid) temp[k++]=Array[i++];
        while(j < right) temp[k++]=Array[j++];

        System.arraycopy(temp, 0, Array, left, temp.length);

        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
        int[] Array=new int[size];
        for(int i=0; i < size; i++) {
            Array[i]=sc.nextInt();
        }

        System.out.println(mergeSort(Array, 0, size));
    }
}