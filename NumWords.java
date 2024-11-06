// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int number1 = Integer.parseInt(args[0]);
		int o = number1 % 10;
		int t = ((number1 % 100)- o)/10 ;
		int h = ((number1%1000)-o -t)/100;
		if(number1 > 999){
			h = number1/100;
		}
		System.out.println( h + " hundreds, " + t + " tens, " + "and " + o + " ones.");
	}
}
