package OOP.theory.GUI;

import javax.swing.*;
import java.awt.*;

public class GuiGrid extends JFrame {
    GuiGrid(){
        setTitle("Grid Layout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 150);

        GridLayout layout = new GridLayout(2, 2);
        setLayout(layout);

        add(new JButton("1"));
        add(new JButton("2"));
        add(new JButton("3"));
        add(new JButton("4"));

        setVisible(true);

    }
}

class main{
    public static void main(String[] args) {
        new GuiGrid();
    }
}
