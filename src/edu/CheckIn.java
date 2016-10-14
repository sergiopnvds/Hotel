package edu;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The class Check In will enable the clark to register his clients into the hotel.
 * 
 * @author: Sergio Penavades Suarez 
 * @version: 1
 */

public class CheckIn{

	public JFrame checkIn;
	private JTextField fname;
	private JTextField lname;
	private JTextField address;
	private JTextField city;
	private JTextField state;
	private JTextField zipcode;
	private String RoomNumber;
	String[] allrooms = {"100","101","102","103","104","105","106","107","108","109","110","111","112","113","114"} ;
	String[] numchild = { "0", "1","2","3","4" } ;
	String[] numadults = { "1","2","3","4","5" } ;
	String[] typeroom = { "King", "One Queen","Two Double Beds","Two Double Beds Plus Cot" } ;
	boolean isRadio1, isRadio2, isRadio3, isRadio4 = false;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckIn window = new CheckIn();
					window.checkIn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * The method CheckIn is the constructor and will create the application.
	 */
	public CheckIn() {
	    	initialize();
	}

	/**
	 * This method will initialize the contents of the checkIn.
	 */
	public void initialize() {
		checkIn = new JFrame("Check In");
		checkIn.setBounds(100, 100, 1024, 280);
		checkIn.setResizable(false);
		checkIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		checkIn.getContentPane().setLayout(null);	
		
		JLabel firstname = new JLabel("First Name: ");
		firstname.setBounds(5, 5, 75, 20);
		checkIn.getContentPane().add(firstname);
		
		JLabel lastname = new JLabel("Last Name: ");
		lastname.setBounds(375, 5, 75, 20);
		checkIn.getContentPane().add(lastname);
		
		JLabel gaddress = new JLabel("Address: ");
		gaddress.setBounds(5, 40, 75, 20);
		checkIn.getContentPane().add(gaddress);
		
		JLabel guestcity = new JLabel("City: ");
		guestcity.setBounds(5, 75, 75, 20);
		checkIn.getContentPane().add(guestcity);
		
		JLabel gueststate = new JLabel("State: ");
		gueststate.setBounds(375, 75, 40, 20);
		checkIn.getContentPane().add(gueststate);
		
		JLabel zipCode = new JLabel("Zip Code: ");
		zipCode.setBounds(675, 75, 55, 20);
		checkIn.getContentPane().add(zipCode);
		
		JLabel numAdults = new JLabel("Number of Adults: ");
		numAdults.setBounds(5, 110, 110, 20);
		checkIn.getContentPane().add(numAdults);
		
		JLabel numChildren = new JLabel("Number of Children: ");
		numChildren.setBounds(615, 110, 130, 20);
		checkIn.getContentPane().add(numChildren);
		
		JLabel roomType = new JLabel("Room Type ");
		roomType.setBounds(35, 145, 130, 20);
		checkIn.getContentPane().add(roomType);
		
		JLabel room = new JLabel("Room: ");
		room.setBounds(5, 215, 130, 20);
		checkIn.getContentPane().add(room);
			
		fname = new JTextField();
		fname.setColumns(10);
		fname.setBounds(125, 5, 235, 20);
		checkIn.getContentPane().add(fname);
				
		lname = new JTextField();
		lname.setColumns(10);
		lname.setBounds(500, 5, 500, 20);
		checkIn.getContentPane().add(lname);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(125, 40, 875, 20);
		checkIn.getContentPane().add(address);
		
		city = new JTextField();
		city.setColumns(10);
		city.setBounds(125, 75, 230, 20);
		checkIn.getContentPane().add(city);
		
		state = new JTextField();
		state.setColumns(10);
		state.setBounds(415, 75, 230, 20);
		checkIn.getContentPane().add(state);		
		
		zipcode = new JTextField();
		zipcode.setColumns(10);
		zipcode.setBounds(750, 75, 250, 20);
		checkIn.getContentPane().add(zipcode);
		
		final JComboBox numberAdults = new JComboBox(numadults);
		numberAdults.setBounds(125, 110, 225, 20);
		checkIn.getContentPane().add(numberAdults);
		
		final JComboBox numChild = new JComboBox(numchild);
		numChild.setBounds(750, 110, 250, 20);
		checkIn.getContentPane().add(numChild);
		
		JPanel panelroomtype = new JPanel();
		panelroomtype.setBounds(5, 147, 995, 50);
		checkIn.getContentPane().add(panelroomtype);
		panelroomtype.setLayout(null);
       	panelroomtype.setBorder(new LineBorder(Color.BLACK, 1, true));
       	
		final JRadioButton roomKing = new JRadioButton( "King" ) ;
		roomKing.setBounds(10, 20, 75, 24);
		panelroomtype.add(roomKing);
		
		final JRadioButton roomQueen = new JRadioButton( "One Queen" ) ;
		roomQueen.setBounds(210, 20, 110, 24);
		panelroomtype.add(roomQueen);
		
		final JRadioButton room2DB = new JRadioButton( "Two Double Beds" ) ;
		room2DB.setBounds(450, 20, 150, 24);
		panelroomtype.add(room2DB);
		
		final JRadioButton room2DBwCot = new JRadioButton( "Two Doble Beds with Cot" ) ;
		room2DBwCot.setBounds(700, 20, 200, 24);
		panelroomtype.add(room2DBwCot);
		
		final JComboBox boxrooms = new JComboBox(allrooms);
		boxrooms.setBounds(125, 215, 225, 20);
		boxrooms.getModel().setSelectedItem("Select the hotel room number");
		checkIn.getContentPane().add(boxrooms);
		
		ActionListener sliceActionListener = new ActionListener() {
		      public void actionPerformed(ActionEvent actionEvent) {
		    	  String numChildvar = numChild.getSelectedItem().toString();
		        String numAdultsvar = numberAdults.getSelectedItem().toString();
		        	
		        if(roomQueen.isSelected()==true){
		        	boxrooms.removeAllItems();
		        	boxrooms.getModel().setSelectedItem("Select the hotel room number");
		    		
		        	for(BasicHotelRooms s:HotelRegistry.getList()){
		        		if (s.getRoomtype()==RoomType.ONE_QUEEN_BED){
		        			if(s.isVacant()){
		        				if ((Integer.parseInt(numChildvar) + Integer.parseInt(numAdultsvar)-1)<s.getMaxoccupancy()){
		        					boxrooms.addItem(s.getRoomnumber().toString());
		        				}
		        			}
		        		}
		        	}  	
		        }
		        else if(roomKing.isSelected()==true){
	
		        	boxrooms.removeAllItems();
		        	boxrooms.getModel().setSelectedItem("Select the hotel room number");
		    		
		        	for(BasicHotelRooms s:HotelRegistry.getList()){
		        		if (s.getRoomtype()==RoomType.ONE_KING_BED){
		        			if(s.isVacant()){
		        				if ((Integer.parseInt(numChildvar) + Integer.parseInt(numAdultsvar)-1)<s.getMaxoccupancy()){
		        					boxrooms.addItem(s.getRoomnumber().toString());
		        				}
		        			}
		        		}
		        	}  	
		        }
		        else if(room2DB.isSelected()==true){

		        	boxrooms.removeAllItems();
		        	boxrooms.getModel().setSelectedItem("Select the hotel room number");
		    		
		        	for(BasicHotelRooms s:HotelRegistry.getList()){
		        		if (s.getRoomtype()==RoomType.TWO_DOUBLE_BEDS){
		        			if(s.isVacant()){
		        				if (((Integer.parseInt(numChildvar) + Integer.parseInt(numAdultsvar))-1)<s.getMaxoccupancy()){
		        					boxrooms.addItem(s.getRoomnumber().toString());
		        				}
		        			}
		        		}	
		        	}
		        }
		        else if(room2DBwCot.isSelected()==true){
		        
		        	boxrooms.removeAllItems();
		        	boxrooms.getModel().setSelectedItem("Select the hotel room number");
		    		
		        	for(BasicHotelRooms s:HotelRegistry.getList()){
		        		if (s.getRoomtype()==RoomType.TWO_DOUBLE_BEDS_AND_ONE_COT){
		        			if(s.isVacant()){
		        				if ((Integer.parseInt(numChildvar) + Integer.parseInt(numAdultsvar)-1)<s.getMaxoccupancy()){
		        					boxrooms.addItem(s.getRoomnumber().toString());
		        				}
		        			}
		        		}
		        	} 	   	
		        }	        
		      }
		    };
		
		ButtonGroup RoomTypegroup= new ButtonGroup();
		RoomTypegroup.add(roomKing);
		RoomTypegroup.add(roomQueen);
		RoomTypegroup.add(room2DB);
		RoomTypegroup.add(room2DBwCot);
			
		roomKing.addActionListener(sliceActionListener);
		roomQueen.addActionListener(sliceActionListener);
		room2DB.addActionListener(sliceActionListener);
		room2DBwCot.addActionListener(sliceActionListener);
		numChild.addActionListener(sliceActionListener);
		numberAdults.addActionListener(sliceActionListener);
		
		JButton checkInRegister = new JButton("Register");
		checkInRegister.addActionListener(new ActionListener(){
	   		public void actionPerformed(ActionEvent ae){
	   			String guest_Fname = fname.getText();
	   			String guest_Lname = lname.getText();
	   			String guest_Address = address.getText();
	   			String guest_City = city.getText();
	   			String guest_State = state.getText();
	   			String guest_Zipcode = zipcode.getText();
	   			
	   			if(guest_Fname.equals("")||guest_Fname.equals(null)||guest_Lname.equals("")||guest_Lname.equals(null)
	   					||guest_Address.equals("")||guest_Address.equals(null)||guest_City.equals("")||guest_City.equals(null)
	   					||guest_State.equals("")||guest_State.equals(null)||guest_Zipcode.equals("")||guest_Zipcode.equals(null) || (boxrooms.getSelectedIndex()==-1||boxrooms.getSelectedItem()==("Select the hotel room number"))
	   					|| ( !roomKing.isSelected() && !roomQueen.isSelected() && !room2DB.isSelected() && !room2DBwCot.isSelected())||(String) boxrooms.getSelectedItem()==null){
	   			// 
	   					JOptionPane.showMessageDialog(null, "Validation Failure!", 
	   						"Empty Fields", JOptionPane.PLAIN_MESSAGE);		   					
	   			}			
	   			else{
	   				RoomNumber=(String) boxrooms.getSelectedItem();
	   				
	   				for(BasicHotelRooms s:HotelRegistry.getList()){
	   					
	   					if (s.isVacant() && s.getRoomtype()==RoomType.ONE_KING_BED && RoomNumber== s.getRoomnumber()){		        					        				
		        			switch (RoomNumber) {
			        	        case "100":	
			        	        	if (HotelRegistry.getnumKingRoomsFree()>0){
			        	        		s.vacant=false;
			        	        		HotelRegistry.setGuest100(guest_Fname+ " " + guest_Lname);	
			        	        		changeVancantKing();
			        	        		break;
			        	        	}
			        	        case "102":	
			        	        	if (HotelRegistry.getnumKingRoomsFree()>0){
			        	        		s.vacant=false;
			        	        		HotelRegistry.setGuest102(guest_Fname+ " " + guest_Lname);	
			        	        		changeVancantKing();
			        	        		break;
			        	        	}
			        	        case "105":	
			        	        	if (HotelRegistry.getnumKingRoomsFree()>0){
			        	        		s.vacant=false;
			        	        		HotelRegistry.setGuest105(guest_Fname+ " " + guest_Lname);	
			        	        		changeVancantKing();
			        	        		break;
			        	        	}
			        	        case "114":	
			        	        	if (HotelRegistry.getnumKingRoomsFree()>0){
			        	        		s.vacant=false;
			        	        		HotelRegistry.setGuest114(guest_Fname+ " " + guest_Lname);	
			        	        		changeVancantKing();
			        	        		break;
			        	        	}
		        			} 
				        }
	   					
	   					if (s.isVacant() && s.getRoomtype()==RoomType.ONE_QUEEN_BED && RoomNumber== s.getRoomnumber()){				        				
		        			switch (RoomNumber) {
			        	        case "104":	
			        	        	if (HotelRegistry.getnumQueenRoomsFree()>0){
			        	        		s.vacant=false;
			        	        		HotelRegistry.setGuest104(guest_Fname+ " " + guest_Lname);
			        	        		changeVancantQueen();
			        	        		break;
			        	        	} 	
			        	        case "106":	
			        	        	if (HotelRegistry.getnumQueenRoomsFree()>0){
				        	        	s.vacant=false;
					        	       	HotelRegistry.setGuest106(guest_Fname+ " " + guest_Lname);
					        	       	changeVancantQueen();
					        	       	break;
					        	    }
			        	        case "108":	
			        	        	if (HotelRegistry.getnumQueenRoomsFree()>0){
				        	        	s.vacant=false;
					        	       	HotelRegistry.setGuest108(guest_Fname+ " " + guest_Lname);
					        	       	changeVancantQueen();
					        	       	break;
					        	    }        	        
			        	    } 			        				        				     		
				        }
	   					
	   					if (s.isVacant() && s.getRoomtype()==RoomType.TWO_DOUBLE_BEDS && RoomNumber== s.getRoomnumber()){	        					        				
		        			switch (RoomNumber) {
			        	        case "101":	
			        	        	if (HotelRegistry.getnumTwoDoubleFree()>0){
			        	        		s.vacant=false;
			        	        		HotelRegistry.setGuest101(guest_Fname+ " " + guest_Lname);
			        	        		changeVancantTwoDoubleBeds();
			        	        		break;
				        	       	}
			        	        case "107":	
			        	        	if (HotelRegistry.getnumTwoDoubleFree()>0){
			        	        		s.vacant=false;
			        	        		HotelRegistry.setGuest107(guest_Fname+ " " + guest_Lname);	
			        	        		changeVancantTwoDoubleBeds();
			        	        		break;
			        	        	}
			        	        case "110":	
			        	        	if (HotelRegistry.getnumTwoDoubleFree()>0){
			        	        		s.vacant=false;
			        	        		HotelRegistry.setGuest110(guest_Fname+ " " + guest_Lname);	
			        	        		changeVancantTwoDoubleBeds();
			        	        		break;
			        	        	}
			        	        case "111":	
			        	        	if (HotelRegistry.getnumTwoDoubleFree()>0){
			        	        		s.vacant=false;
			        	        		HotelRegistry.setGuest111(guest_Fname+ " " + guest_Lname);	
			        	        		changeVancantTwoDoubleBeds();
			        	        		break;
			        	        	}
			        	        case "112":	
			        	        	if (HotelRegistry.getnumTwoDoubleFree()>0){
			        	        		s.vacant=false;
			        	        		HotelRegistry.setGuest112(guest_Fname+ " " + guest_Lname);	
			        	        		changeVancantTwoDoubleBeds();
			        	        		break;
			        	        	}
			        	        case "113":	
			        	        	if (HotelRegistry.getnumTwoDoubleFree()>0){
			        	        		s.vacant=false;
			        	        		HotelRegistry.setGuest113(guest_Fname+ " " + guest_Lname);		
			        	        		changeVancantTwoDoubleBeds();
			        	        		break;
			        	        	}
			        	    }			   
				        }	
	   					
	   					if (s.isVacant() && s.getRoomtype()==RoomType.TWO_DOUBLE_BEDS_AND_ONE_COT && RoomNumber== s.getRoomnumber()){			        					        				
		        			switch (RoomNumber) {
			        	        case "103":	
			        	        	if (HotelRegistry.getnumTwoDoublewCotFree()>0){
			        	        		s.vacant=false;
			        	        		HotelRegistry.setGuest103(guest_Fname+ " " + guest_Lname);	
			        	        		changeVancantTwoDoubleBedsWCot();
			        	        		break;
				        	       	}
			        	        case "109":	
			        	        	if (HotelRegistry.getnumTwoDoublewCotFree()>0){
			        	        		s.vacant=false;
			        	        		HotelRegistry.setGuest109(guest_Fname+ " " + guest_Lname);	
			        	        		changeVancantTwoDoubleBedsWCot();
			        	        		break;
			        	        	}		        	       
		        			} 
				        }
	   				}	   
	   			}
   			}
		});
		
		checkInRegister.setBounds(400, 215, 300, 20);
		checkIn.getContentPane().add(checkInRegister);
		
		JButton checkInCancel = new JButton("Cancel");
		checkInCancel.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				checkIn.dispose();
			}	
		});
		
		checkInCancel.setBounds(700, 215, 300, 20);
		checkIn.getContentPane().add(checkInCancel);	
	}
	
	private void changeVancantQueen() {
		int numQFree= HotelRegistry.getnumQueenRoomsFree()-1;
      	 HotelRegistry.numQFree(Integer.toString(numQFree));
      	 HotelRegistry.setnumQueenRoomsFree(numQFree);
      	 checkIn.dispose();
      	RoomNumber="0";	
	}
	
	private void changeVancantKing() {
	 	 int numKFree= HotelRegistry.getnumKingRoomsFree()-1;
		 HotelRegistry.numKFree(Integer.toString(numKFree));
       	 HotelRegistry.setnumKingRoomsFree(numKFree);
       	 checkIn.dispose();
      	RoomNumber="0";	
	}
	
	private void changeVancantTwoDoubleBeds() {
		 int numTDFree= HotelRegistry.getnumTwoDoubleFree()-1;
       	 HotelRegistry.num2DBFree(Integer.toString(numTDFree));
       	 HotelRegistry.setnumTwoDoubleRoomsFree(numTDFree);
       	 checkIn.dispose();
      	RoomNumber="0";	
	}
	
	private void changeVancantTwoDoubleBedsWCot() {
		int numTDWCFree= HotelRegistry.getnumTwoDoublewCotFree()-1;
      	 HotelRegistry.num2DBWCFree(Integer.toString(numTDWCFree));
      	 HotelRegistry.setnumTwoDoubleRwCotFree(numTDWCFree);
      	 checkIn.dispose();
      	RoomNumber="0";	
	}
}
