package swing;

import org.jivesoftware.smack.XMPPConnection;

public class Main {

	public static smack.ConnectionHandler ch; 
	public static LoginWindow lw;
	public static MainWindow mw;
	public static AccountWindow aw;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MainWindow theAppWindow = new MainWindow();
		lw= new LoginWindow();
		lw.setVisible(true);
		ch=new smack.ConnectionHandler();
	}
	
	public static void Login(){
		lw.dispose();
		
		if (aw!=null)
			aw.dispose();
		
		mw=new MainWindow();
		mw.setVisible(true);
		
	}
	
	public static void newAccount(){
		lw.setVisible(false);
		
		aw=new AccountWindow();
		aw.setVisible(true);
	}

}
