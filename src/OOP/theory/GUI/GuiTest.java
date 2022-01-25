package OOP.theory.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Counter{
    Counter(){
        JFrame f;
        JTextField tf;
        JButton b,r;
        f = new JFrame("Counter");
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200,100);
        f.add(new JLabel("Counter"));
        tf = new JTextField(10);
        tf.setText("0");
        f.add(tf);
        b = new JButton("Count");
        f.add(b);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(Integer.parseInt(tf.getText()) + 1 +"");
            }
        });
        r = new JButton("Reset");
        f.add(r);
        r.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("0");
            }
        });
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Counter();
    }

//    public class CounterAction implements ActionListener{
//        public void actionPerformed(ActionEvent e){
//            tf.setText(Integer.parseInt(tf.getText()) +1 + "");
//        }
//    }
}

public class GuiTest {
}
