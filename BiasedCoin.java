import java.util.Random;

public class BiasedCoin {
	
	private double bias;
	private double face = 0;

	public BiasedCoin() {
		bias = 0.5;
	}
	
	public BiasedCoin(double bias){
		this.bias = bias;
	}

	// -----------------------------------------------
	// Flips the coin by randomly choosing a face.
	// -----------------------------------------------
	public void flip() {
		face = new Random().nextDouble();
	}

	// -----------------------------------------------------
	// Returns the current face of the coin as an integer.
	// -----------------------------------------------------
	public double getFace() {
		return face;
	}
	
	public double getBias(){
		return this.bias;
	}

	// ----------------------------------------------------
	// Returns the current face of the coin as a string.
	// ----------------------------------------------------
	public String toString() {
		String faceName;

		if (face < bias) {
			faceName = "Heads";
		}else faceName = "Tails";
		
		return faceName;
	}
}
