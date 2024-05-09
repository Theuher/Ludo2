package Frontend;

import javax.swing.*;

public class twoPlayerScreen {
    public void Screen() {
        JMenuBar jMenuBar = new JMenuBar();
        JFrame mframe = new JFrame();
        mframe.setBounds(100,100,1000,600);
        mframe.setTitle("LUDO(2Player)");
        mframe.setResizable(false);
        mframe.add(jMenuBar);
        mframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        twoPlayerAction tm = new twoPlayerAction();
        tm.setFocusable(true);
        tm.addKeyListener(tm);
        tm.addMouseListener(tm);
        mframe.add(tm);
        mframe.setVisible(true);
    }
}
