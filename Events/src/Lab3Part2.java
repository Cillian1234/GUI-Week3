import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Lab3Part2 extends Frame {
    Lab3Part2() {
        ImageIcon[] animalsArray = getImages();
        String[] descriptions = {"Mike", "Cat", "Dog"};

        JList animals = new JList(descriptions);
        c.anchor = GridBagConstraints.NORTH;
        c.gridx = 0;
        c.gridy = 1;
        panel.add(animals, c);

        JLabel imgLabel = new JLabel("An image will appear here", SwingConstants.CENTER);
        c.gridx = 0;
        c.gridy = 2;
        panel.add(imgLabel, c);

        JLabel desc = new JLabel("Description will appear here", SwingConstants.CENTER);
        c.gridx = 0;
        c.gridy = 3;
        panel.add(desc, c);

        MouseListener mouseListener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedItem = animals.getSelectedIndex();
                imgLabel.setText(null);
                imgLabel.setIcon(animalsArray[selectedItem]);

                desc.setText(descriptions[selectedItem]);
            }
        };

        animals.addMouseListener(mouseListener);

        setTitle("List");
        setVisible(true);
    }
    public static void main(String[] args) {
        Lab3Part2 run = new Lab3Part2();
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
