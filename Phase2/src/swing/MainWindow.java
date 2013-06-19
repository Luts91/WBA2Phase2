package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class MainWindow extends JFrame implements WindowListener{
	SearchWindow sw;
	VerleihWindow vw;
	UsersWindow uw;
	WunschWindow ww;
	
	public MainWindow() {
		this.getContentPane().setLayout(null);

		this.initWindow();
		this.setBounds(10, 10, 1100, 800);
	}

	private void initWindow() {
		sw=new SearchWindow();
		this.getContentPane().add(sw);
		
		vw=new VerleihWindow();
		this.getContentPane().add(vw);
		
		uw=new UsersWindow();
		this.getContentPane().add(uw);
		
		ww=new WunschWindow();
		this.getContentPane().add(ww);
		
		this.pack();
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
		this.addWindowListener(this);
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Close");
		Main.ch.disconnect();
		this.dispose();
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	


}
