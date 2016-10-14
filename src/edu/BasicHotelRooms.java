package edu;
public abstract class BasicHotelRooms {
protected String roomnumber;
protected RoomType roomtype;
protected int maxoccupancy;
protected boolean vacant;

/**
 * This class basic hotel rooms is in charge of the setters and getters of each type of room.
 * 
 * @author: Sergio Penavades Suarez 
 * @version: 1
 */

/**The constructor Basic Hotel Rooms will obtain valuable paramenters when called.
 * @param roomnumber: Room number 
 * @param roomtype: Room type from the four available.
 * @param max ocuppancy: Maximum number of guests that can fit in a room.
 * @param vacant: If vacant is true, it means that the room is free.
 */
	public BasicHotelRooms(String roomnumber, RoomType roomtype, int maxoccupancy, boolean vacant) {
	this.roomnumber = roomnumber;
	this.roomtype = roomtype;
	this.maxoccupancy = maxoccupancy;
	this.vacant=vacant;
	}


	/**
	 * The method is vacant determines if the room is free or occupied.
	 * @return return a boolean that is true if the room is free.
	 */
	public boolean isVacant() {
		return vacant;
	}
	
	/**
	 * The method set vacant modifies the value of vacant, therefore, if the room is occupied it modifies 
	 * to false and if the room is empty (check out) is turns into true.
	 * @param boolean that is true if the room is free.
	 */
	public void setVacant(boolean vacant) {
		this.vacant = vacant;
	}

	/**
	 * The method getRoomNumber obtains the string of the room number.
	 * @return return a string of the room number.
	 */
	public String getRoomnumber() {
		return roomnumber;
	}
	
	/**
	 * The method getRoomType obtains the enumerate of the room type from king, queen,
	 *  two double and two double with a cot.
	 * @return return a string of the room type.
	 */
	public RoomType getRoomtype() {
		return roomtype;
	}
	
	/**
	 * The method getRoomoccupancy obtains the maximum number of guests that each room can handle.
	 * @return return the maximum occupancy associated with each room number.
	 */
	public int getMaxoccupancy(){
		return maxoccupancy;	
	}
}
