import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Lab3Part3 extends Frame implements ActionListener {
    static String[] colourNames = {"Red", "Green", "Blue"};
    static Color[] coloursArray = {Color.RED, Color.GREEN, Color.BLUE};
    static String[] imageNames = {"Mike", "Cat", "Dog", "Dog1", "Dog2"};
    static ImageIcon[] imagesArray = getImages();
    static JComboBox colours = new JComboBox(colourNames);
    static JComboBox images = new JComboBox(imageNames);
    static JLabel imgLabel = new JLabel("An image will appear here", SwingConstants.CENTER);
    static JLabel desc = new JLabel("Description will appear here", SwingConstants.CENTER);

    public Lab3Part3() {

        Frame frame = new Frame();
        frame.setTitle("ComboBoxes");

        c.gridx = 0;
        c.gridy = 0;
        frame.panel.add(colours, c);

        c.gridx = 1;
        c.gridy = 0;
        frame.panel.add(images, c);

        c.gridx = 0;
        c.gridy = 1;
        c.anchor = GridBagConstraints.CENTER;
        c.gridwidth = 2;
        frame.panel.add(imgLabel, c);

        c.gridx = 0;
        c.gridy = 2;
        c.anchor = GridBagConstraints.SOUTH;
        c.gridwidth = 2;
        desc.setOpaque(true);
        frame.panel.add(desc, c);

        images.addActionListener(this);
        colours.addActionListener(this);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Lab3Part3 run = new Lab3Part3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == images) {
            imgLabel.setIcon(imagesArray[images.getSelectedIndex()]);
            imgLabel.setText(null);
        } else if (source == colours) {
            desc.setBackground(coloursArray[colours.getSelectedIndex()]);
        }
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

        try {bufferedImage = ImageIO.read(new File("images/cat.png"));}
        catch (IOException e) {throw new RuntimeException(e);}
        image = bufferedImage.getScaledInstance(150,150, Image.SCALE_DEFAULT);
        ImageIcon dog1 = new ImageIcon(image);

        try {bufferedImage = ImageIO.read(new File("images/cat.png"));}
        catch (IOException e) {throw new RuntimeException(e);}
        image = bufferedImage.getScaledInstance(150,150, Image.SCALE_DEFAULT);
        ImageIcon dog2 = new ImageIcon(image);

        ImageIcon[] imagesArray = {mike, dog, cat, dog1, dog2};

        return imagesArray;

    }
}
