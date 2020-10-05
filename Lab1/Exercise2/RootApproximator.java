package Exercise2;
import Exercise2.Numeric; 
/**
Computes approximations to the square root of
a number, using Heron's algorithm
*/
public class RootApproximator
{
	/**
	Constructs a root approximator for a given number
	aNumber the number from which to extract the square root
	(Precondition: aNumber >= 0)
	 */
	public RootApproximator(double aNumber)
	{
		a = aNumber;
		xold = 1;
		xnew = a;
	}
	/**
	Compute a better guess from the current guess.
	returns the next guess
	 */
	public static double nextGuess()
	{
		xold = xnew;
		if (xold != 0)
		{
			xnew = (xold + a / xold) / 2;
		}
		return xnew;
	}
	/**
	Compute the root by repeatedly improving the current
	guess until two successive guesses are approximately equal.
	@return the computed value for the square root
	 */
	public static double getRoot()
	{
		while (!Numeric.approxEqual(xnew, xold))
		{
			nextGuess();
		}
		return xnew;
	}
	private static double a; // the number whose square root is computed
	private static double xnew; // the current guess
	private static double xold; // the old guess
	
	public static void main(String[] args) {
		System.out.println(RootApproximator.getRoot());
		
	}
}
