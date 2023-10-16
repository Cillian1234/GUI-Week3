import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab3Part1b {
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

        JButton button;

        button = new JButton("My text will change when pushed");
        c.gridx = 1;
        c.gridy = 2;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText("See? I told you!");
            }
        });
        panel.add(button, c);

        frame.add(panel);
        frame.setVisible(true);
    }
}
