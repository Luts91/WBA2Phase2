package swing;

import generated.Objekte.Objekt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.*;

import minirestwebservice.XMLMarshaller;

import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smackx.pubsub.PubSubManager;

import smack.JabberSmackAPI;

public class VerleihWindow extends JInternalFrame{
	JLabel verleihen;
	JButton verleihButton;
	
	JLabel lblName=new JLabel("Name");
	JLabel lblVerleiher=new JLabel("Verleiher");
	JLabel lblKategorie=new JLabel("Kategorie");
	JLabel lblBeschreibung=new JLabel("Beschreibung");
	JLabel lblZeitraumstart=new JLabel("Zeitraumstart");
	JLabel lblZeitraumende=new JLabel("Zeitraumende");
	JLabel lblPfand=new JLabel("Pfand");
	
	JTextField txtName=new JTextField();
	JTextField txtVerleiher=new JTextField();
	JTextField txtKategorie=new JTextField();
	JTextField txtBeschreibung=new JTextField();
	JTextField txtZeitraumstart=new JTextField();
	JTextField txtZeitraumende=new JTextField();
	JTextField txtPfand=new JTextField();
	
	public VerleihWindow(){
		this.getContentPane().setLayout(null);
		this.initWindow();
		this.setBounds(520, 10, 240, 310);
		this.setVisible(true);
	}

	private void initWindow() {
		verleihen=new JLabel("Verleihen");
		verleihButton= new JButton("Einstellen");
		
		verleihen.setBounds(10,10,100,20);
		lblName.setBounds(10, 40, 100, 20);
		lblVerleiher.setBounds(10, 70, 100, 20);
		lblKategorie.setBounds(10, 100, 100, 20);
		lblBeschreibung.setBounds(10, 130, 100, 20);
		lblZeitraumstart.setBounds(10, 160, 100, 20);
		lblZeitraumende.setBounds(10, 190, 100, 20);
		lblPfand.setBounds(10, 220, 100, 20);
		
		txtName.setBounds(120, 40, 100, 20);
		txtVerleiher.setBounds(120, 70, 100, 20);
		txtKategorie.setBounds(120, 100, 100, 20);
		txtBeschreibung.setBounds(120, 130, 100, 20);
		txtZeitraumstart.setBounds(120, 160, 100, 20);
		txtZeitraumende.setBounds(120, 190, 100, 20);
		txtPfand.setBounds(120, 220, 100, 20);
	
		verleihButton.setBounds(120,250,100,20);
		
		this.getContentPane().add(verleihen);
		this.getContentPane().add(verleihButton);
		this.getContentPane().add(lblName);
		//this.getContentPane().add(lblVerleiher);
		this.getContentPane().add(lblKategorie);
		this.getContentPane().add(lblBeschreibung);
		this.getContentPane().add(lblZeitraumstart);
		this.getContentPane().add(lblZeitraumende);
		this.getContentPane().add(lblPfand);
		this.getContentPane().add(txtName);
		//this.getContentPane().add(txtVerleiher);
		this.getContentPane().add(txtKategorie);
		this.getContentPane().add(txtBeschreibung);
		this.getContentPane().add(txtZeitraumstart);
		this.getContentPane().add(txtZeitraumende);
		this.getContentPane().add(txtPfand);
		
		this.pack();
		
		verleihButton.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			 XMLMarshaller xmlm = new XMLMarshaller();
			 xmlm.readObjekte();
			   
			 Objekt o=new Objekt();
			 o.setName(txtName.getText());
			 //o.setVerleiher(txtVerleiher.getText());
			 o.setVerleiher(Main.ch.connection.getUser());
			 o.setKategorie(txtKategorie.getText());
			 o.setBeschreibung(txtBeschreibung.getText());
			 o.setZeitraumStart(txtZeitraumstart.getText());
			 o.setZeitraumEnde(txtZeitraumende.getText());
			 o.setPfand(new BigDecimal(txtPfand.getText()));
			 
			 
			 txtName.setText("");
			 txtVerleiher.setText("");
			 txtKategorie.setText("");
			 txtBeschreibung.setText("");
			 txtZeitraumstart.setText("");
			 txtZeitraumende.setText("");
			 txtPfand.setText("");
			   
			 xmlm.objekte.getObjekt().add(o);
			 xmlm.writeObjekte();
			
			 JabberSmackAPI c = new JabberSmackAPI();
			 try {
				c.createNode(Main.ch.connection, txtName.getText());
			} catch (XMPPException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}});
	
	}
	
	
	
	
}
