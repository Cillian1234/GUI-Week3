import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab3Part1a extends Frame {
    Lab3Part1a() {

        JLabel label;
        JButton button;

        label = new JLabel("Cillian", SwingConstants.CENTER);
        c.gridx = 1;
        c.gridy = 1;
        panel.add(label, c);

        button = new JButton("Translate");
        c.gridx = 1;
        c.gridy = 2;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Translated");
            }
        });
        panel.add(button, c);

        setTitle("Translate");
        setVisible(true);
    }
    public static void main(String[] args) {
        Lab3Part1a run = new Lab3Part1a();
    }
}
