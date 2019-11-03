package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addName = new JButton("Add Guest");
	JButton viewNames = new JButton("View Guests");
	ArrayList<String> guests = new ArrayList<String>();
	
	public static void main(String[] args) {
		new GuestBook().run();
	}
	
	void run() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		panel.add(viewNames);
		panel.add(addName);
		frame.add(panel);
		frame.pack();
		
		addName.addActionListener(this);
		viewNames.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String newGuest = "";
		
		if(arg0.getSource() == addName) {
			
			newGuest = JOptionPane.showInputDialog("Enter new guest name.");
			guests.add(newGuest);
			
		}
		
		if(arg0.getSource() == viewNames) {
		
			for(int i = 0; i < guests.size(); i++) {
			JOptionPane.showMessageDialog(null, "Guest #" + i +" is " + guests.get(i));
			}
		}
		
	}
	
}
