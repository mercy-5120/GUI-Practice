import javax.swing.*;
import java.awt.*;

public class Frame {
    public static void main(String[] args){

        JFrame frame = new JFrame();//creates a new frame
        frame.setTitle("This is the JFrame Title");//sets frame title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        frame.setResizable(true);
        frame.setSize(420,420);
        frame.setVisible(true);//makes frame visible

        ImageIcon logo = new ImageIcon("Assets/logo.png");//create an ImageIcon
        frame.setIconImage(logo.getImage());//Change icon of the frame
        frame.getContentPane().setBackground(new Color(50, 17, 20));

    }
}
