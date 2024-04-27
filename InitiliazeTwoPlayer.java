import java.awt.Graphics2D;

public class InitiliazeTwoPlayer implements IinitiliazePlayer {

    twoPlayer[] pl=new twoPlayer[2];
    int[][] initialx= {
            {1,1,3,3},
            {10,10,12,12},
            {10,10,12,12},
            {1,1,3,3}
    };
    int[][] initialy= {
            {1,3,1,3},
            {1,3,1,3},
            {10,12,10,12},
            {10,12,10,12}
    };
    public InitiliazeTwoPlayer(int height, int width) {
        for(int i=0;i<2;i++) {
            pl[i]=new twoPlayer(height,width);
        }
    }
    public void draw(Graphics2D g) {
//        for(int i=0;i<2;i++) {
//            for(int j=0;j<4;j++) {
//                pl[i].pa[j].draw(g,initialx[i][j],initialy[i][j],i);
//            }
//        }
            for(int j=0;j<4;j++) {
                pl[0].pa[j].draw(g,initialx[0][j],initialy[0][j],0);
                pl[1].pa[j].draw(g,initialx[2][j],initialy[2][j],2);

            }
    }

}
