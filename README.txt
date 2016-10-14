
i)HOTEL REGISTRY

ii)A) The class hotel registry is in charge of displaying the main frame that includes a menu, the vacancies and the registry associated to each room. The menu
has access to the registry where the clerk can check in and check out the guest and the help button that displays my name and my student id number. First of all, this 
class will initialize the number of rooms free to the default for every type, making it 4 for King rooms, 3 for Queen rooms, 6 for Two Double Rooms and 2 for Two double
rooms with cot making a total of 15 rooms. Once the variables has been initialized, the method initialized is executed which will display the layout and the implementation
of the program. Therefore, a new arraylist is created in the room numbers order, therefore, the first room will have a King Room type.
Once the layout is created, we have the option to navigate into different panels if we want to check in or check out a room, updating these entries in the main 
frame display when a change occurs.

B) In order to create the different types of rooms I have created two classes which are common to the 4 types of rooms which are Basic Hotel Room and Room Type. Room Type
only defines an enumerate that gives the option of dividing the rooms into 4 different types. Basic Room is a parent class that will be used by the 4 classes of room types
and will be in charge of obtaining the room number, room type, maximum capacity and vacancy for each room. Additionally, I have created 4 classes, one for each type of room that 
will call Basic Hotel Room (in order for all the rooms to be from the same type), accessing all the variables available in the parent class. The name of the 4 child classes are
One King Room, One Queen Room, Two Double Room and Two Double WCot Room.

C) In order to dynamically update the forms we will use Action Listeners in the files Hotel Registry, Check In and Check Out. 
For the Hotel Registry I have used:
- One to redirect to the CheckIn file when Check In is clicked in the Registry menu, in order to register a guest to a certain room.
- One to redirect to the CheckOut file when Check Out is clicked in the Registry menu, in order to check out a guest to a certain room.
- One to close the application when Exit is clicked in the Registry menu.
- One to show my name and student number when About is clicked in the Help menu.

For the Check In I have used:
- One to limit the amount of rooms available for the clerk to register a guest depending on the following variables:
	-Depending on the room type, once the radio button is clicked, the room numbers that will be displayed are only the ones from that type. Therefore, if the radiobutton
	that is clicked is Two Double Rooms with a cot, then the only two rooms available will be 103 and 109.
	-Addtionally, it will only show the vacant rooms.
	-The total number of children and adults have two be lower than the maximum occupancy for each type of room, therefore if the clerk selects 4 adults and the radiobutton
	King bed, it will not show any rooms even if the room is vacant.
  Therefore, it will only show the rooms that comply with every condition by introducing the following action listeners in order for the combobox to update if any of the options vary.
  		roomKing.addActionListener(sliceActionListener);// King room radiobutton
		roomQueen.addActionListener(sliceActionListener);//Queen room radiobutton
		room2DB.addActionListener(sliceActionListener);//Two double room radiobutton
		room2DBwCot.addActionListener(sliceActionListener);//Two double with a cot radiobutton
		numChild.addActionListener(sliceActionListener);//num of children combobox
		numberAdults.addActionListener(sliceActionListener);//num of adults combobox		
-One for the Register button that will be in charge of:
	-Validating that all the required fields are filled, including the room number and the room type are being selected. If the validation is correct, then it will be in charge 
	of modifying both the vacancy number of each type of room and the registry name into the main frame according to the options selected by the clerk.
-One for the Cancel button in order to redirect to the main frame.

For the Check Out I have used:
-One for the Cancel button in order to redirect to the main frame.
-One for the Ok button in order to make the room selected by the clerk vacant for the next user.

iii) The greatest challenge was related to the combobox.
First of all, it has really been difficult to update the room numbers available for the clerk to register depending on the number of children , adults, vacant and room type selected.

Moreover, it has been difficult to manage the Action listeners to work dynamically together. Therefore, if the number of children change, then the room number combobox have to vary,
as well as if the radio button and the number of adults vary.

Additionally, in order to successfully change the name of the guest, it has been difficult for that room number to stop displaying from the available rooms. Instead, the rooms that
removed from the combobox where ordered alphabetically. However, I have managed to find a solution by tracking down that I was obtaining the room numbers in order from the list, instead
of the one selected by the clerk.

iv) Every requirement has been fulfilled successfully. 

v) The requirement that I had to take a decision into how to implement it is the option of having a default value in the combobox.
What I have done, in order to avoid a preference of the room 100 amongst the other was to introduce a String that says select the room number.s

vi)The complexity of this program due to the interface and layout part would be of an 8 and it has been difficult mixing the design with the implementation.