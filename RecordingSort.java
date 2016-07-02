import java.util.Scanner;
public class RecordingSort {

	public static void main(String[] args) {
		Recording[] records = new Recording[5];
		Recording tempRecord;
		Scanner inputData = new Scanner(System.in);
		String userInput = "";
		char userSelect;
		int choice = -1;
		
		System.out.println("Do you want to input album information (Y/N)(E.g. N to use information in program)");
		userInput = inputData.nextLine();
		userSelect = userInput.charAt(0);
		
		if(userSelect == 'Y')
			inputFromUser(records);
		else
			defineRecords(records);
		
		while(choice < 0 || choice > 2){
		System.out.println("Which would you like to sort by 0: artist, 1: title, 2: song length");
		choice = inputData.nextInt();
		inputData.nextLine();
		if(choice < 0 || choice > 2)
			System.out.println("Please enter a number between 0 and 2");
		}
		
		for(int num=0; num<records.length-1; num++)
		{
			for(int i=0; i<records.length-1; i++)
			{
				if(choice == 0)
				{
					if(records[i].getArtist().compareTo(records[i+1].getArtist()) > 0)
					{
						tempRecord = records[i];
						records[i] = records[i+1];
						records[i+1] = tempRecord;
					}
				}
				else if(choice == 1)
				{
					if(records[i].getTitle().compareTo(records[i+1].getTitle()) > 0)
					{
						tempRecord = records[i];
						records[i] = records[i+1];
						records[i+1] = tempRecord;
					}
				}
				else
					if(records[i].getPlayingTime() > records[i+1].getPlayingTime())
					{
						tempRecord = records[i];
						records[i] = records[i+1];
						records[i+1] = tempRecord;
					}
			}
		}
		for(int i=0; i<records.length; i++)
			records[i].display();
	}//	End of main method
	
public static void inputFromUser(Recording[] recs)
{
	String tempString;
	String tempString2;
	int tempInt;
	Scanner input = new Scanner(System.in);
	
	for(int i=0; i<5; i++)
	{
		System.out.println("Please enter the artist of the No. " + i + " album");
		tempString = input.nextLine();
		System.out.println("Please enter the title of the No. " + i + " album");
		tempString2 = input.nextLine();
		System.out.println("Please enter the amount of time in seconds of the No. " + i + " album");
		tempInt = input.nextInt();
		input.nextLine();
		recs[i]= new Recording(tempString, tempString2, tempInt);
	}
}//	end of inputFromUser method

public static void defineRecords(Recording[] recs)
{
	recs[0] = new Recording("Taylor Swift", "You Belong With Me", 232);
	recs[1] = new Recording("Survivor", "Eye of the Tiger", 244);
	recs[2] = new Recording("Faith Hill", "This Kiss", 193);
	recs[3] = new Recording("Katy Perry", "Roar", 222);
	recs[4] = new Recording("Sara Bareilles", "Brave", 238);
}
}
