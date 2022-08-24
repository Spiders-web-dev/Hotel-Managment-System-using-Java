package interfaces;
import java.lang.*;
import classes.*;

public interface CustomerOp
{
	void insertCustomer(Customer c);
	void removeCustomer(Customer c);
	Customer getCustomer(String cid);
	void showAllCustomers();
}