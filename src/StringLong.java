public class StringLong {
	// 9223372036854775807 -9223372036854775808
	public static void main(String args[]) {
		long result;
		String sample = "-92";
		int a = sample.charAt(sample.length() - 1);
		if (sample.substring(0, 1).matches("-") && sample.length() < 21) {
			if (sample.length() == 20 && a <= 56) {
				stringToLong(sample,-1);
			}
			 else if (sample.length() == 20 && a > 56) {
					System.out.println("Invalid String");
					
				} else if (sample.length() < 120)
					stringToLong(sample,-1);
				else
					System.out.println("Invalid String");

		} else {
			if (sample.length() == 19 && a <= 55) {
				stringToLong(sample,1);

			} else if (sample.length() == 19 && a > 55) {
				System.out.println("Invalid String");
				

			} else if (sample.length() < 19)
				stringToLong(sample,1);
			else
				System.out.println("Invalid String");

		}
	}

	public static void stringToLong(String sample, int a) {
		long result = 0;
		int count = 0;

		for (int i = 0; i < sample.length(); i++) {
			if (sample.charAt(i) >= 48 && sample.charAt(i) <= 57) {
				result = result * 10 + (sample.charAt(i) - 48);
				count++;
			}

		}
		if (Long.MIN_VALUE <= result && result <= Long.MAX_VALUE) {
			System.out.print(a*result+"  String->Long");
		}
		else {
			System.out.println("Invalid input");
		}

	}
}
