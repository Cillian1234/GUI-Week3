import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Lab3Part2 {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        // config frame
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Translate");
        frame.setSize(500, 1000);
        frame.setResizable(false);

        JPanel panel = new JPanel();

        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints(); // create constraints variable for gridbag layout
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(25,25,25,25);

        ImageIcon[] animalsArray = getImages();
        String[] descriptions = {"Mike", "Cat", "Dog"};

        JList animals = new JList(animalsArray);
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 2;
        panel.add(animals, c);

        JLabel label = new JLabel("An image will appear here");
        c.gridx = 1;
        c.gridy = 2;
        c.gridwidth = 1;
        panel.add(label, c);

        JLabel desc = new JLabel("Description will appear here", SwingConstants.CENTER);
        c.gridx = 1;
        c.gridy = 3;
        panel.add(desc, c);

        frame.add(panel);
        frame.setVisible(true);

        MouseListener mouseListener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedItem = animals.getSelectedIndex();
                label.setText(null);
                label.setIcon(animalsArray[selectedItem]);

                desc.setText(descriptions[selectedItem]);
            }
        };
        animals.addMouseListener(mouseListener);
    }

    public static ImageIcon[] getImages() {

        BufferedImage bufferedImage;
        Image image;
        try {bufferedImage = ImageIO.read(new File("images/Mike.jpg"));}
        catch (IOException e) {throw new RuntimeException(e);}
        image = bufferedImage.getScaledInstance(150,150, Image.SCALE_DEFAULT);
        ImageIcon mike = new ImageIcon(image);

        try {bufferedImage = ImageIO.read(new File("images/dog.png"));}
        catch (IOException e) {throw new RuntimeException(e);}
        image = bufferedImage.getScaledInstance(150,150, Image.SCALE_DEFAULT);
        ImageIcon cat = new ImageIcon(image);

        try {bufferedImage = ImageIO.read(new File("images/cat.png"));}
        catch (IOException e) {throw new RuntimeException(e);}
        image = bufferedImage.getScaledInstance(150,150, Image.SCALE_DEFAULT);
        ImageIcon dog = new ImageIcon(image);

        ImageIcon[] animalsArray = {mike, dog, cat};

        return animalsArray;

    }


}