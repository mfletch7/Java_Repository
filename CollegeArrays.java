import javax.swing.JOptionPane;

public class CollegeArrays {

	public static void main(String[] args) {
		CollegeEmployee[] personsCE = new CollegeEmployee[4];
		Faculty[] personsFac = new Faculty[3];
		Student[] personsStud = new Student[7];
		int numEmp = 0;
		int numFac = 0;
		int numStud = 0;
		String userChoice = "";
		char userSelect;
		boolean test;
		
		System.out.println("Please enter up to four College Employees, three Faculty, and seven Students");
		userChoice = JOptionPane.showInputDialog("Would you like to enter person information or use built-in information? (B for built-in)");
		userChoice = userChoice.toUpperCase();
		userSelect = userChoice.charAt(0);
		
		if(userSelect == 'B')
		{
			populateInfo(personsCE, personsFac, personsStud);
			numEmp = 1;
			numFac = 1;
		}
		else
		{
			while(userSelect != 'Q')
			{
				userChoice = JOptionPane.showInputDialog("What type of person information would you like to enter? C (CollegeEmployee), F (Faculty), S(Student), Q (Quit)");
				userChoice = userChoice.toUpperCase();
				userSelect = userChoice.charAt(0);
				
				switch(userSelect)
				{
				case 'C':
					test = EnterCollegeEmployee(numEmp, personsCE);
					if(test)
						numEmp++;
					break;
				case 'F':
					test = EnterFaculty(numFac, personsFac);
					if(test)
						numFac++;
					break;
				case 'S':
					test = EnterStudent(numStud, personsStud);
					if(test)
						numStud++;
					break;
				default:
					System.out.println("Please enter C, F, S, or Q");	
				}
				if(numEmp + numFac + numStud >= 14)
					break;
			}
		}// End else clause
		displayAllPersons(personsCE, personsFac, personsStud, numEmp, numFac, numStud);
	}//	End main method
public static boolean EnterCollegeEmployee(int numEmp, CollegeEmployee personsCE[])
{
	if(numEmp >= 4)
	{
		System.out.println("You have already added 4 College employees, please add something else or quit");
		return false;
	}
	CollegeEmployee temp = new CollegeEmployee();
	personsCE[numEmp] = temp;			//Uses positions 0 to 3
	return true;
}//	End EnterCollegeEmployee method

public static boolean EnterFaculty(int numFac, Faculty personsFac[])
{
	if(numFac >= 3)
	{
		System.out.println("You have already added 3 Faculty Members, please add something else or quit");
		return false;
	}
	Faculty temp1 = new Faculty();
	personsFac[numFac] = temp1;		//Uses positions 4 to 6
	return true;
}//	End EnterFaculty method

public static boolean EnterStudent(int numStud, Student personsStud[])
{
	if(numStud >= 7)
	{
		System.out.println("You have already added 7 Faculty Members, please add something else or quit");
		return false;
	}
	Student temp2 = new Student();
	personsStud[numStud] = temp2;		//Uses positions 7 to 13
	return true;
}

public static void populateInfo(CollegeEmployee personsCE[], Faculty personsFac[], Student personsStud[])
{
	CollegeEmployee temp = new CollegeEmployee("Taylor", "Swift", "200 North 300 West", 56342, "(546)345-3245", 556234567, 25000, "Friends");
	personsCE[0] = temp;
	Faculty temp2 = new Faculty("Blain", "Smith", "345 Sycamore", 78654, "(456)345-2134", 453654567, 56400, "Science", false);
	personsFac[0] = temp2;
}

public static void displayAllPersons(CollegeEmployee personsCE[], Faculty personsFac[], Student personsStud[], int numEmp, int numFac, int numStud)
{
	System.out.println();
	if(numEmp > 0)
	{
		System.out.println("College Employees");
		for(int i=0; i<numEmp; i++)
		{
			personsCE[i].displayInfo();
		}
		System.out.println();
	}
	else
		System.out.println("There are no College Employees");
	
	if(numFac > 0)
	{
		System.out.println("Faculty");
		for(int i=0; i<numFac; i++)
		{
			personsFac[i].displayInfo();
		}
		System.out.println();
	}
	else
		System.out.println("There are no Faculty");
	
	if(numStud > 0)
	{
		System.out.println("Students");
		for(int i=0; i<numStud; i++)
		{
			personsStud[i].displayInfo();
		}
		System.out.println();
	}
	else
		System.out.println("There are no Students");
}
	
}
