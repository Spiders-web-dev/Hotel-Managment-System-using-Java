package classes;
import java.lang.*;

public class SingleRoom extends Room
{
	private String size="Single";
	
	public void showInfo()
	{
		System.out.println("Room ID: "+getRid());
		System.out.println("Rood Type: "+getType());
		System.out.println("Room Fare :"+getPrice());
	    System.out.println("Size of the Room:"+size);
		System.out.println();
	}
}