import java.util.Scanner;
import java.util.Random;
public class NumberGuess2 {

	public static void main(String[] args) {
		String userInput;
		int guess = 0;
		int maxGuess = 100;
		int minGuess = 1;
		int choice;
		int count = 0;
		Scanner inputData = new Scanner(System.in);
		char answer;
		Random rand = new Random();
		
		//Generate a random number between 1 and 100;
		int randomNum = rand.nextInt((maxGuess - minGuess) + 1) + minGuess;
		//System.out.println(randomNum);
		
		System.out.println("I have selected a number between 1 and 100, can you guess what it is?");
		userInput = inputData.nextLine();
		guess = Integer.parseInt(userInput);
		
		for(int i=1; i<=10; i++)
		{
			count++;
			
			if(guess == randomNum)
			{
				System.out.print("You guessed right, congratulations!");
				System.out.print("It took you " + count + " tries to guess the correct number");
				break;
			}
			else if(guess > randomNum)
			{
				System.out.println("That is not the number that I selected, please guess again.");
				System.out.println("The number that I selected is Lower.");
				userInput = inputData.nextLine();
				guess = Integer.parseInt(userInput);
			}
			else
			{
				System.out.println("That is not the number that I selected, please guess again.");
				System.out.println("The number that I selected is Higher.");
				userInput = inputData.nextLine();
				guess = Integer.parseInt(userInput);
			}
		}
	}

}
