package classes;
import java.lang.*;

public class DoubleRoom extends Room
{
	private String sizee="Double";
	
	public void showInfo()
	{
		System.out.println("Room ID: "+getRid());
		System.out.println("Rood Type: "+getType());
		System.out.println("Room Fare :"+getPrice());
	    System.out.println("Size of the Room:"+sizee);
		System.out.println();
	}
}