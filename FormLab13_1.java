import java.awt.*;
import javax.swing.*;

public class FormLab13_1 extends JFrame {
public FormLab13_1(){
Draw1 a = new Draw1();
getContentPane().add(a);
setSize(300, 300);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}

class Draw1 extends JPanel{
   public void paintComponent(Graphics g){
   
   g.setFont(new Font("Tahoma", Font.BOLD, 20));
   g.drawString("Just Keep Smailing", getWidth()/2-100, getHeight()/2-100);
   g.setColor(Color.yellow);
   g.fillOval(getWidth()/2-60, getHeight()/2-75, 100,100);
   g.setColor(Color.black);
   g.drawOval(getWidth()/2-60, getHeight()/2-75, 100,100);
   g.setColor(Color.black);
   g.fillOval(getWidth()/2-40, getHeight()/2-50, 20,20);
   g.setColor(Color.black);
   g.fillOval(getWidth()/2, getHeight()/2-50, 20,20);
   g.drawArc(getWidth()/2-50, getHeight()/2-75, 80, 80, 225, 100);
   
   Polygon xy = new Polygon();
   xy.addPoint(getWidth()/2-60,getHeight()/2+5);
   xy.addPoint(getWidth()/2-60,getHeight()/2+45);
   xy.addPoint(getWidth()/2+40,getHeight()/2+8);
   xy.addPoint(getWidth()/2+40,getHeight()/2+50);
  
   g.setColor(Color.red);
  g.fillPolygon(xy);
   xy.addPoint(getWidth()/2-60,getHeight()/2+5);
   xy.addPoint(getWidth()/2-60,getHeight()/2+45);
   xy.addPoint(getWidth()/2+40,getHeight()/2+8);
   xy.addPoint(getWidth()/2+40,getHeight()/2+50);
   g.setColor(Color.black);
   g.drawPolygon(xy);
   }
   }
