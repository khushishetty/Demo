import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


class InputInvalidException extends Exception {
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

abstract class Employee implements Serializable {
	private final String company = "ACI";

	private String empID;
	private String name;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String eid, String n, double s) {
		this.empID = eid;
		this.name = n;
		this.salary = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

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

	public void setDetails() throws InputInvalidException {
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter the name : ");
		this.name = ip.next();
		if (name.isEmpty()) {
			throw new InputInvalidException("name");
		}

		System.out.println("Enter the emplyee id : ");
		this.empID = ip.next();
		if (empID.isEmpty()) {
			throw new InputInvalidException("empID");
		}

		System.out.println("Enter the Salary : ");
		this.salary = ip.nextDouble();
		if (salary == 0) {
			throw new InputInvalidException("salary");
		}
	}

	public void getDetails() {
		// get value of members of this class
		System.out.println("\nName : " + getName() + "\nEmployeeID : " + getEmpID() + "\nSalary : " + getSalary());
	};

}

class BasicPrivilage implements Serializable {

}

class AdvPrivilage extends BasicPrivilage {

}

class Manager extends Employee {

	// composition
	private SrManager supervisor;
	private BasicPrivilage bPrivilage;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	
	public Manager(String eid, String n, double s, SrManager srm, BasicPrivilage bp) {
		super(eid, n, s);
		this.supervisor = srm;
		this.bPrivilage = bp;
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
	public void getDetails() {
		super.getDetails();
//		System.out.println("Supervised by " + this.supervisor.getName());
		// Show privileges
	}

	@Override
	public void setDetails() throws InputInvalidException {
		// TODO Auto-generated method stub
		super.setDetails();
		this.bPrivilage = new BasicPrivilage();
	}

}

class SrManager extends Employee {
	private BasicPrivilage bPrivilage;


	public SrManager() {
		// TODO Auto-generated constructor stub

	}

	public SrManager(String eid, String n, double s, BasicPrivilage bp) {
		super(eid, n, s);
		bPrivilage = bp;

	}

	@Override
	public void employeeType() {
		// TODO Auto-generated method stub
		System.out.println("Senior manager!");

	}

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		super.getDetails();
		// Display senior manager details(extra)

	}

	@Override
	public void setDetails() throws InputInvalidException {
		// TODO Auto-generated method stub
		super.setDetails();
		this.bPrivilage = new AdvPrivilage();
	}

}

class SoftWareEngineers extends Employee {

	private Manager manager;

	public SoftWareEngineers(String eid, String n, double s, Manager m) {
		super(eid, n, s);
		manager = m;
	}

	public SoftWareEngineers() {
		// TODO Auto-generated constructor stub
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
	public void getDetails() {

		super.getDetails();
		System.out.println("Managed by " + this.manager.getName());
		// get values of members of this class
	}

	@Override
	public void setDetails() throws InputInvalidException {
		// TODO Auto-generated method stub
		super.setDetails();
	}

}

public class HrSystemClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		ArrayList<Employee> managers=new ArrayList<Employee>();
		ArrayList<Employee> srManagers=new ArrayList<Employee>();
		ArrayList<Employee> SoftEngs=new ArrayList<Employee>();
		
		
		boolean flag = false;
		int choice;
		while (flag) {
			Employee e;
			System.out.println("1. Sr.Manager \n2.Manager \n3.Software Enginner \nother. exit");
			choice = ip.nextInt();
			switch (choice) {
			case 1:
				try {
					e = new SrManager();
					e.setDetails();
					srManagers.add(e);
				} catch (InputInvalidException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;

			case 2:
				try {
					e = new Manager();
					e.setDetails();
					managers.add(e);
				} catch (InputInvalidException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 3:
				try {
					e = new SoftWareEngineers();
					e.setDetails();
					SoftEngs.add(e);
				} catch (InputInvalidException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				// set Manager by searching if manager exists or not(by empID)
				break;
			default:
				flag = false;
			}
		}
//		
//		for(Employee e:srManagers)
//			e.getDetails();
		
		FileClass fc = new FileClass();
		//fc.addManager(managers);
		fc.readObject();
	}

}
