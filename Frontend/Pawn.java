package Frontend;

import java.awt.*;
import Backend.Path;
import Frontend.Interface.IPawn;

public class Pawn implements IPawn {
    public int x;
    public int y;
    public int current;
    int height,width;
    public Pawn(int h,int w){
        current=-1;
        x=-1;
        y=-1;
        height=h;
        width=w;
    }
    Path path = new Path();
    @Override
    public void draw(Graphics2D g, int i, int j, int play) {
        if(current==-1) {
            int temp1=80+(height/2),temp2=50+(width/2);
            x=i;
            y=j;
            if(play==0) {
                g.setColor(Color.RED);
            }
            else if(play==1) {
                g.setColor(Color.GREEN);
            }
            else if(play==2) {
                g.setColor(Color.YELLOW);
            }
            else if(play==3) {
                g.setColor(Color.BLUE);
            }
            g.fillOval(temp1+5+(i*width),temp2+5+(j*height),width-10,height-10);
            g.setStroke(new BasicStroke(2));
            g.setColor(Color.BLACK);
            g.drawOval(temp1+5+(i*width),temp2+5+(j*height),width-10,height-10);
        }
        else {
            int temp1 = 80, temp2 = 50;
            x = path.ax[play][current];
            y = Path.ay[play][current];
            if (play == 0) {
                g.setColor(Color.RED);
            } else if (play == 1) {
                g.setColor(Color.GREEN);
            } else if (play == 2) {
                g.setColor(Color.YELLOW);
            } else if (play == 3) {
                g.setColor(Color.BLUE);
            }
            g.fillOval(temp1 + 5 + (x * width), temp2 + 5 + (y * height), width - 10, height - 10);
            g.setStroke(new BasicStroke(2));
            g.setColor(Color.BLACK);
            g.drawOval(temp1 + 5 + (x * width), temp2 + 5 + (y * height), width - 10, height - 10);
        }
    }
}
