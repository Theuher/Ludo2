import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fourPlayerScreen {
    public void Screen() {
        JFrame jframe = new JFrame();
        jframe.setBounds(100,100,1000,600);
        jframe.setTitle("LUDO(4Player)");
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Moves gm = new Moves();
        gm.setFocusable(true);
        gm.addKeyListener(gm);
        gm.addMouseListener(gm);
        jframe.add(gm);

        jframe.setVisible(true);
    }
}
