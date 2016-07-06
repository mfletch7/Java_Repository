import javax.swing.JOptionPane;

public class Faculty extends CollegeEmployee {
	private boolean tenured;
	
	public Faculty()
	{
		super();
		tenured = (JOptionPane.showConfirmDialog(null, "Is this person tenured?") == JOptionPane.YES_OPTION);
	}
	
	public Faculty(String fn, String ln, String add, int zip, String tel, int sosen, int as, String dN, boolean t)
	{
		super(fn, ln, add, zip, tel, sosen, as, dN);
		tenured = t;
	}
	
	public void displayInfo()
	{
		super.displayInfo();
		if(tenured)
			System.out.println("This person is tenured");
		else
			System.out.println("This person is not tenured");
	}
}
