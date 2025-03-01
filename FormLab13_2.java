import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FormLab13_2 extends JFrame {
    public  FormLab13_2(){
        Draw a = new Draw();
        getContentPane().add(a);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
class Draw extends JPanel implements ActionListener{
    int angle = 0;
    int r = 100;
    public Draw(){
        Timer time1 = new Timer(50,this);
        time1.start();
    }
    public void paintComponent(Graphics g){
        g.drawOval(getWidth()/2-r,getHeight()/2-r, r * 2,r * 2);
        for (int i = 1; i <= 6; i++) {
            g.fillArc(getWidth()/2-r,getHeight()/2-r, r * 2,r * 2,i * 60 + angle,30);  
        }
    }
    boolean stats = true;
    public void actionPerformed(ActionEvent e) {
        if (stats ) {
            r -= 5; 
            if (r == 0) {
                stats = false;
            } 
        }else { 
            r+= 5; 
            if (r == 100) {
                stats = true;
            }
        }
        if (angle == 360) {
            angle = 0;
        }
        angle+= 2;
         repaint();
        }
}
