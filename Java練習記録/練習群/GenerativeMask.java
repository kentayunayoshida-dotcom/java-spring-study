public class GenerativeMask {

    public static void main(String[] args) {

        int wigth = 80;    //出力する横幅
        int height = 40;   //出力する高さ

        for(int y=0; y < height; y++) {
            StringBuilder line = new StringBuilder();
            for(int x=0; x < wigth ; x++) {

                /*
                 * 座標系を中央基準に変換
                 *
                 * 左上(0,0)ではなく、
                 * 画面中央が(0,0)になるようにする。
                 */
                double nx = (x-wigth / 2.0) / 15.0;
                double ny = (y-height / 2.0) / 15.0;

                /*
                 * 左右対称にするため絶対値を取る。
                 * 左右同じ計算結果になる。
                 */
                double mirrorX = Math.abs(nx);

                /*
                 * 模様を作る数式
                 *
                 * sin → 横方向の波
                 * cos → 縦方向の波
                 * sqrt → 中心から離れるほど値を減らす
                 */
                double v =
                        Math.sin(mirrorX * 3)
                        + Math.cos(ny * 4)
                        - Math.sqrt(mirrorX * mirrorX + ny * ny);

                
                char c;
                /*
                 * 計算結果によって文字を変える
                 *
                 * 値が大きい
                 *   ↓
                 * 濃い文字
                 */
                if(v > 0.8) {
                    c = '・';
                } else if(v > 0.2) {
                    c = '*';
                } else if(v > -0.4) {
                    c = '.';
                } else {
                    c = ' ';
                }
                line.append(c);
            }
            System.out.println(line);
        }
    }
}