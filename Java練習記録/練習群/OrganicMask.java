import java.util.Random;

public class OrganicMask {
    public static void main(String[] args) {
        
        int wigth=90;
        int height=45;

        Random rand=new Random();

        // 全マスを走査
        for(int y=0;y<height;y++) {
            for(int x=0;x<wigth;x++) {

                /*
                 * 左右対称にするため
                 * 中心からの横距離を求める
                 */
                double px=Math.abs(x-wigth/2.0);
                //中心からの縦距離
                double py=y-height/2.0;

                //模様生成
                double d=
                        // 横方向の波
                        Math.sin(px*0.35)
                        // 縦方向の波
                        +Math.cos(py*0.25)
                        // ランダムノイズ
                        +rand.nextDouble()*0.3
                        // 外側を削る
                        -Math.sqrt(px*px+py*py)/18;
                
                if(d>1.0) {
                    System.out.println("◆");
                } else if(d>0.5) {
                    System.out.println("●");
                } else if(d>0) {
                    System.out.println("・");
                } else {
                    System.out.println(" ");
                }
                System.out.println();
            }
        }
    }
}