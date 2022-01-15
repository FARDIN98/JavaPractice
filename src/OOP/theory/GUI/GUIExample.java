package OOP.theory.GUI;

import javax.swing.*;
import java.awt.*;

public class GUIExample {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("My Application");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400, 150);
//
//        JPanel panel = new JPanel();
//        frame.add(panel);
//        panel.setBackground(Color.CYAN);
//
//        JButton button = new JButton("click");
//        button.setBackground(Color.LIGHT_GRAY);
//        button.setForeground(Color.white); //changes font color of button
//        panel.add(button);
//
//        frame.setVisible(true);
//    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);

        JPanel panelTop = new JPanel();
        panelTop.setBackground(Color.ORANGE);
        JPanel panelBottom = new JPanel();
//        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);  //elements will show from left
        panelBottom.setBackground(Color.YELLOW);

        JLabel label = new JLabel("Label1");
        JTextField txtField = new JTextField( 15);

        panelTop.add(label);
        panelTop.add(txtField);

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");

        panelBottom.add(b1);
        panelBottom.add(b2);
        panelBottom.add(b3);

        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
//        panelBottom.setLayout(layout);   //buttons wil show from left

        frame.add(panelTop);
        frame.add(panelBottom);


        frame.setVisible(true);
    }
}
