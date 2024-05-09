package Frontend.Interface;

import java.awt.event.*;

public interface IAction extends KeyListener, MouseListener , ActionListener {
    void mouseClicked(MouseEvent e);
    void keyPressed(KeyEvent e);
}