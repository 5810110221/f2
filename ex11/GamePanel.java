import javax.swing.*;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class GamePanel extends JPanel {
	public GamePanel(){
	}

	public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.pink);
        g2d.fillRect(0,0,800,500); 
        //To draw a rectangle from the point (x, y) and the size as specified by drawing a solid rectangle.
        Point p1 = new Point(160,160);
        Point p2 = new Point(150,150);
        Point p3 = new Point(190,190);
        Point p4 = new Point(20,110);
        g2d.setPaint(Color.blue);
        g2d.drawRect(50,50,150,150); //To draw a rectangle from the point (x, y) and the size as specified By drawing a rectangle
        g2d.drawRect(200,10,300,190);
        g2d.drawOval(230,180,40,40);
        g2d.drawOval(330,180,40,40);
        g2d.setPaint(Color.red);
        g2d.drawLine(250,20,350,190); //Use the straight line from the point (x1, y1) to the point (x2, y2).
        char [] char_text = { '5', '8', '1', '0', '1', '1','0','5','7','8' };
        g2d.setPaint(Color.black);
        g2d.drawChars ( char_text, 0, 10, 30, 30 );
    }
}