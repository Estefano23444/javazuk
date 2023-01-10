import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt. Color;

public class Logo{
    public static void main(String[] args) {
        
    JFrame frm  = new JFrame();                                
    frm. setTitle("Principal");                               
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
    frm.setResizable(false);                                   
    frm.setSize(400,400);                       
    frm.setVisible(true);      
    ImageIcon image = new ImageIcon("logo2.png");
    frm.setIconImage(image.getImage());                           
    // frmlcon image = new Imagelcon("logo.png");                 
    // frm.setlconlmage(image.getlmage());                        
    frm.getContentPane().setBackground(new  Color(12,11,54));

    }
}