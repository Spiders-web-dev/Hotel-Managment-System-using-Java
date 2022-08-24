package interfaces;
import java.lang.*;
import classes.*;

public interface EmployeeOp
{
	void insertEmployee(Employee e);
	void removeEmployee(Employee e);
	Employee getEmployee(String empId);
	void showAllEmployees();
}