package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.StringWriter;

import javax.swing.*;
import javax.ws.rs.QueryParam;
import javax.xml.bind.JAXBException;

import minirestwebservice.XMLMarshaller;

import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smackx.pubsub.PubSubManager;

public class LoginWindow extends JFrame {
	JTextField name;
	JTextField pw;
	
	JLabel lblName;
	JLabel lblPw;
	
	JButton login;
	
	public LoginWindow(){
		this.getContentPane().setLayout(null);
		this.initWindow();
		this.setBounds(640, 480, 240, 140);
	}

	private void initWindow() {
		// TODO Auto-generated method stub
		name=new JTextField();
		pw=new JTextField();
		lblName=new JLabel("Name:");
		lblPw=new JLabel("Password: ");
		login=new JButton("Login");
		
		lblName.setBounds(10, 10, 100, 20);
		lblPw.setBounds(10,40, 100, 20);
		
		name.setBounds(110,10,100,20);
		pw.setBounds(110,40,100,20);
		
		login.setBounds(110, 70, 100, 20);
		
		this.getContentPane().add(lblName);
		this.getContentPane().add(lblPw);
		this.getContentPane().add(name);
		this.getContentPane().add(pw);
		this.getContentPane().add(login);
		this.pack();
		
		login.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				Main.ch.login(name.getText(), pw.getText());
				System.out.println(name.getText()+" login success");
				
				PubSubManager mgr = new PubSubManager(Main.ch.connection, "pubsub." + Main.ch.connection.getServiceName());
				System.out.println("Subscribtions:");
				for (int i=0; i<mgr.getSubscriptions().size();i++)
					System.out.println(mgr.getSubscriptions().get(i).getNode());		  
				
				Main.Login();
			} catch (XMPPException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}});
	}
}
