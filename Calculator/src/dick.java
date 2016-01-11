import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class dick {
	public static void main(String args[]){
		rider r = new rider("Калькулятор");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setBounds(700,400,300,300);
		r.setResizable(false);		
	}

}
