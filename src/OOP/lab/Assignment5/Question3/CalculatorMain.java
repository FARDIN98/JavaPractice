package OOP.lab.Assignment5.Question3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatorMain {
    JFrame frame;
    JTextField tf1, tf2, tf3, tf4;
    public CalculatorMain(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(400,300);
        tf1 = new JTextField(5);
        frame.add(tf1);
        tf2 = new JTextField(2);
        frame.add(tf2);
        tf3 = new JTextField(5);
        frame.add(tf3);
        JLabel label = new JLabel("=");
        frame.add(label);
        tf4 = new JTextField(6);
        tf4.setEnabled(false);
        frame.add(tf4);
        JButton bt = new JButton("Result");
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = 0, b = 0;
                boolean inputOkay = true;
                try{
                    a = Integer.parseInt(tf1.getText() + "");
                    b = Integer.parseInt(tf3.getText() + "");
                }catch(Exception ex){
                    inputOkay = false;
                }
                if (inputOkay && tf2.getText().equals("+")){
                    int sum = a + b;
                    tf4.setText(String.valueOf(sum));
                }
                else if (inputOkay && tf2.getText().equals("-")){
                    int substract = a - b;
                    tf4.setText(String.valueOf(substract));
                }
                else if (inputOkay && tf2.getText().equals("*")){
                    int multiply = a * b;
                    tf4.setText(String.valueOf(multiply));
                }
                else if (inputOkay && tf2.getText().equals("/")){
                    int divide = a / b;
                    tf4.setText(String.valueOf(divide));
                }
                else{
                    tf4.setText("Invalid");
                }
            }
        });
        frame.add(bt);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorMain();
    }
}
