public class Lab4point1B {

	public static void main(String[] args) {

		String message = "";

		final int FLIPS = 10; // number of coin flips

		final String HEADS = "Heads", TAILS = "Tails";

		int totalHeads = 0, totalTails = 0, currentHeadsInRow = 0, currentTailsInRow = 0;
		double dblBias = 0.5;

		// Set the bias
		dblBias = GetInfo.getDouble("Enter a bias between 0 and 1: ");

		// Create a FAIR coin object

		BiasedCoin coin = new BiasedCoin(); // instantaites a Fair Coin

		if (dblBias != 0.5) {
			coin = new BiasedCoin(dblBias); // instantaites the BiasedCoin
		}

		// Flip the coin FLIPS times
		for (int i = 1; i <= FLIPS; i++) {

			coin.flip();

			message += ("Coin flip #" + i + " was " + coin.toString() + "\n");

			if (coin.toString().equals(HEADS)) {
				totalHeads++;
				currentHeadsInRow++;
				currentTailsInRow=0;
			}else if(coin.toString().equals(TAILS)){
				totalTails++;
				currentTailsInRow++;
				currentHeadsInRow=0;
			}

		}
		
		message += ("\n\n\n\nHeads had a " + coin.getBias() * 100 + "% chance, and Tails had a " + (1.0-coin.getBias()) * 100 + "% chance\n");
		message += ("\nTotal times landed on heads : " + totalHeads + "\n");
		message += ("\nTotal time landed on tails : " + totalTails + "\n");
		
		if (currentHeadsInRow != 0) {
			message += ("\nThe coin landed on heads " + currentHeadsInRow + " times in a row\n");
		}else if(currentTailsInRow != 0){
			message += ("The coin landed on tails " + currentTailsInRow + " times in a row");
		}
		
		GetInfo.showMessage(message);

	}
}
