package classes;
import java.lang.*;
import interfaces.*;

public abstract class Room
{
	protected String rid;
	protected String type; 
	protected double price; 
	
	
	public void setRid(String rid)
	{
		this.rid=rid;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	
	public String getRid()
	{
		return rid;
	}
	public String getType()
	{
		return type;
	}
	public double getPrice()
	{
		return price;
	}
	
	public abstract void showInfo();

}