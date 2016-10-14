package edu;
/**
 * This class one queen room is a room type from basic hotel rooms.
 * 
 * @author: Sergio Penavades Suarez 
 * @version: 1
 */

public class OneQueenRoom extends BasicHotelRooms{
	
	private static final int MAXOCCUPANCY = 2;
	/**
	 * The constructor calls the method basic hotel rooms in order to use its getters and setters.
	 * @param roomnumber: Roomnumber
	 * @param vacant: Determines if the room is free or not.
	 */
	public OneQueenRoom(String roomnumber, boolean vacant) {
		super(roomnumber, RoomType.ONE_QUEEN_BED, MAXOCCUPANCY,vacant);
	}
}
