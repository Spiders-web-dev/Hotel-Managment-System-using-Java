package classes;
import java.lang.*;

public class Employee
{
	private String name;
	private String empId;
	private double salary;
	private String phoneNo;
	
	public void setName(String name)
	{
		this.name = name;	
	}
	public void setPhoneNo(String phoneNo)
	{
		this.phoneNo = phoneNo;	
	}
	public void setEmpId(String empId)
	{
		this.empId = empId;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public String getEmpId()
	{
		return empId;
	} 
	public String getName()
	{
		return name;
	}
	public String getPhoneNo()
	{
		return phoneNo;
	}
	public double getSalary()
	{
		return salary;
	} 
}