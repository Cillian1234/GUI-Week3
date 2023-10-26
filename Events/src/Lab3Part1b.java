import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab3Part1b extends Frame {
    Lab3Part1b() {
        JButton button;

        button = new JButton("My text will change when pushed");
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 2;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText("See? I told you!");
            }
        });
        panel.add(button, c);

        setTitle("Button");
        setVisible(true);
    }
    public static void main(String[] args) {
        Lab3Part1b run = new Lab3Part1b();
    }
}
