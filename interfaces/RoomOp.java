package interfaces;
import java.lang.*;
import classes.*;

public interface RoomOp
{
	
	void BookRoom(Room r);
	void UnbookRoom(Room r);
	Room getRoom(String rid);
	void showAllBookRoom();
	
	
}