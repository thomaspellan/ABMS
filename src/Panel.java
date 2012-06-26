import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Color;


public class Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent (Graphics g){
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.orange);
		g.fillOval(this.getWidth()/2, this.getHeight()/2, this.getWidth()/4,this.getHeight()/4);
	}
}
