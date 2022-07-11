package pac1;

public class Reverse {

	public static void main(String[] args) {
		 String a = "FLIGHT-RADAR";
//		int a = 123456789;

		String rev = String.valueOf(a);
		String rem = "";
		char re;
		for (int i = 0; i < rev.length(); i++) {
			re = rev.charAt(i);
			rem = re + rem;
		}
		System.out.println(rem);
	}
}
