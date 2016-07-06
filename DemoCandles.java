import java.util.Scanner;
public class DemoCandles {

	public static void main(String[] args) {
		Candle candleOne = new Candle();
		ScentedCandle candleTwo = new ScentedCandle();
		Scanner inputData = new Scanner(System.in);
		String userInput;
		char userSelection;
		int userInt;
		
		System.out.println("Thanks for coming in today, would you like a regular (R) or scented (S) candle");
		userInput = inputData.nextLine();
		userSelection = userInput.charAt(0);
		
		if(userSelection == 'R')
		{
			System.out.println("What color of candle are you looking for?");
			userInput = inputData.nextLine();
			candleOne.setColor(userInput);
			System.out.println("What height of candle are you looking for (inches)?");
			userInput = inputData.nextLine();
			userInt = Integer.parseInt(userInput);
			candleOne.setHeight(userInt);
			
			System.out.println("Here is your " + candleOne.getColor() + " candle that is " + candleOne.getHeight() + " inches tall");
			System.out.println("The cost of this candle is $" + candleOne.getPrice() + " dollars");
		}
		else
		{
			System.out.println("What color of candle are you looking for?");
			userInput = inputData.nextLine();
			candleTwo.setColor(userInput);
			System.out.println("What height of candle are you looking for (inches)?");
			userInput = inputData.nextLine();
			userInt = Integer.parseInt(userInput);
			candleTwo.setHeight(userInt);
			System.out.println("What scent of candle are you looking for?");
			userInput = inputData.nextLine();
			candleTwo.setScent(userInput);
			
			System.out.println("Here is your " + candleTwo.getColor() + " candle that is " + candleTwo.getHeight() + " inches tall");
			System.out.println("The cost of this candle is $" + candleTwo.getPrice() + " dollars and it has a " + candleTwo.getScent() + " scent");
		}
		
	}

}
