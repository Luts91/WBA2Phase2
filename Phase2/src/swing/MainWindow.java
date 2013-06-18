package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainWindow extends JFrame{
	SearchWindow sw;
	VerleihWindow vw;
	
	public MainWindow() {
		this.getContentPane().setLayout(null);

		this.initWindow();
		this.setBounds(10, 10, 1100, 480);
	}

	private void initWindow() {
		sw=new SearchWindow();
		this.getContentPane().add(sw);
		
		vw=new VerleihWindow();
		this.getContentPane().add(vw);
		
		this.pack();
		
	}
	


}
