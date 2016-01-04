package Model;
import java.util.ArrayList;

public class Being {
	private int level;
	private String name;
	private ArrayList<Skill> skills;
	private Room currentRoom;
	
	public Room getCurrentRoom() {
		return currentRoom;
	}
	
	public void setCurrentroom(Room aRoom) {
		currentRoom = aRoom;
	}

}
