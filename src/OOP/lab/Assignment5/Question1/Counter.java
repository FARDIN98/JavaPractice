package OOP.lab.Assignment5.Question1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Counter implements ActionListener{
    JFrame f;
    JTextField tf;
    JButton c,r;
    public Counter(){
        f = new JFrame("Counter");
        f.setLayout(new FlowLayout());
        f.setSize(250,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new Label("Counter: "));
        tf = new JTextField(8);
        tf.setEnabled(false);
        f.add(tf);
        tf.setText("0");
        c = new JButton("Count");
        f.add(c);
        c.addActionListener(this);
        r = new JButton("Reset");
        f.add(r);
        r.addActionListener(this);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ex) {
        if (ex.getSource() == c)
            tf.setText(Integer.parseInt(tf.getText()) + 1 + "");
        else if (ex.getSource() == r)
            tf.setText("0");
    }

    public static void main(String[] args) {
        new Counter();
    }


}