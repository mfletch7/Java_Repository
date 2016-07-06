import javax.swing.JOptionPane;

public class Student extends Person {
	private String major;
	private double gpa;
	
	public Student()
	{
		major = JOptionPane.showInputDialog("What is the students major?");
		gpa = Double.parseDouble(JOptionPane.showInputDialog("Please provide the students GPA"));
	}
	
	public Student(String fn, String ln, String add, int zip, String tel, String m, double ave)
	{
		super(fn, ln, add, zip, tel);
		major = m;
		gpa = ave;
	}
	
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("The student's major is " + major + " and GPA is " + gpa);
	}
}
