import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    static JPanel panel = new JPanel();
    static GridBagConstraints c = new GridBagConstraints(); // create constraints variable for gridbag layout

    {
        setLocation(100, 50);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setResizable(false);

        panel.setLayout(new GridBagLayout());
        c.fill = GridBagConstraints.NONE;
        c.weighty = 1;
        c.weightx = 1;
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridheight = 1;
        c.gridwidth = 1;
        c.insets = new Insets(25,25,25,25);

        add(panel);
    }
    public Frame() {


    }
}
