import java.lang.*;
import classes.*;
import interfaces.*;
import java.util.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		HotelManage hm = new HotelManage();
		FileReadWriteDemo frd=new FileReadWriteDemo();
		
		boolean choice = true;
		
		try{
			
	    	while(choice)
		    {
			System.out.println("Choose from the Following Options: ");
			System.out.println("--------------------------------------");
			System.out.println("1. Employee Management");
			System.out.println("2. Customer Management");
			System.out.println("3. Customer Room Management");
			System.out.println("4. Exit");
			System.out.println("--------------------------------------\n");
			
			System.out.print("You have choosed: ");
			
			int option = sc.nextInt();
		
			switch(option)
			{
				case 1:
				    try{
				
					System.out.println("********************");
					System.out.println("Employee Management");
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Insert New Employee");
					System.out.println("2. Remove an Existing Employee");
					System.out.println("3. Show All Employees");
					System.out.println("4. Search An Employee");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input1 = sc.nextInt();
					String Ignore1 = sc.nextLine();
					
					switch(input1)
					{
						case 1:
						     try{
							
								System.out.println("#####################");
							
							System.out.println("Insert New Employee");
							
							System.out.print("Enter Employee Name: ");
							String name1 = sc.nextLine();
							
							
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.nextLine();
							
							
							
							System.out.print("Enter Employee Phone No: ");
							String phoneNo1 = sc.nextLine();
							
							
							frd.writeInFile("IN DATABASE Employee Name	: "+name1);
							frd.writeInFile("IN DATABASE Employee E-ID	: "+empId1);
							frd.writeInFile("IN DATABASE Employee Phone No	: "+phoneNo1);
							
							System.out.print("Enter Employee Salary: ");
							double salary = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setPhoneNo(phoneNo1);
							e1.setSalary(salary);
							
							hm.insertEmployee(e1);
						
							
							System.out.println("#####################");
							break;
							 }
							  
					         catch (InputMismatchException ime7)
		                    {
								ime7.printStackTrace();
								System.out.println("InputMismatchException occured");
				            }
							
							 
							
						case 2:
						    try{
						
						    System.out.println("#####################");
							System.out.println("Remove Existing Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId2 = sc.next();
							
							Employee e2 = hm.getEmployee(empId2);
							hm.removeEmployee(e2);
							
							
							
							System.out.println("#####################");
							break;	
							}
							 
					         catch (InputMismatchException ime8)
		                    {
								ime8.printStackTrace();
								System.out.println("InputMismatchException occured");
				            }

						case 3:
						    try{
							System.out.println("#####################");
							System.out.println("Show All Employees");
							
							hm.showAllEmployees();
							System.out.println("#####################");
							break;	
							 }
					         catch (InputMismatchException ime9)
		                    {
								ime9.printStackTrace();
								System.out.println("InputMismatchException occured");
				            }
							

						case 4:
						    try{
						     System.out.println("#####################");
							System.out.println("Search An Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId3 = sc.next();
							
							Employee e3 = hm.getEmployee(empId3);
							
							if(e3 !=null)
							{
								System.out.println("Employee Name: "+e3.getName());
								System.out.println("Employee ID: "+e3.getEmpId());
								System.out.println("Employee Phone No: "+e3.getPhoneNo());
								System.out.println("Employee Salary: "+e3.getSalary());
							}
							else
							{
								System.out.println("Employee Does Not Exists");
							}
							System.out.println("#####################");
							break;
                           }
					       catch (InputMismatchException ime10)
		                   {
								ime10.printStackTrace();
								System.out.println("InputMismatchException occured");
				            }							
								

						case 5:
						
							
							System.out.println("#####################");
							System.out.println("Go Back");
							System.out.println("#####################");
							break;
							
						default:
							System.out.println("#####################");
							System.out.println("Invaild Choice");
							System.out.println("#####################");
							break;
					}
					System.out.println("********************");
					break;
					}
					 catch (InputMismatchException ime2)
		            {
								ime2.printStackTrace();
								System.out.println("InputMismatchException occured");
				    }
					
				
				case 2:
				     try{
				
					System.out.println("********************");
					System.out.println("Customer Management");
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Insert New Customer");
					System.out.println("2. Remove an Existing Customer");
					System.out.println("3. Show All Customers");
					System.out.println("4. Search a Customer");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input2 = sc.nextInt();
					String Ignore2 = sc.nextLine();
					
					switch(input2)
					{
						case 1:
							try{
							System.out.println("#####################");
							System.out.println("Insert New Customer");
							
							
							System.out.print("Enter Customer Name: ");
							String name1 = sc.nextLine();
							
							
							
							System.out.print("Enter Customer Nid: ");
							String cid1 = sc.nextLine();
							
							
							
							System.out.print("Enter Customer Phone No: ");
							String phoneNo1 = sc.nextLine();
							
							frd.writeInFile("IN DATABASE Customer Name	: "+name1);
							frd.writeInFile("IN DATABASE Customer Nid	: "+cid1);
							frd.writeInFile("IN DATABASE Customer Phone No	: "+phoneNo1);
			
							Customer c1 = new Customer();
							
							c1.setName(name1);
							c1.setCid(cid1);
							c1.setPhoneNo(phoneNo1);
				
							hm.insertCustomer(c1);
							
							
							
							
							System.out.println("#####################");
							break;
							 }
					       catch (InputMismatchException ime11)
		                   {
								ime11.printStackTrace();
								System.out.println("InputMismatchException occured");
				            }
							
						

						case 2:
							try {
							System.out.println("#####################");
							System.out.println("Remove An Existing Customer");
							
							System.out.print("Enter Customer Nid: ");
							String cid2 = sc.next();
							
							Customer c2 = hm.getCustomer(cid2);
							hm.removeCustomer(c2);
							
							
							
							System.out.println("#####################");
							break;	
							 }
					         catch (InputMismatchException ime12)
		                    {
								ime12.printStackTrace();
								System.out.println("InputMismatchException occured");
				            }

						case 3:
							try{
							System.out.println("#####################");
							System.out.println("Show All Customer");
							
							hm.showAllCustomers();
							
							System.out.println("#####################");
							break;	
							 }
					      catch (InputMismatchException ime13)
		                    {
								ime13.printStackTrace();
								System.out.println("InputMismatchException occured");
				            }
							
						case 4:
							try{
							System.out.println("#####################");
							System.out.println("Search a Customer :");
							
							System.out.print("Enter Customer Nid: ");
							String cid3 = sc.nextLine();
							
							Customer c3 = hm.getCustomer(cid3);
							
							if(c3 !=null)
							{
								System.out.println("Customer Nid: "+c3.getCid());
								System.out.println("Customer Name: "+c3.getName());
								c3.showAllBookRoom();
							}
							else
							{
								System.out.println("Customer Does Not Exist");
							}
							System.out.println("#####################");
							break;	
							 }
					       catch (InputMismatchException ime14)
		                    {
								ime14.printStackTrace();
								System.out.println("InputMismatchException occured");
				            }

						case 5:
							
							System.out.println("#####################");
							System.out.println("Go Back");
							System.out.println("#####################");
							break;
							
						default:
							System.out.println("#####################");
							System.out.println("Invaild Choice");
							System.out.println("#####################");
							break;
					}
					System.out.println("********************");
					break;
					 }
					  catch (InputMismatchException ime3)
		             {
								ime3.printStackTrace();
								System.out.println("InputMismatchException occured");
				     }
					
				case 3:
				     try{
				
					System.out.println("********************");
					System.out.println("Customer Room Management");
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Book New Room For Customer");
					System.out.println("2. Remove An Existing Booked Room Of A Customer");
					System.out.println("3. Show All Book Room Of A Customer");
					System.out.println("4. Search A Book Room of a Customer ");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input3 = sc.nextInt();
					
					switch(input3)
					{
						case 1:
						    try{
							System.out.println("#####################");
							System.out.println(" Book New Room For Customer\n");
							
							System.out.println("Which Type of Room Do you Want to Book?");
							System.out.println("1. Double");
							System.out.println("2. Single");
							System.out.println("3. Go Back");
							
							System.out.print("Your Type: ");
							int type = sc.nextInt();
							
							
							Room r = null;
							
							
							if(type == 1)
							{
								DoubleRoom dm = new DoubleRoom();
								System.out.print("Enter  RID Of Room: ");
								String rid1 = sc.next();
								System.out.println("Enter  Type Of Room : ");
								System.out.println("1. Luxury");
							    System.out.println("2. Delux");
								System.out.println("3. Go Back");
								System.out.println("Your Type: ");
								int type0= sc.nextInt();
								
								if(type0 == 1 )
								{
								String type1="Luxury";
								dm.setType(type1);
								}
									
								else if(type0 ==2 )
								
								{
								String type1="Deleux";
								dm.setType(type1);
								}
								
								
								else
								{
									System.out.println("Invalid Type");
								}
								
								System.out.print("Enter Price Of The Room: ");
								double price1 = sc.nextDouble();
								
								
								
								
					            dm.setRid(rid1);
								
								dm.setPrice(price1);
								
								
								r = dm;
								
								
							}
							else if(type == 2)
							{
								SingleRoom sr = new SingleRoom();
								System.out.print("Enter  RID Of Room: ");
								String rid2 = sc.next();
								System.out.print("Enter  Type Of Room (luxury or Delux): ");
								String type2= sc.next();
								System.out.print("Enter Price Of The Room: ");
								double price2 = sc.nextDouble();
								
								
								
								
								sr.setRid(rid2);
								sr.setType(type2);
								sr.setPrice(price2);
								
								
								r = sr;
							}
							else if(type == 3)
							{
								System.out.println("Going Back....");
							}
							else
							{
								System.out.println("Invalid Type");
							}
							
							
							if(r != null)
							{
								try{
								System.out.print("Enter Customer Nid: ");
								String cid1 = sc.next();
								
								hm.getCustomer(cid1).BookRoom(r);
													
								
								}
								catch(NullPointerException npe)
								{npe.printStackTrace();
								System.out.println("NID not found");
								}
							}
							
							System.out.println("#####################");
							break;
							 }
					        catch (InputMismatchException ime15)
		                    {
								ime15.printStackTrace();
								System.out.println("InputMismatchException occured");
				             }
						
							
						case 2:
						
					    	try{
							System.out.println("#####################");
							System.out.println("Remove an Booked Room of a Customer");
							
							System.out.print("Enter Customer NID: ");
							String cid2 = sc.nextLine();
							System.out.print("Enter Room RID: ");
							String rid2 = sc.next();
							
							
							
							Customer cc = hm.getCustomer(cid2);
								Room rr= cc.getRoom(rid2);

								if (cc == null) {
									System.out.println("Room RID Not Found!");
									break;
								}
								cc.UnbookRoom(rr);
							}
							catch (NullPointerException npe){
								npe.printStackTrace();
								System.out.println("NullPointerException occured");
							}

                            System.out.println("#####################");
                            break;
						case 3:
						     try{
							System.out.println("#####################");
							System.out.println("Show All Booked Room of a Customer");
							System.out.print("Enter Customer NID: ");
							String cid3 = sc.next();
							
							hm.getCustomer(cid3).showAllBookRoom();
							 }
							  
					        catch (InputMismatchException ime16)
		                     {
								ime16.printStackTrace();
								System.out.println("InputMismatchException occured");
				               }
							System.out.println("#####################");
							break;
						case 4:
						    try{
							System.out.println("#####################");
							System.out.println("Search a Room of a Customer");
							
							System.out.print("Enter Customer NID: ");
							String cid4 = sc.next();
							System.out.print("Enter Room rid: ");
							String rid4 = sc.next();
							
							
							Room rr = hm.getCustomer(cid4).getRoom(rid4);
							
							
							
							if(rr != null)
							{
								rr.showInfo();
							}
							
							
							 }
					      catch (InputMismatchException ime17)
		                    {
								ime17.printStackTrace();
								System.out.println("InputMismatchException occured");
				             }
							System.out.println("#####################");
							break;
						case 5:
						
							System.out.println("#####################");
							System.out.println("Going Back ....");
							System.out.println("#####################");
							break;
							
						default:

							System.out.println("#####################");
							System.out.println("Invalid Option");
							System.out.println("#####################");
							break;
						
					}
					
					System.out.println("********************");
					break;
					 }
					  catch (InputMismatchException ime4)
		              {
								ime4.printStackTrace();
								System.out.println("InputMismatchException occured");
				      }
								
				
				case 4:
				     try{
				
					System.out.println("********************");
					System.out.println("Exit");
					choice = false;
					System.out.println("********************");
					break;
					 }
					  catch (InputMismatchException ime6)
		             {
								ime6.printStackTrace();
								System.out.println("InputMismatchException occured");
				     }
				default:
				
					System.out.println("********************");
					System.out.println("Invalid Option");
					System.out.println("********************");
					break;
					
			      }
			
		          }
		
		
	             }
	             catch (InputMismatchException ime1)
		         {
								ime1.printStackTrace();
								System.out.println("InputMismatchException occured");
				 }
				  catch (Exception e)
		         {
								e.printStackTrace();
								System.out.println("Here Exception occured");
				 }
				 
	     
	}
	
}
