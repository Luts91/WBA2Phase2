package swing;

import generated.Benutzerliste.Benutzer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import minirestwebservice.XMLMarshaller;

import org.jivesoftware.smack.XMPPException;

public class AccountWindow extends JFrame{
	JLabel lblName=new JLabel("Name: ");
	JLabel lblPw=new JLabel("Passwort: ");
	JLabel lblEmail=new JLabel("Email: ");
	JLabel lblStadt=new JLabel("Stadt: ");
	JLabel lblPLZ=new JLabel("PLZ: ");
	JLabel lblStrasse=new JLabel("Stasse: ");
	JLabel lblHausNr=new JLabel("HausNr: ");
	
	JTextField txtName=new JTextField();
	JTextField txtPw=new JTextField();
	JTextField txtEmail=new JTextField();
	JTextField txtStadt=new JTextField();
	JTextField txtPLZ=new JTextField();
	JTextField txtStrasse=new JTextField();
	JTextField txtHausNr=new JTextField();
	
	JButton erstellen=new JButton("Anmelden");
	
	public AccountWindow(){
		this.getContentPane().setLayout(null);

		this.initWindow();
		this.setBounds(640, 480, 250, 290);
	}

	private void initWindow() {
		lblName.setBounds(10, 10, 100, 20);
		lblPw.setBounds(10, 40, 100, 20);
		lblEmail.setBounds(10,70,100,20);
		lblStadt.setBounds(10, 100, 100, 20);
		lblPLZ.setBounds(10, 130, 100, 20);
		lblStrasse.setBounds(10, 160, 100, 20);
		lblHausNr.setBounds(10, 190, 100, 20);

		txtName.setBounds(120, 10, 100, 20);
		txtPw.setBounds(120, 40, 100, 20);
		txtEmail.setBounds(120,70,100,20);
		txtStadt.setBounds(120, 100, 100, 20);
		txtPLZ.setBounds(120, 130, 100, 20);
		txtStrasse.setBounds(120, 160, 100, 20);
		txtHausNr.setBounds(120, 190, 100, 20);
		
		erstellen.setBounds(120,220,100,20);
		
		this.getContentPane().add(lblName);
		this.getContentPane().add(lblPw);
		this.getContentPane().add(lblEmail);
		this.getContentPane().add(lblStadt);
		this.getContentPane().add(lblPLZ);
		this.getContentPane().add(lblStrasse);
		this.getContentPane().add(lblHausNr);
		this.getContentPane().add(txtName);
		this.getContentPane().add(txtPw);
		this.getContentPane().add(txtEmail);
		this.getContentPane().add(txtStadt);
		this.getContentPane().add(txtPLZ);
		this.getContentPane().add(txtStrasse);
		this.getContentPane().add(txtHausNr);
		this.getContentPane().add(erstellen);
		
		this.pack();
		
		erstellen.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent arg0) {
			try {
				Main.ch.connect();
				
				Main.ch.connection.getAccountManager().createAccount(txtName.getText(), txtPw.getText());
				Main.ch.login(txtName.getText(), txtPw.getText());
				
				XMLMarshaller xmlm=new XMLMarshaller();
				   xmlm.readBenutzer();
				   
				   Benutzer b=new Benutzer();
				   b.setName(txtName.getText());
				   b.setPasswort(txtPw.getText());
				   b.setEmail(txtEmail.getText());
				   
				   Benutzer.Wohnort w=new Benutzer.Wohnort();
				   w.setStadt(txtStadt.getText());
				   w.setPLZ(txtPLZ.getText());
				   w.setStrasse(txtStrasse.getText());
				   w.setHausNr(txtHausNr.getText());
				   
				   b.setWohnort(w);
				   b.setBild("bild1.png");
				   
				   xmlm.benutzerliste.getBenutzer().add(b);
				   xmlm.writeBenutzer();
				   

					System.out.println(txtName.getText()+" creation+login success");
					Main.Login();
				
			} catch (XMPPException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}});
	}
	
	
	
}
