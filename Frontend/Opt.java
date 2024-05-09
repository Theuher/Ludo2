package Frontend;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Opt {

    static twoPlayerScreen ts = new twoPlayerScreen();
    static fourPlayerScreen fs = new fourPlayerScreen();
    static Introduction intro = new Introduction();
    BufferedImage img;
    public void screen() {
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 1000, 700);
        frame.setTitle("Main");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                try {
                    img = ImageIO.read(Opt.class.getResource("/image/ludo4.jpg"));
                    Image backgroundImage = img;
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        panel.setLayout(null);
        JLabel label = new JLabel("Welcome to Ludo!");
        label.setBounds(400, 88, 300, 50);
        label.setForeground(Color.WHITE);
        Font boldFont = new Font("Arial", Font.BOLD, 28); // Create a bold font with size 24
        label.setFont(boldFont);
        panel.add(label);

        JButton twoPlayerButton = new JButton("2 Player");
        twoPlayerButton.setBounds(400, 210, 200, 40);
        twoPlayerButton.setBackground(Color.BLUE);
        twoPlayerButton.setForeground(Color.WHITE);
        Font buttonFont = new Font("Arial", Font.PLAIN, 16);
        twoPlayerButton.setFont(buttonFont);
        twoPlayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ts.Screen();
                frame.dispose();
            }
        });
        panel.add(twoPlayerButton);

        JButton fourPlayerButton = new JButton("4 Player");
        fourPlayerButton.setBounds(400, 315, 200, 40);
        fourPlayerButton.setBackground(Color.GREEN);
        fourPlayerButton.setForeground(Color.WHITE);
        fourPlayerButton.setFont(buttonFont);
        fourPlayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fs.Screen();
                frame.dispose();
            }
        });
        panel.add(fourPlayerButton);

        JButton backButton = new JButton("Back");
        backButton.setBounds(20, 20, 70, 40);
        backButton.setBackground(Color.WHITE);
        backButton.setForeground(Color.BLACK);
        backButton.setFont(buttonFont);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                intro.screen();
                frame.dispose();
            }
        });
        panel.add(backButton);

        frame.add(panel);
        frame.setVisible(true);
    }

}
