package edu;
import javax.swing.border.LineBorder;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 * This class contains the functioning of the Hotel Registry in order to check in and check out guests 
 * in the hotel.
 * 
 * @author: Sergio Penavades Suarez 
 * @version: 1
 */

public class HotelRegistry{

	public JFrame frame;
	private static JTextField guest0,guest1,guest2,guest3,guest4,guest5,guest6,guest7,guest8,guest9,guest10;
	private static JTextField guest11,guest12,guest13,guest14;
	private static JTextField oneKingNumber,oneQueenNumber,twoDoubleBedsNumber,twoDoubleBedsWNumber;
	static private List<BasicHotelRooms> hotelRegistry;
	private static int numKingRFree;
	private static int numQueenRFree;
	private static int numTwoDoubleRFree;
	private static int numTwoDoubleRwCotFree;
	/**
	 * The main method will launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelRegistry window = new HotelRegistry();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * The method HotelRegistry is the constructor method which creates the layout of the main frame.
	 */
	public HotelRegistry() {
		numKingRFree=4;
		numQueenRFree=3;
		numTwoDoubleRFree=6;
		numTwoDoubleRwCotFree=2;
		initialize();
	}
	
	/**
	 * The following 4 methods obtain the number of rooms available depending on their type: King, Queen, 
	 * 2 Double rooms or 2 double rooms with a cot.
	 * @return number of rooms free depending on the type.
	 */
	public static int getnumKingRoomsFree(){
		return numKingRFree;
	}
	
	public static int getnumQueenRoomsFree(){
		return numQueenRFree;
	}
	
	public static int getnumTwoDoubleFree(){
		return numTwoDoubleRFree;
	}
	
	public static int getnumTwoDoublewCotFree(){
		return numTwoDoubleRwCotFree;
	}
	
	/**
	 * This 4 following methods are the in charge of modifying the value of the amount of vacant rooms,
	 * therefore, if there is a registration in a king room, the number of King Rooms Free lowers by 1.
	 * @param Number of available rooms free before the registration in each type.
	 */
	public static void setnumKingRoomsFree(int newkroomsfree){
		numKingRFree = newkroomsfree;
		//hotelRegistry.get(numKingRFree);
	}
	
	public static void setnumQueenRoomsFree(int newqroomsfree){
		numQueenRFree = newqroomsfree;
		//hotelRegistry.get(numQueenRFree);
	}
	
	public static void setnumTwoDoubleRoomsFree(int newtdroomsfree){
		numTwoDoubleRFree = newtdroomsfree;
		//hotelRegistry.get(numTwoDoubleRFree);
	}
	
	public static void setnumTwoDoubleRwCotFree(int woDoubleRwCotFree){
		numTwoDoubleRwCotFree = woDoubleRwCotFree;
		//hotelRegistry.get(numTwoDoubleRwCotFree);
	}
	
	/**
	 * The method get List will retrieve the List of rooms.
	 * @return the complete hotel registry.
	 */
	
	public static List<BasicHotelRooms> getList (){
		return hotelRegistry;
	}	
	
	/**
	 * The following 15 methods will be in charge of modifying the field text that includes the
	 * name and last name of the guest for each of the 15 rooms.
	 * @param New guest to be introduced in the registry.
	 */
	public static void setGuest100( String input) { 
	     guest0.setText(input); 
	} 
	
	public static void setGuest101( String input) { 
	     guest1.setText(input); 
	} 
	
	public static void setGuest102( String input) { 
	     guest2.setText(input); 
	} 
	
	public static void setGuest103( String input) { 
	     guest3.setText(input); 
	} 
	
	public static void setGuest104( String input) { 
	     guest4.setText(input); 
	} 
	
	public static void setGuest105( String input) { 
	     guest5.setText(input); 
	} 
	
	public static void setGuest106( String input) { 
	     guest6.setText(input); 
	} 
	
	public static void setGuest107( String input) { 
	     guest7.setText(input); 
	} 
	
	public static void setGuest108( String input) { 
	     guest8.setText(input); 
	} 
	
	public static void setGuest109( String input) { 
	     guest9.setText(input); 
	} 
	
	public static void setGuest110( String input) { 
	     guest10.setText(input); 
	} 
	
