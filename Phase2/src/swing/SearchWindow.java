package swing;

import generated.Objekte.Objekt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.jivesoftware.smack.XMPPException;

import smack.JabberSmackAPI;

import minirestwebservice.XMLMarshaller;

public class SearchWindow extends JInternalFrame {

	JLabel searchLabel;
	JTextField searchText;
	JButton searchButton;
	
	DefaultListModel<String> listModel = new DefaultListModel<String>();
	List<Objekt> olist=new ArrayList<Objekt>(); 
    JList result;
    
    JTextArea current;
    
    JButton reservieren;
	
	public SearchWindow(){
		this.getContentPane().setLayout(null);

		this.initWindow();
		this.setBounds(10, 10, 500, 280);
		this.setVisible(true);
	}

	private void initWindow() {
		searchLabel=new JLabel("Suche");
		searchText=new JTextField();
		searchButton=new JButton("Suchen");
		result=new JList(listModel);
		current=new JTextArea();
		reservieren=new JButton("Reserve");
		
		searchLabel.setBounds(10, 10, 100, 20);
		searchText.setBounds(110, 10, 100, 20);
		searchButton.setBounds(110,40,100,20);
		result.setBounds(10, 70, 200, 140);
		current.setBounds(230, 10, 250, 200);
		reservieren.setBounds(110,220,100,20);
		
		this.getContentPane().add(searchLabel);
		this.getContentPane().add(searchText);
		this.getContentPane().add(searchButton);
		this.getContentPane().add(result);
		this.getContentPane().add(current);
		this.getContentPane().add(reservieren);
		
		this.pack();
		
		searchButton.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent arg0) {
			XMLMarshaller xmlm = new XMLMarshaller();
			xmlm.readObjekte();
			String name=searchText.getText();
			
			listModel.clear();
			olist.clear();
			
			for (Objekt b : xmlm.olist){
				if (b.getName().equals(name)){
					listModel.addElement(b.getName()); 
					olist.add(b);
				}
			}
		}});
		
		result.addListSelectionListener(new ListSelectionListener(){

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				Objekt o=olist.get(result.getSelectedIndex());
				
				current.setText("");
				current.append("Name: "+o.getName());
				current.append("\nKategorie: "+o.getKategorie());
				current.append("\nBeschreibung: "+o.getBeschreibung());
				current.append("\nPfand: "+o.getPfand());
				current.append("\nVerleiher:" + o.getVerleiher());
			}
			
		});
		
		reservieren.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent arg0) {
			JabberSmackAPI c = new JabberSmackAPI();
			try {
				c.createNode(Main.ch.connection, current.getName());
				c.subscribe(Main.ch.connection, current.getName());
			} catch (XMPPException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}});
	}
	
	
	
	
}
