// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// defines 3 names
	    String n1 = args[0];
		String n2 = args[1];
		String n3 = args[2];
		double bill = Double.parseDouble(args[3]);
		int formated = (int)Math.ceil(bill/3);
		System.out.println("Dear "+ n1+ ", "+ n2+ ", "+ "and " + n3 + ": "+ "pay "+ formated + "Shekels each ");

	       
	}
}
