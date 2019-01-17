package useridlab10;

import java.awt.*;
import javax.swing.*;

class BoxGUI extends JFrame {

    JFrame frame;
    JButton[] button;
    private int delay = 20;

    public BoxGUI(int r, int c, int start, int exit, int numKittens) {
        frame = new JFrame();
        button = new JButton[r * c];
        for (int i = 0; i < r * c; i++) {
            button[i] = new JButton("0");
            button[i].setFont(new Font("Arial", Font.PLAIN, 30));
            frame.add(button[i]);
        }
        button[start].setText("" + numKittens);
        button[start].setBackground(new Color(0, 255, 51));
        button[exit].setBackground(new Color(255, 51, 51));
        frame.setLayout(new GridLayout(r, c));
        frame.setSize(r * 80 + 20, c * 80 + 20);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void updateGUI(int[] table) {
        for (int i = 0; i < table.length; i++) {
            if (table[i] == 0) {
                button[i].setText("");
            } else {
                button[i].setText("" + table[i]);
            }
        }
        try {
            Thread.sleep(delay);
        } catch (InterruptedException ex) {
        }
    }
}
