package java_swing;

import javax.swing.*;
import java.awt.*;

public class javaSwing {
    public static void main(String[] args) {

        JLabel  lable = new JLabel("Imperial coll");
        ImageIcon image1 = new ImageIcon("ICE.png");
        lable.setIcon(image1);
        lable.setHorizontalTextPosition(JLabel.RIGHT);
        lable.setForeground(new Color(41, 172, 36, 255));
        lable.setFont(new Font("MV boli",Font.PLAIN,20));

        JFrame frame = new JFrame();
        frame.setTitle("Practise Java swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setVisible(true);

        frame.add(lable);

        ImageIcon image = new ImageIcon("logo.jpg" );
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(255, 255, 255, 255));



    }
}
