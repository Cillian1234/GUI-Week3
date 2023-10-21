import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Lab3Part3 {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        // config frame
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Translate");
        frame.setSize(500, 500);
        frame.setResizable(false);

        JPanel panel = new JPanel();

        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints(); // create constraints variable for gridbag layout
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(25,25,25,25);

        String[] colourNames = {"Red", "Green", "Blue"};
        Color[] coloursArray = {Color.RED, Color.GREEN, Color.BLUE};
        String[] imageNames = {"Mike", "Cat", "Dog"};
        ImageIcon[] imagesArray = getImages();

        JComboBox colours = new JComboBox(colourNames);
        c.gridx = 0;
        c.gridy = 0;
        panel.add(colours, c);

        JComboBox images = new JComboBox(imageNames);
        c.gridx = 1;
        c.gridy = 0;
        panel.add(images, c);

        JLabel imgLabel = new JLabel("An image will appear here", SwingConstants.CENTER);
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 2;
        panel.add(imgLabel, c);

        JLabel desc = new JLabel("Description will appear here", SwingConstants.CENTER);
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        desc.setOpaque(true);
        panel.add(desc, c);

        images.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                imgLabel.setIcon(imagesArray[images.getSelectedIndex()]);
                imgLabel.setText(null);
            }
        });

        colours.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                desc.setBackground(coloursArray[colours.getSelectedIndex()]);
            }
        });

        frame.add(panel);
        frame.setVisible(true);
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

        ImageIcon[] imagesArray = {mike, dog, cat};

        return imagesArray;

    }
}
