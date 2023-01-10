import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt. Color;

public class Forms extends JFrame{
    Forms(){
        this.setTitle("Principal");                               
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        this.setResizable(false);                                   
        this.setSize(400,400);                       
        this.setVisible(true);      
        ImageIcon image = new ImageIcon("logo2.png");
        this.setIconImage(image.getImage());                                                   
        this.getContentPane().setBackground(new  Color(12,11,54));
    }
}
