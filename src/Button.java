import javax.swing.JButton;

import java.awt.GridLayout;

public class Button extends JButton {

	private String name;
	
	public Button (String str, Panel pan) {
		super(str);
		this.name = str;
		
	}
}
