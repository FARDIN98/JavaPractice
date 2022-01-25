package OOP.lab.Assignment5.Question2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Counter2 {
     JFrame fr;
     JTextField tf;
     JButton c,r;
     public Counter2(){
         fr = new JFrame("User Defined Counter");
         fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         fr.setLayout(new FlowLayout());
         fr.setSize(200,100);
         fr.add(new JLabel("Input: "));
         JTextField tf = new JTextField(8);
         fr.add(tf);
         c = new JButton("Count");
         fr.add(c);
         c.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 tf.setText(Integer.parseInt(tf.getText()) +1+"");
             }
         });
         r = new JButton("Reset");
         fr.add(r);
         r.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 tf.setText("0");
             }
         });
         fr.setVisible(true);
     }

    public static void main(String[] args) {
        new Counter2();
    }
}
