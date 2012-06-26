import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.GridLayout;



public class Window extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Panel pan = new Panel();
			
	public Window () {
		this.setTitle("ABMS");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        
        
        this.setContentPane(pan);
        this.setVisible(true);
        go();
	}
	
	private void go() {
        pan.repaint();  
        try {
                Thread.sleep(10);
        } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }     
	}

}
