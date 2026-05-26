public class GenerativeMask {

    public static void main(String[] args) {

        int wigth = 80;
        int height = 40;

        for(int y=0; y < height; y++) {
            StringBuilder line = new StringBuilder();
            for(int x=0; x < wigth ; x++) {
                double nx = (x-wigth / 2.0) / 15.0;
                double ny = (y-height / 2.0) / 15.0;

                double mirrorX = Math.abs(nx);

                double v =
                        Math.sin(mirrorX * 3)
                        + Math.cos(ny * 4)
                        - Math.sqrt(mirrorX * mirrorX + ny * ny);

                
                char c;
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