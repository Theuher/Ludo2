import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Introduction {

    static Opt op = new Opt();

    public  void screen() {
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 1000, 700);
        frame.setTitle("Introduction");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                try {
                    Image backgroundImage = ImageIO.read(new File("C:\\Users\\Dell\\OneDrive\\Documents\\Ludo2\\image\\introduction.jpg"));
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        panel.setLayout(null);
        JButton nextButton = new JButton("Next");
        nextButton.setBounds(900, 600, 70, 40);
        nextButton.setBackground(Color.WHITE);
        nextButton.setForeground(Color.BLACK);
        Font buttonFont = new Font("Arial", Font.PLAIN, 16);
        nextButton.setFont(buttonFont);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op.screen();
                frame.dispose();
            }
        });

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(10, 10, 70, 30);
        exitButton.setBackground(Color.WHITE);
        exitButton.setForeground(Color.BLACK);
        Font exitFont = new Font("Arial", Font.PLAIN, 16);
        exitButton.setFont(buttonFont);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(exitButton);
        panel.add(nextButton);
        frame.add(panel);
        frame.setVisible(true);
    }
}
