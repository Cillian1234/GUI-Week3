import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class Lab3Part4 {
    public static void main(String[] args) {

        final double[] bal = {0};

        JFrame frame = new JFrame();
        // config frame
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Top Up");
        frame.setSize(500, 500);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints(); // create constraints variable for gridbag layout
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(25,25,25,25);

        Border blackline = BorderFactory.createLineBorder(Color.black);

        Font font = new Font("Courier", Font.BOLD, 20);

        JLabel balance = new JLabel("Your balance is: €0.00", SwingConstants.CENTER);
        balance.setFont(font);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        panel.add(balance, c);

        JButton topUp = new JButton("Top up by €20");
        topUp.setFont(font);
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        panel.add(topUp, c);

        JButton makeText = new JButton("Text");
        makeText.setFont(font);
        c.gridx = 1;
        c.gridy = 1;
        panel.add(makeText, c);

        JButton makeCall = new JButton("Call");
        makeCall.setFont(font);
        c.gridx = 2;
        c.gridy = 1;
        panel.add(makeCall, c);

        topUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bal[0] = bal[0] + 20;
                balance.setText("Your balance is: €"+bal[0]);
            }
        });

        makeText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((bal[0] - 0.25) >= 0) {
                    bal[0] = bal[0] - 0.25;
                    balance.setText("Your balance is: €" + bal[0]);
                }
            }
        });

        makeCall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((bal[0] - 2) >= 0) {
                    bal[0] = bal[0] - 2;
                    balance.setText("Your balance is: €" + bal[0]);
                }
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
