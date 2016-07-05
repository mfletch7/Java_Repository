import java.util.Scanner;
public class NumberGuess {

	public static void main(String[] args) {
		String userInput;
		int guess = 0;
		int maxGuess = 100;
		int minGuess = 1;
		int choice;
		int count = 0;
		Scanner inputData = new Scanner(System.in);
		char answer;
		
		System.out.println("Please choose a number between 1 and 100");
		//userInput = inputData.nextLine();
		//choice = Integer.parseInt(userInput);
		
		for(int i=0; i<10; i++)
		{
			guess = (maxGuess - minGuess)/2 + minGuess;
			System.out.println("Is the number you chose " + guess + "? (Y/N)");
			userInput = inputData.nextLine();
			userInput = userInput.toUpperCase();
			answer = userInput.charAt(0);
			if(answer == 'Y')
			{
				System.out.println("Great!, thanks for playing, the number you selected was " + guess + "!!!");
				System.out.println("It took " + count + " tries to guess the number!");
				break;
			}
			else
			{
				System.out.println("Is the number you chose higher or lower (H/L) than " + guess);
				userInput = inputData.nextLine();
				userInput = userInput.toUpperCase();
				answer = userInput.charAt(0);
				if(answer == 'H')
				{
					minGuess = guess+1;
				}
				else
				{
					maxGuess = guess-1;
				}
			}
			count++;
			System.out.println(maxGuess + " " + minGuess + " Count: " + count);
		}
	}

}
