package classes;
import java.lang.*;
import interfaces.*;

public class HotelManage implements CustomerOp,EmployeeOp
{
	private Customer customers[] = new Customer[10];
	private Employee employees[] = new Employee[10];
	
    public void insertCustomer(Customer c)
  {
    int flag = 0;
        for(int i = 0;i<customers.length;i++)
        {

            if(customers[i] == null)
            {
                customers[i] = c;
                flag = 1;
                break;
            }
    }
    if(flag == 1)
	{
		System.out.println("Customer inserted");
	}
    else
	{
		System.out.println("Customer Can not be inserted");
	}
  }

	public void removeCustomer(Customer c)
  {
    int flag = 0;
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] == c)
			{
				customers[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Customer Removed");
		}
		else
		{
			System.out.println("Customer can Not be Removed");
		}
  }
   public Customer getCustomer(String cid)
   {
    Customer c = null;
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] != null)
			{
				if(customers[i].getCid().equals(cid)) 
				{
					c = customers[i];
					break;
				}
			}
		}
		return c;
  }

  public void showAllCustomers()
  {
		for(Customer c : customers)
		{
			if(c!= null)
			{
				System.out.println("**********************************");
				System.out.println("Customer Name: "+ c.getName());
				System.out.println("Customer NID: "+ c.getCid());
				System.out.println("Customer Phone No: "+ c.getPhoneNO());
				System.out.println("----------------------------------");
				c.showAllBookRoom();
				System.out.println("----------------------------------");
			System.out.println();}
				
			else if(c == null)
			{
				System.out.println("**********************************");
				System.out.println("Hotel Has No Customer");
				System.out.println("----------------------------------");
				break;
			}
			
			
		}
	}
	public void insertEmployee(Employee e)
	{
		int flag = 0;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Employee Inserted");
		}
		else
		{
			System.out.println("Employee can Not be Inserted");
		}
	}
	
	public void removeEmployee(Employee e)
	{
		int flag = 0;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Employee Removed");
		}
		else
		{
			System.out.println("Employee can Not be Removed");
		}
	}
	public Employee getEmployee(String empId)
	{
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
		return e;
	}
	public void showAllEmployees()
	{
		System.out.println("/////////////////////////////////");
		for(Employee e : employees)
		{
			if(e!= null)
			{
				System.out.println("Employee Name: "+ e.getName());
				System.out.println("Employee Id: "+ e.getEmpId());
				System.out.println("Employee Salary: "+ e.getSalary());
				System.out.println("Employee Phone No: "+ e.getPhoneNo());
				System.out.println();
			}
			else if(e == null)
			{
				System.out.println("**********************************");
				System.out.println("Hotel Has No Employee");
				System.out.println("----------------------------------");
				break;
			}
		}
		System.out.println("/////////////////////////////////");
	}
	
	
	
}