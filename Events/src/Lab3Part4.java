import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class Lab3Part4 extends Frame implements ActionListener {
    static JLabel balance = new JLabel("Your balance is: €0.00", SwingConstants.CENTER);
    static JButton topUp = new JButton("Top up by €20");
    static JButton makeText = new JButton("Text");
    static JButton makeCall = new JButton("Call");
    static double bal = 0;

    public Lab3Part4() {
        Frame frame = new Frame();
        frame.setTitle("Top Up");

        topUp.addActionListener(this);
        makeText.addActionListener(this);
        makeCall.addActionListener(this);

        Border blackline = BorderFactory.createLineBorder(Color.black);

        Font font = new Font("Courier", Font.BOLD, 20);

        balance.setFont(font);
        balance.setBorder(blackline);
        balance.setBackground(Color.PINK);
        balance.setOpaque(true);
        balance.setVerticalAlignment(SwingConstants.NORTH);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        frame.panel.add(balance, c);

        c.ipadx = 10;
        c.ipady = 10;
        c.gridwidth = 1;
        c.anchor = GridBagConstraints.CENTER;

        topUp.setFont(font);
        topUp.setBackground(Color.PINK);
        topUp.setBorder(blackline);
        c.gridx = 0;
        c.gridy = 1;
        frame.panel.add(topUp, c);

        makeText.setFont(font);
        makeText.setBackground(Color.PINK);
        makeText.setBorder(blackline);
        c.gridx = 1;
        c.gridy = 1;
        frame.panel.add(makeText, c);

        makeCall.setFont(font);
        makeCall.setBackground(Color.PINK);
        makeCall.setBorder(blackline);
        c.gridx = 2;
        c.gridy = 1;
        frame.panel.add(makeCall, c);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == topUp) {
            bal = bal + 20;
            balance.setText("Your balance is: €" + bal);
        } else if (source == makeText && (bal - 0.25) >= 0) {
            bal = bal - 0.25;
            balance.setText("Your balance is: €" + bal);
        } else if (source == makeCall && (bal - 2) >= 0) {
            bal = bal - 2;
            balance.setText("Your balance is: €" + bal);
        }
    }
    public static void main(String[] args) {
        Lab3Part4 run = new Lab3Part4();
    }
}
