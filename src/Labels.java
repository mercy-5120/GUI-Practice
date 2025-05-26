import javax.swing.*;
import java.awt.*;
public class Labels {

    public static void main(String[]  args){

        ImageIcon image = new ImageIcon("Assets/logo.png");


        JLabel label = new JLabel();
        label.setText("Do you code?");//set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//Set the text position on horizontally (left, centre, right)
        label.setVerticalTextPosition(JLabel.TOP);//Set the text position on vertically (top, centre, bottom)
        label.setForeground(new Color(100, 17, 10));// Sets color of the text
        label.setFont(new Font("MV Boli", Font.PLAIN,20));
        label.setIconTextGap(10);//Sets distance between elements in a text
        label.setBackground(Color.MAGENTA);// Sets the background color of the label
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.CENTER);//Set vertical-position of icon and text within the label
        label.setHorizontalAlignment(JLabel.CENTER);//Set horizontal-position of icon and text within the label
        label.setBounds(100, 100, 300, 300);//set position of x, y withoin frame alongside dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.setTitle("This is the Labels Frame");
        frame.setIconImage(image.getImage());




    }
}
