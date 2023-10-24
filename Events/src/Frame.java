import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    static JPanel panel = new JPanel();
    static GridBagConstraints c = new GridBagConstraints(); // create constraints variable for gridbag layout
    String title = "Top up";

    public Frame() {
        setLocation(200, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle(title);
        setSize(500, 500);
        setResizable(false);

        panel.setLayout(new GridBagLayout());
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(25,25,25,25);

        add(panel);
    }
}
