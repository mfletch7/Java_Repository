import javax.swing.JOptionPane;

public class CollegeEmployee extends Person {
	private int ssn;
	private int annualSalary;
	private String deptName;
	
	public CollegeEmployee()
	{
		super();
		ssn = Integer.parseInt(JOptionPane.showInputDialog("Please provide the social security number"));
		deptName = JOptionPane.showInputDialog("What is the department name?");
		annualSalary = Integer.parseInt(JOptionPane.showInputDialog("Please provide the annual salary"));
	}
	
	public CollegeEmployee(String fn, String ln, String add, int zip, String tel, int sosen, int as, String dN)
	{
		super(fn, ln, add, zip, tel);
		ssn = sosen;
		annualSalary = as;
		deptName = dN;
	}
	
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("SSN: " + ssn + " Salary " + annualSalary + " Department: " + deptName);
	}
}
