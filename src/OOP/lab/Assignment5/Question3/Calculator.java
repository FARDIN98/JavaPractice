package OOP.lab.Assignment5.Question3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JTextField num1 = new JTextField() ;
        JTextField operator = new JTextField() ;
        JTextField num2 = new JTextField() ;
        JTextField ans = new JTextField() ;

        num1.setBounds(100, 80, 50, 40);
        operator.setBounds(200, 80, 30, 40);
        num2.setBounds(300, 80, 50, 40);
        ans.setBounds(400, 80, 50, 40);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
        JButton button = new JButton("Result");

        button.setBounds(150, 150, 70, 40);



        frame.setLayout(null);
        frame.add(button); frame.add(num1) ; frame.add(operator) ; frame.add(num2) ;  frame.add(ans) ;
        frame.setVisible(true);
        num1.setEditable(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator.getText().equals("+"))
                    ans.setText(Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText()) + "");
                else if (operator.getText().equals("-"))
                    ans.setText(Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText()) + "");
                else if (operator.getText().equals("*"))
                    ans.setText(Integer.parseInt(num1.getText()) * Integer.parseInt(num2.getText()) + "");
                else if (operator.getText().equals("/"))
                    ans.setText(Integer.parseInt(num1.getText()) / Integer.parseInt(num2.getText()) + "");
            }
        });
    }
}
