package Frontend;

import javax.swing.*;

public class fourPlayerScreen {
    public void Screen() {
        JFrame jframe = new JFrame();
        jframe.setBounds(100,100,1000,600);
        jframe.setTitle("LUDO(4Player)");
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Action gm = new Action();
        gm.setFocusable(true);
        gm.addKeyListener(gm);
        gm.addMouseListener(gm);
        jframe.add(gm);

        jframe.setVisible(true);
    }
}
