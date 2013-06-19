package swing;

import generated.Benutzerliste.Benutzer;
import generated.Objekte.Objekt;

import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import minirestwebservice.XMLMarshaller;

public class UsersWindow extends JInternalFrame{
	JLabel user=new JLabel("User");
	
	DefaultListModel<String> listModel = new DefaultListModel<String>();
	List<Benutzer> blist=new ArrayList<Benutzer>(); 
	JList users;
	
	JTextArea infos=new JTextArea();
	
	JButton add=new JButton("Add Friend");
	
	public UsersWindow(){
		this.getContentPane().setLayout(null);
	
		this.initWindow();
		this.setBounds(10, 300, 500, 280);
		this.setVisible(true);
	}

	private void initWindow() {
		users=new JList(listModel);
		
		user.setBounds(10,10,100,20);
		users.setBounds(10,30,200,170);
		infos.setBounds(230,10,250,190);
		add.setBounds(110,210,100,20);
		
		this.getContentPane().add(user);
		this.getContentPane().add(users);
		this.getContentPane().add(infos);
		this.getContentPane().add(add);
		
		this.pack();
		
		XMLMarshaller xmlm = new XMLMarshaller();
		xmlm.readBenutzer();
		
		listModel.clear();
		blist.clear();
		
		for (Benutzer b : xmlm.blist){
			listModel.addElement(b.getName()); 
			blist.add(b);
		}
		
		users.addListSelectionListener(new ListSelectionListener(){

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				Benutzer o=blist.get(users.getSelectedIndex());
				
				infos.setText("");
				infos.append("Name: "+o.getName());
				infos.append("\nEmail: "+o.getEmail());
				infos.append("\nStadt: "+o.getWohnort().getPLZ()+" "+o.getWohnort().getStadt());
				infos.append("\nStraﬂe: "+o.getWohnort().getStrasse()+" "+o.getWohnort().getHausNr());
				
			}
			
		});
	}
	
	
}
