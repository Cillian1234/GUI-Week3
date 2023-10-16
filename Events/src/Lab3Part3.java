import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
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

        String[] coloursArray = {"Red", "Green", "Blue"};
        ImageIcon[] imagesArray = getImages();

        JComboBox colours = new JComboBox(coloursArray);
        c.gridx = 0;
        c.gridy = 0;
        panel.add(colours, c);

        JComboBox images = new JComboBox(imagesArray);
        c.gridx = 1;
        c.gridy = 0;
        panel.add(images, c);

        JLabel imgLabel = new JLabel("Label");
        c.gridx = 1;


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
