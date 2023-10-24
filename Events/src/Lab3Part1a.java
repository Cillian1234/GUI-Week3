import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab3Part1a extends Frame {
    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.setTitle("Button");

        JLabel label;
        JButton button;

        label = new JLabel("Cillian", SwingConstants.CENTER);
        c.gridx = 1;
        c.gridy = 1;
        frame.panel.add(label, c);

        button = new JButton("Translate");
        c.gridx = 1;
        c.gridy = 2;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Translated");
            }
        });
        frame.panel.add(button, c);


        frame.setVisible(true);
    }
}
