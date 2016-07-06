import javax.swing.JOptionPane;
public class Person {
	private String firstName;
	private String lastName;
	private String address;
	private int zipCode;
	private String phoneNumber;
	
	public Person()
	{
		firstName = JOptionPane.showInputDialog("What is the first name?");
		lastName = JOptionPane.showInputDialog("What is the last name?");
		address = JOptionPane.showInputDialog("What is the address?");
		zipCode = Integer.parseInt(JOptionPane.showInputDialog("Please provide the zip code"));
		phoneNumber = JOptionPane.showInputDialog("What is the phone number?");
	}
	
	public Person(String fn, String ln, String add, int zip, String tel)
	{
		firstName = fn;
		lastName = ln;
		address = add;
		zipCode = zip;
		phoneNumber = tel;
	}
	
	public void displayInfo()
	{
		System.out.println("Name: " + firstName + " " + lastName + ", address: " + address + " Zip: " + zipCode + " tel. " + phoneNumber);
	}
}
