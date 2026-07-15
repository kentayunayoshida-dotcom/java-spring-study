import java.util.*;

/*Selection sortした回数を出力 */
public class Selection Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;

        // 選択ソート
        for (int i = 0; i < N; i++) {

            int minIndex = i;

            // i以降で最小値を探す
            for (int j = i + 1; j < N; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            // 必要なら交換
            if (minIndex != i) {
                int tmp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = tmp;
                count++;
            }
        }

        System.out.println(count);
    }
}