package Backend;

import Backend.Interface.IPlayer;
import Frontend.Pawn;

import java.awt.Graphics2D;

public class twoPlayer implements IPlayer {
    int height;
    int width;
    int status;
    public int coin;
    public Pawn[] pa=new Pawn[4];
    public twoPlayer(int height,int width) {
        status=-1;
        coin=0;
        for(int i=0;i<4;i++) {
            pa[i]=new Pawn(height,width);
        }
    }
    public void draw(Graphics2D g) {
    }
}