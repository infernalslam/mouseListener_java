import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
public class mouse extends JApplet implements MouseListener {
	int x = 10;
	int y = 160;
	public void init () {
		super.init();
		addMouseListener(this);
		setSize(640,480);
	}
	public void paint (Graphics g){
		super.paint(g);
		g.drawString("x =" + x + " , y =" + y ,5,20);
		g.fillOval(x, y, 20, 20);
	}
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		Graphics g = getGraphics();
		g.drawString("["+x+","+y+"]", x, y);
	}
	public void mouseClicked(MouseEvent e) {
		this.x = e.getX();
		this.y = e.getY();
	}
	public void mouseReleased(MouseEvent e) {
		repaint();
	}
	public void mouseEntered(MouseEvent e) {}	
	public void mouseExited(MouseEvent e) {}
	
}
