package swing;

import generated.Objekte.Objekt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import org.jivesoftware.smack.XMPPException;

import smack.JabberSmackAPI;

import minirestwebservice.XMLMarshaller;

public class WunschWindow extends JInternalFrame{
	JLabel lblWunsche = new JLabel("Wünsche");
	
	DefaultListModel<String> listModel = new DefaultListModel<String>(); 
    JList<String> wunsche;
    
	JLabel lblWunsch = new JLabel("Neuer Wunsch");
	JTextField txtWunsch = new JTextField();
	JButton addWunsch = new JButton("Add");
	JButton delWunsch = new JButton("Delete");
    
	public WunschWindow(){
		this.getContentPane().setLayout(null);
		this.initWindow();
		this.setBounds(520, 300, 240, 280);
		this.setVisible(true);
	}

	private void initWindow() {
		wunsche=new JList<String>(listModel);
		
		lblWunsche.setBounds(10,10,100,20);
		wunsche.setBounds(10,30,100,170);
		lblWunsch.setBounds(120,10,100,20);
		txtWunsch.setBounds(120,30,100,20);
		addWunsch.setBounds(120,60,100,20);
		delWunsch.setBounds(10,210,100,20);
		
		this.getContentPane().add(wunsche);
		this.getContentPane().add(lblWunsche);
		this.getContentPane().add(lblWunsch);
		this.getContentPane().add(txtWunsch);
		this.getContentPane().add(addWunsch);
		this.getContentPane().add(delWunsch);
		
		this.pack();
		
	
		loadList();
		
		addWunsch.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent arg0) {
			XMLMarshaller xmlm = new XMLMarshaller();
			xmlm.readBenutzer();
			List<String> l= xmlm.getBenutzer(Main.lw.name.getText()).getBenutzer().get(0).getWunschliste().getWunsch();
			l.add(txtWunsch.getText());
			listModel.addElement(txtWunsch.getText());
			xmlm.writeBenutzer();
			txtWunsch.setText("");
		}});
		
		delWunsch.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent arg0) {
			XMLMarshaller xmlm = new XMLMarshaller();
			xmlm.readBenutzer();
			List<String> l= xmlm.getBenutzer(Main.lw.name.getText()).getBenutzer().get(0).getWunschliste().getWunsch();
			l.remove(wunsche.getSelectedIndex());
			xmlm.writeBenutzer();
			loadList();
		}});
	}
	
	private void loadList(){
		XMLMarshaller xmlm = new XMLMarshaller();
		xmlm.readBenutzer();
		
		listModel.clear();
		
		for (String b : xmlm.getBenutzer(Main.lw.name.getText()).getBenutzer().get(0).getWunschliste().getWunsch()){
			listModel.addElement(b); 
		}
	}
}
