package OOP.theory.GUI;

import javax.swing.*;
import java.awt.*;

public class GuiCode {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,150);

        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        JLabel label = new JLabel("Name");
        JTextField field = new JTextField(15);
        JButton button = new JButton("OK");

        panel.add(label);
        panel.add(field);
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}
