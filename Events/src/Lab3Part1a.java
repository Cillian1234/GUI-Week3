import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab3Part1a {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        // config frame
        frame.setLocation(200, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Translate");
        frame.setSize(500, 500);
        frame.setResizable(false);

        JPanel panel = new JPanel();

        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints(); // create constraints variable for gridbag layout
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(25,25,25,25);

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

        JLabel desc = new JLabel();

        frame.add(panel);
        frame.setVisible(true);
    }
}
