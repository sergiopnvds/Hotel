package edu;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;

/**
 * This class contains is in charge of checking out the rooms which are occupied with a guest in the hotel.
 * 
 * @author: Sergio Penavades Suarez 
 * @version: 1
 */

public class CheckOut {

	JFrame checkOut;
	private int roomsFreeOld;
	
	/**
	 * The main method will execute the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckOut window = new CheckOut();
					window.checkOut.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * The constructor check out will initialize the application.
	 */
	public CheckOut() {
			initialize();
	}

	/**
	 * The method initialize will create the layout of the application and is in charge of all the
	 * implementation of obtaining the rooms which are occupied and making them vacant once the button ok is
	 * pressed. 
	 */
	private void initialize() {
		checkOut = new JFrame("Check Out");
		checkOut.setResizable(false);
		
		checkOut.setBounds(100, 100, 258, 131);
		checkOut.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		checkOut.getContentPane().setLayout(null);
		
		JButton checkOutOk = new JButton("OK");
		checkOutOk.setBounds(30, 47, 89, 23);
		checkOut.getContentPane().add(checkOutOk);
		
		JButton checkOutCancel = new JButton("Cancel");
		checkOutCancel.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				checkOut.dispose();
			}	
		});
		checkOutCancel.setBounds(129, 47, 89, 23);
		checkOut.getContentPane().add(checkOutCancel);
		
		JLabel checkOutString = new JLabel("Room to Check Out: ");
		checkOutString.setBounds(10, 11, 120, 24);
		checkOut.getContentPane().add(checkOutString);
		
		final JComboBox boxrooms = new JComboBox();
		boxrooms.setBounds(125, 11, 110, 24);
		for(BasicHotelRooms s:HotelRegistry.getList()){
    		if (!(s.isVacant())){
    			boxrooms.addItem(s.getRoomnumber().toString());
    		}
    	}
		checkOut.getContentPane().add(boxrooms);
		
		//We will implement a switch method for the clerk to obtain only the rooms which are occupied in the
		//combo list to check out, and once the room has been checked out, the main display will show the room
		// as vacant.
		checkOutOk.addActionListener(new ActionListener(){
	   		public void actionPerformed(ActionEvent ae){
	    				
	   			String RoomNumber=(String) boxrooms.getSelectedItem();
	   			for(BasicHotelRooms s:HotelRegistry.getList()){
	   				if (RoomNumber== s.getRoomnumber()){
	   					switch (RoomNumber) {
	        	        case "100":	
	        	        	s.vacant=true;
	        	        	HotelRegistry.setGuest100("Vacant");	
	        	        	roomsFreeOld = (HotelRegistry.getnumKingRoomsFree()+1);
	        	        	HotelRegistry.setnumKingRoomsFree(roomsFreeOld);
	        	        	HotelRegistry.numKFree(Integer.toString(roomsFreeOld));
		        	       	checkOut.dispose();
	        	         	break;
	        	        case "101":	
	        	        	s.vacant=true;
		        	       	HotelRegistry.setGuest101("Vacant");	
		        	    	roomsFreeOld = HotelRegistry.getnumTwoDoubleFree()+1;
	        	        	HotelRegistry.setnumTwoDoubleRoomsFree(roomsFreeOld); 
	        	        	HotelRegistry.num2DBFree(Integer.toString(roomsFreeOld));
		        	       	checkOut.dispose();
		        	       	break;		        	       		
	        	        case "102":	
	        	        	s.vacant=true;
		        	       	HotelRegistry.setGuest102("Vacant");	
		        	       	roomsFreeOld = (HotelRegistry.getnumKingRoomsFree()+1);
	        	        	HotelRegistry.setnumKingRoomsFree(roomsFreeOld);
	        	        	HotelRegistry.numKFree(Integer.toString(roomsFreeOld));
		        	       	checkOut.dispose();
	        	         	break;
	        	        case "103":	
	        	        	s.vacant=true;
		        	       	HotelRegistry.setGuest103("Vacant");	
		        	       	roomsFreeOld = HotelRegistry.getnumTwoDoublewCotFree()+1;
	        	        	HotelRegistry.setnumTwoDoubleRwCotFree(roomsFreeOld); 	
	        	        	HotelRegistry.num2DBWCFree(Integer.toString(roomsFreeOld));
		        	       	checkOut.dispose();
		        	    	break;
	        	        case "104":	
	        	        	s.vacant=true;
		        	       	HotelRegistry.setGuest104("Vacant");	
		        	       	roomsFreeOld = HotelRegistry.getnumQueenRoomsFree()+1;
	        	        	HotelRegistry.setnumQueenRoomsFree(roomsFreeOld); 	
	        	        	HotelRegistry.numQFree(Integer.toString(roomsFreeOld));
		        	       	checkOut.dispose();
		        	    	break;
	        	        case "105":	
	        	        	s.vacant=true;
		        	       	HotelRegistry.setGuest105("Vacant");		
		        	       	roomsFreeOld = (HotelRegistry.getnumKingRoomsFree()+1);
	        	        	HotelRegistry.setnumKingRoomsFree(roomsFreeOld);
	        	        	HotelRegistry.numKFree(Integer.toString(roomsFreeOld));
		        	       	checkOut.dispose();
	        	         	break;
	        	        case "106":	
	        	        	s.vacant=true;
		        	       	HotelRegistry.setGuest106("Vacant");	
		        	    	roomsFreeOld = HotelRegistry.getnumQueenRoomsFree()+1;
	        	        	HotelRegistry.setnumQueenRoomsFree(roomsFreeOld); 	
	        	        	HotelRegistry.numQFree(Integer.toString(roomsFreeOld));
		        	       	checkOut.dispose();
		        	    	break;
	        	        case "107":	
	        	        	s.vacant=true;
		        	       	HotelRegistry.setGuest107("Vacant");	
		        	       	roomsFreeOld = HotelRegistry.getnumTwoDoubleFree()+1;
	        	        	HotelRegistry.setnumTwoDoubleRoomsFree(roomsFreeOld); 
	        	        	HotelRegistry.num2DBFree(Integer.toString(roomsFreeOld));
		        	       	checkOut.dispose();
		        	    	break;
	        	        case "108":	
	        	        	s.vacant=true;
		        	       	HotelRegistry.setGuest108("Vacant");	
		        	    	roomsFreeOld = HotelRegistry.getnumQueenRoomsFree()+1;
	        	        	HotelRegistry.setnumQueenRoomsFree(roomsFreeOld); 	
	        	        	HotelRegistry.numQFree(Integer.toString(roomsFreeOld));
		        	       	checkOut.dispose();
		        	    	break;
	        	        case "109":	
	        	        	s.vacant=true;
		        	       	HotelRegistry.setGuest109("Vacant");	
		        	       	roomsFreeOld = HotelRegistry.getnumTwoDoublewCotFree()+1;
	        	        	HotelRegistry.setnumTwoDoubleRwCotFree(roomsFreeOld); 	
	        	        	HotelRegistry.num2DBWCFree(Integer.toString(roomsFreeOld));
		        	       	checkOut.dispose();
		        	    	break;
	        	        case "110":	
	        	        	s.vacant=true;
		        	       	HotelRegistry.setGuest110("Vacant");	
		        	       	roomsFreeOld = HotelRegistry.getnumTwoDoubleFree()+1;
	        	        	HotelRegistry.setnumTwoDoubleRoomsFree(roomsFreeOld); 
	        	        	HotelRegistry.num2DBFree(Integer.toString(roomsFreeOld));
		        	       	checkOut.dispose();
		        	    	break;
	        	        case "111":	
	        	        	s.vacant=true;
	        	        	HotelRegistry.setGuest111("Vacant");	
	        	        	roomsFreeOld = HotelRegistry.getnumTwoDoubleFree()+1;
	        	        	HotelRegistry.setnumTwoDoubleRoomsFree(roomsFreeOld); 
	        	        	HotelRegistry.num2DBFree(Integer.toString(roomsFreeOld));
		        	       	checkOut.dispose();
		        	    	break;
	        	        case "112":	
	        	        	s.vacant=true;
	        	        	HotelRegistry.setGuest112("Vacant");	
	        	        	roomsFreeOld = HotelRegistry.getnumTwoDoubleFree()+1;
	        	        	HotelRegistry.setnumTwoDoubleRoomsFree(roomsFreeOld); 
	        	        	HotelRegistry.num2DBFree(Integer.toString(roomsFreeOld));
		        	       	checkOut.dispose();
		        	    	break;
	        	        case "113":	
	        	        	s.vacant=true;
		        	       	HotelRegistry.setGuest113("Vacant");	
		        	       	roomsFreeOld = HotelRegistry.getnumTwoDoubleFree()+1;
	        	        	HotelRegistry.setnumTwoDoubleRoomsFree(roomsFreeOld); 
	        	        	HotelRegistry.num2DBFree(Integer.toString(roomsFreeOld));
		        	       	checkOut.dispose();
		        	    	break;
	        	        case "114":	
	        	        	s.vacant=true;
		        	       	HotelRegistry.setGuest114("Vacant");	
		        	       	roomsFreeOld = (HotelRegistry.getnumKingRoomsFree()+1);
	        	        	HotelRegistry.setnumKingRoomsFree(roomsFreeOld);
	        	        	HotelRegistry.numKFree(Integer.toString(roomsFreeOld));
		        	       	checkOut.dispose();
	        	         	break;
	        	       	 }	
	   				}
	   			}
	   		}
		}); 		
	}   		
}
