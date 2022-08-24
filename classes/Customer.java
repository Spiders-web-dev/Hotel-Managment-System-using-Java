package classes;
import java.lang.*;
import interfaces.*;

public class Customer implements RoomOp 
{
    private String cid;
    private String name;
	private String phoneNo;
	private Room room[] = new Room[10];


public void setCid(String cid)
	{
		this.cid = cid;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPhoneNo(String phoneNo)
	{
		this.phoneNo = phoneNo;
	}
	public String getCid()
	{
		return cid;
	} 
	public String getName()
	{
		return name;
	}
	
	public String getPhoneNO()
	{
		return phoneNo;
	}
	
	public void BookRoom(Room r)
	 {
    int flag = 0;
		for(int i=0; i<room.length; i++)
		{

			if(room[i] == null)
			{
				room[i] = r;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Room Booked");
		}
		else
		{
			System.out.println("Can Not Booked");
		}

  }

  public void UnbookRoom(Room r)
  {
    int flag = 0;
		for(int i=0; i<room.length; i++)
		{
			if(room[i] == r)
			{
				room[i] = null;
				flag = 1;
				break;
			}
    }
    if(flag == 1)
	{
      System.out.println("Room Unbooked");
    }
	else
	{
      System.out.println("Can Not Unbooked");
    }
  }

  public Room getRoom(String rid)
  {
		Room r = null;
		for(int i=0; i<room.length; i++)
		{
			if(room[i] != null){
				if(room[i].getRid().equals(rid) )
				{
					r = room[i];
					break;
				}
			}
		}
		return r;
	}

  public void showAllBookRoom()
  {
    for(Room r : room)
	{
			if(r != null)
			{
				r.showInfo();
			}
	}
  }

}
	
	

