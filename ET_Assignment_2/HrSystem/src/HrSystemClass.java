import java.util.Scanner;

class InputInvalidException extends Exception{
	public InputInvalidException(String type) {
		// TODO Auto-generated constructor stub
		System.out.println(type + " field is missing!");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Invalid input!!";
	}
}


abstract class Employee {
	private final String company = "ACI";
	
	private String empID;
	private String name;
	private double salary;

	public Employee() {
		empID = null;
		name = null;
		salary = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws InputInvalidException {
		
		if(name==null)
		{
			throw new InputInvalidException("name");
		}
		
		this.name = name;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// abstract classes
	public abstract void employeeType();

	public void setDetails() {
		// set members of this class
		try {
			Scanner ip=new Scanner(System.in);
			String n, e;
			double s;
			System.out.println("Enter the following details!");
			
			System.out.print("Name : ");
			n=ip.nextLine();
			setName(n);
			
			System.out.print("Employee ID : ");
			e=ip.nextLine();
			setEmpID(e);
			
			System.out.print("Salary : ");
			s=ip.nextDouble();
			setSalary(s);
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}

	public void getDetails() {
		// get value of members of this class
	};

}

class BasicPrivilage {

}

class AdvPrivilage extends BasicPrivilage {

}

class Manager extends Employee {

	// composition
	private SrManager supervisor;
	private BasicPrivilage bPrivilage;

	public Manager() {
		this.supervisor = new SrManager();
		this.bPrivilage = new BasicPrivilage();
	}

	public SrManager getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(SrManager supervisor) {
		this.supervisor = supervisor;
	}

	public BasicPrivilage getbPrivilage() {
		return bPrivilage;
	}

	public void setbPrivilage(BasicPrivilage bPrivilage) {
		this.bPrivilage = bPrivilage;
	}

	@Override
	public void employeeType() {
		System.out.println("Manager!");

	}

	@Override
	public void setDetails() {
		// TODO Auto-generated method stub
		super.setDetails();
		// set members of this class
	}

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		super.getDetails();
		// get value of members of this class
	}

}

class SrManager extends Manager {

	public SrManager() {
		setSupervisor(null);
		setbPrivilage(new AdvPrivilage());
	}

	@Override
	public void employeeType() {
		// TODO Auto-generated method stub
		System.out.println("Senior manager!");

	}

	@Override
	public void setDetails() {
		// TODO Auto-generated method stub
		super.setDetails();

	}

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		super.getDetails();

	}

}

class SoftWareEngineers extends Employee {

	private Manager manager;

	public SoftWareEngineers() {
		manager = new Manager();
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public void employeeType() {
		System.out.println("Software engineer!");

	}

	@Override
	public void setDetails() {
		// TODO Auto-generated method stub
		super.setDetails();

		// set members of this class
	}

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		super.getDetails();
		// get values of members of this class
	}

}

public class HrSystemClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager sm = new Manager();
//		sm.setDetails();
		

		

	}

}
