package View;
import Model.Player;
import Model.Room;
import Model.RoomEgress;

public class DescriptionPanel extends Panel {
	public void Update(Player aPlayer) {
		Room room = aPlayer.getCurrentRoom();
		System.out.println(room.getDescription());
		for (RoomEgress re : room.getAdjacentRooms()) {
			System.out.println(re.getEgressDescriptionText());
		}
	}
}