	public static void setGuest111( String input) { 
	     guest11.setText(input); 
	} 
	
	public static void setGuest112( String input) { 
	     guest12.setText(input); 
	} 
	
	public static void setGuest113( String input) { 
	     guest13.setText(input); 
	} 
	
	public static void setGuest114( String input) { 
	     guest14.setText(input); 
	} 
	
	/**
	 * The following three methods will be in charge of modifying the number of available rooms and displaying them
	 * in the main frame.
	 * @param The new number of available rooms depending on the type.
	 */
	public static void numKFree( String input) { 
		oneKingNumber.setText(input); 
	}
	
	public static void numQFree( String input) { 
		oneQueenNumber.setText(input); 
	}
	public static void num2DBFree( String input) { 
		twoDoubleBedsNumber.setText(input); 
	}
	
	public static void num2DBWCFree( String input) { 
		twoDoubleBedsWNumber.setText(input); 
	}
		
	/**
	 * The method initialize is in charge of the contents of the frame in order.
	 */
	public void initialize() {
		hotelRegistry = new ArrayList<>();
		hotelRegistry.add(new OneKingRoom("100",true));
		hotelRegistry.add(new TwoDoubleRoom("101",true));
		hotelRegistry.add(new OneKingRoom("102",true));
		hotelRegistry.add(new TwoDoubleWCotRoom("103",true));
		hotelRegistry.add(new OneQueenRoom("104",true));
		hotelRegistry.add(new OneKingRoom("105",true));
		hotelRegistry.add(new OneQueenRoom("106",true));
		hotelRegistry.add(new TwoDoubleRoom("107",true ));
		hotelRegistry.add(new OneQueenRoom("108",true));
		hotelRegistry.add(new TwoDoubleWCotRoom("109",true));
		hotelRegistry.add(new TwoDoubleRoom("110",true));
		hotelRegistry.add(new TwoDoubleRoom("111",true));
		hotelRegistry.add(new TwoDoubleRoom("112",true));
		hotelRegistry.add(new TwoDoubleRoom("113",true));
		hotelRegistry.add(new OneKingRoom("114",true));
		
		/**
		 * This will be used to create the layout of the main frame.
		 */
		frame = new JFrame("Hotel Registry");
		frame.setBounds(100, 100, 537, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel room = new JLabel("Room");
		room.setBounds(10, 27, 46, 14);
		frame.getContentPane().add(room);
		
		JLabel guest = new JLabel("Guest");
		guest.setBounds(121, 27, 46, 14);
		frame.getContentPane().add(guest);
		
		JLabel room100 = new JLabel("100:");
		room100.setBounds(10, 47, 29, 14);
		frame.getContentPane().add(room100);
		
		JLabel room101 = new JLabel("101:");
		room101.setBounds(10, 70, 29, 14);
		frame.getContentPane().add(room101);
		
		JLabel room102 = new JLabel("102:");
		room102.setBounds(10, 93, 29, 14);
		frame.getContentPane().add(room102);
		
		JLabel room103 = new JLabel("103:");
		room103.setBounds(10, 116, 29, 14);
		frame.getContentPane().add(room103);
		
		JLabel room104 = new JLabel("104:");
		room104.setBounds(10, 139, 29, 14);
		frame.getContentPane().add(room104);
		
		JLabel room105 = new JLabel("105:");
		room105.setBounds(10, 162, 29, 14);
		frame.getContentPane().add(room105);
		
		JLabel room106 = new JLabel("106:");
		room106.setBounds(10, 185, 29, 14);
		frame.getContentPane().add(room106);
		
		JLabel room107 = new JLabel("107:");
		room107.setBounds(10, 208, 29, 14);
		frame.getContentPane().add(room107);
		
		JLabel room108 = new JLabel("108:");
		room108.setBounds(10, 231, 29, 14);
		frame.getContentPane().add(room108);
		
		JLabel room109 = new JLabel("109:");
		room109.setBounds(10, 254, 29, 14);
		frame.getContentPane().add(room109);
		
		JLabel room110 = new JLabel("110:");
		room110.setBounds(10, 277, 29, 14);
		frame.getContentPane().add(room110);
		
		JLabel room111 = new JLabel("111:");
		room111.setBounds(10, 300, 29, 14);
		frame.getContentPane().add(room111);
		
		JLabel room112 = new JLabel("112:");
		room112.setBounds(10, 323, 29, 14);
		frame.getContentPane().add(room112);
		
		JLabel room113 = new JLabel("113:");
		room113.setBounds(10, 346, 29, 14);
		frame.getContentPane().add(room113);
		
		JLabel room114 = new JLabel("114:");
		room114.setBounds(10, 369, 29, 14);
		frame.getContentPane().add(room114);
		
		guest0 = new JTextField();
		guest0.setText("Vacant");
		guest0.setBounds(61, 44, 166, 20);
		frame.getContentPane().add(guest0);
		guest0.setEditable(false);
		guest0.setColumns(10);
		
		guest1 = new JTextField();
		guest1.setText("Vacant");
		guest1.setColumns(10);
		guest1.setEditable(false);
		guest1.setBounds(61, 67, 166, 20);
		frame.getContentPane().add(guest1);
		
		guest2 = new JTextField();
		guest2.setText("Vacant");
		guest2.setColumns(10);
		guest2.setBounds(61, 90, 166, 20);
		guest2.setEditable(false);
		frame.getContentPane().add(guest2);
		
		guest3 = new JTextField();
		guest3.setText("Vacant");
		guest3.setColumns(10);
		guest3.setBounds(61, 113, 166, 20);
		guest3.setEditable(false);
		frame.getContentPane().add(guest3);
		
		guest4 = new JTextField();
		guest4.setText("Vacant");
		guest4.setColumns(10);
		guest4.setBounds(61, 136, 166, 20);
		guest4.setEditable(false);
		frame.getContentPane().add(guest4);
		
		guest5 = new JTextField();
		guest5.setText("Vacant");
		guest5.setColumns(10);
		guest5.setBounds(61, 159, 166, 20);
		guest5.setEditable(false);
		frame.getContentPane().add(guest5);
		
		guest6 = new JTextField();
		guest6.setText("Vacant");
		guest6.setColumns(10);
		guest6.setBounds(61, 182, 166, 20);
		guest6.setEditable(false);
		frame.getContentPane().add(guest6);
		
		guest7 = new JTextField();
		guest7.setText("Vacant");
		guest7.setColumns(10);
		guest7.setBounds(61, 205, 166, 20);
		guest7.setEditable(false);
		frame.getContentPane().add(guest7);
		
		guest8 = new JTextField();
		guest8.setText("Vacant");
		guest8.setColumns(10);
		guest8.setBounds(61, 228, 166, 20);
		guest8.setEditable(false);
		frame.getContentPane().add(guest8);
		
		guest9 = new JTextField();
		guest9.setText("Vacant");
		guest9.setColumns(10);
		guest9.setBounds(61, 251, 166, 20);
		guest9.setEditable(false);
		frame.getContentPane().add(guest9);
		
		guest10 = new JTextField();
		guest10.setText("Vacant");
		guest10.setColumns(10);
		guest10.setBounds(61, 274, 166, 20);
		guest10.setEditable(false);
		frame.getContentPane().add(guest10);
		
		guest11 = new JTextField();
		guest11.setText("Vacant");
		guest11.setColumns(10);
		guest11.setBounds(61, 297, 166, 20);
		guest11.setEditable(false);
		frame.getContentPane().add(guest11);
		
		guest12 = new JTextField();
		guest12.setText("Vacant");
		guest12.setColumns(10);
		guest12.setBounds(61, 320, 166, 20);
		guest12.setEditable(false);
		frame.getContentPane().add(guest12);
		
		guest13 = new JTextField();
		guest13.setText("Vacant");
		guest13.setColumns(10);
		guest13.setBounds(61, 343, 166, 20);
		guest13.setEditable(false);
		frame.getContentPane().add(guest13);
		
		guest14 = new JTextField();
		guest14.setText("Vacant");
		guest14.setColumns(10);
		guest14.setBounds(61, 366, 166, 20);
		guest14.setEditable(false);
		frame.getContentPane().add(guest14);
		
		/**
		 * The menu inside the main frame will contain the action of registration and help.
		 */
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 521, 24);
		frame.getContentPane().add(menuBar);
		
		JMenu mnRegistry = new JMenu("Registry");
		mnRegistry.setForeground(new Color(0, 0, 0));
		mnRegistry.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuBar.add(mnRegistry);
		
		/**
		 * By clicking Check in we will go to the class Check In.
		 */
		JMenuItem mntmCheckIn = new JMenuItem("Check In");
		mntmCheckIn.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				  CheckIn checkInWindow=new CheckIn();
				  checkInWindow.checkIn.setVisible(true); 
			}	
		});
		mnRegistry.add(mntmCheckIn);
		
		/**
		 * By clicking Check out we will go to the class Check out.
		 */
		JMenuItem mntmCheckOut = new JMenuItem("Check Out");
		mntmCheckOut.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				CheckOut checkOutWindow=new CheckOut(); 
		       checkOutWindow.checkOut.setVisible(true); 
			}	
		});
		mnRegistry.add(mntmCheckOut);
		
		/**
		 * By clicking Exit we will close the application.
		 */	
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				System.exit(0);
			}	
		});
		mnRegistry.add(mntmExit);
		
		/**
		 * By clicking Help we will display my name and student number.
		 */	
		JMenu mnHelp = new JMenu("Help");
		mnHelp.setMnemonic(KeyEvent.VK_H);
		mnHelp.setForeground(new Color(0, 0, 0));
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				JOptionPane.showMessageDialog(frame,
					    "Jessica Ginesta Legasto \n ID: A20363039",
					    "About",
					    JOptionPane.PLAIN_MESSAGE);
			}	
		});
		mnHelp.add(mntmAbout);
		
		/**
		 * We will divide the layout into two panels in order to introduce a border.
		 * In this part of the layout we will show the vacancies of each type of room.
		 */
		JPanel panel = new JPanel();
		panel.setBounds(252, 34, 259, 352);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
       	panel.setBorder(new LineBorder(Color.BLACK, 1, true));
		
		
		JLabel oneKing = new JLabel("One King");
		oneKing.setBounds(4, 59, 85, 14);
		panel.add(oneKing);
		
		JLabel lblVacancies = new JLabel("Vacancies");
		lblVacancies.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblVacancies.setBounds(2, 0, 60, 20);
		panel.add(lblVacancies);
		
		JLabel oneQueen = new JLabel("One Queen");
		oneQueen.setBounds(4, 132, 100, 14);
		panel.add(oneQueen);
		oneQueen.setHorizontalAlignment(SwingConstants.LEFT);
		
		oneQueenNumber = new JTextField();
		oneQueenNumber.setText("3");
		oneQueenNumber.setBounds(164, 129, 85, 20);
		panel.add(oneQueenNumber);
		oneQueenNumber.setEditable(false);
		oneQueenNumber.setColumns(10);
		
		JLabel twoDoubleBeds = new JLabel("Two Double Beds");
		twoDoubleBeds.setBounds(4, 205, 100, 14);
		panel.add(twoDoubleBeds);
		twoDoubleBeds.setHorizontalAlignment(SwingConstants.CENTER);
		
		twoDoubleBedsNumber = new JTextField();
		twoDoubleBedsNumber.setText("6");
		twoDoubleBedsNumber.setBounds(164, 202, 85, 20);
		panel.add(twoDoubleBedsNumber);
		twoDoubleBedsNumber.setEditable(false);
		twoDoubleBedsNumber.setColumns(10);
		
		JLabel twoDoubleBedsW = new JLabel("Two Double Beds w/Cot");
		twoDoubleBedsW.setBounds(4, 278, 150, 14);
		panel.add(twoDoubleBedsW);
		
		twoDoubleBedsWNumber = new JTextField();
		twoDoubleBedsWNumber.setText("2");
		twoDoubleBedsWNumber.setBounds(164, 275, 85, 20);
		panel.add(twoDoubleBedsWNumber);
		twoDoubleBedsWNumber.setEditable(false);
		twoDoubleBedsWNumber.setColumns(10);
		
		oneKingNumber = new JTextField();
		oneKingNumber.setText("4");
		oneKingNumber.setBounds(164, 56, 85, 20);
		panel.add(oneKingNumber);
		oneKingNumber.setEditable(false);
		oneKingNumber.setColumns(10);
	}
}
