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

        topUp.addActionListener(this);
        makeText.addActionListener(this);
        makeCall.addActionListener(this);

        Border blackline = BorderFactory.createLineBorder(Color.black);

        Font font = new Font("Courier", Font.BOLD, 20);

        // Config for balance Label
            balance.setFont(font);
            balance.setBorder(blackline);
            balance.setBackground(Color.PINK);
            balance.setOpaque(true);
            balance.setVerticalAlignment(SwingConstants.NORTH);
            c.gridx = 0;
            c.gridy = 0;
            c.gridwidth = 3;
            panel.add(balance, c);

        // Universal config for everything else
            c.ipadx = 10;
            c.ipady = 10;
            c.gridwidth = 1;
            c.anchor = GridBagConstraints.CENTER;

        // Config for topUp Button
            topUp.setFont(font);
            topUp.setBackground(Color.PINK);
            topUp.setBorder(blackline);
            c.gridx = 0;
            c.gridy = 1;
            panel.add(topUp, c);

        // Config for makeText Button
            makeText.setFont(font);
            makeText.setBackground(Color.PINK);
            makeText.setBorder(blackline);
            c.gridx = 1;
            c.gridy = 1;
            panel.add(makeText, c);

        // Config for makeCall Button
            makeCall.setFont(font);
            makeCall.setBackground(Color.PINK);
            makeCall.setBorder(blackline);
            c.gridx = 2;
            c.gridy = 1;
            panel.add(makeCall, c);

        setTitle("Top up");
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        // If event came from topUp, increase balance
        if (source == topUp) {
            bal = bal + 20;
            balance.setText("Your balance is: €" + bal);
        }
        // If event came from makeText and balance after this action will be more than or equal to 0, reduce balance
        else if (source == makeText && (bal - 0.25) >= 0) {
            bal = bal - 0.25;
            balance.setText("Your balance is: €" + bal);
        }
        // If event came from makeCall and balance after this action will be more than or equal to 0, reduce balance
        else if (source == makeCall && (bal - 2) >= 0) {
            bal = bal - 2;
            balance.setText("Your balance is: €" + bal);
        }
    }
    public static void main(String[] args) {
        Lab3Part4 run = new Lab3Part4();
    }
}
