import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Lab3Part3 extends Frame {

    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.setTitle("ComboBoxes");

        String[] colourNames = {"Red", "Green", "Blue"};
        Color[] coloursArray = {Color.RED, Color.GREEN, Color.BLUE};
        String[] imageNames = {"Mike", "Cat", "Dog", "Dog1", "Dog2"};
        ImageIcon[] imagesArray = getImages();

        JComboBox colours = new JComboBox(colourNames);
        c.gridx = 0;
        c.gridy = 0;
        frame.panel.add(colours, c);

        JComboBox images = new JComboBox(imageNames);
        c.gridx = 1;
        c.gridy = 0;
        frame.panel.add(images, c);

        JLabel imgLabel = new JLabel("An image will appear here", SwingConstants.CENTER);
        c.gridx = 0;
        c.gridy = 1;
        c.anchor = GridBagConstraints.CENTER;
        c.gridwidth = 2;
        frame.panel.add(imgLabel, c);

        JLabel desc = new JLabel("Description will appear here", SwingConstants.CENTER);
        c.gridx = 0;
        c.gridy = 2;
        c.anchor = GridBagConstraints.SOUTH;
        c.gridwidth = 2;
        desc.setOpaque(true);
        frame.panel.add(desc, c);

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
