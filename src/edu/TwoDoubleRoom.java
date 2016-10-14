package edu;

/**
 * This class two double rooms is a room type from basic hotel rooms.
 * 
 * @author: Sergio Penavades Suarez 
 * @version: 1
 */

public class TwoDoubleRoom extends BasicHotelRooms{
	
	private static final int MAXOCCUPANCY = 4;
	/**
	 * The constructor calls the method basic hotel rooms in order to use its getters and setters.
	 * @param roomnumber: Roomnumber
	 * @param vacant: Determines if the room is free or not.
	 */
	public TwoDoubleRoom(String roomnumber, boolean vacant) {
		super(roomnumber, RoomType.TWO_DOUBLE_BEDS, MAXOCCUPANCY,vacant);
	}
}
