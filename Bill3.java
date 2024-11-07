// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// defines 3 names
	    String n1 = args[0];
		String n2 = args[1];
		String n3 = args[2];
		double bill = Double.parseDouble(args[3]);
		double split = Math.ceil(bill/3);
		System.out.println("Dear "+ n3+ ", "+ n2+ ", "+ "and " + n1 + ": "+ "pay "+ split + " Shekels each ");

	       
	}
}
