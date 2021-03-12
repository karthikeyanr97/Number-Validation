import java.util.Scanner;

public class NumberValidation extends UserMainCode {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 10 digit integer numberber:");
		String number = scanner.nextLine();
		int result = validatenumberber(number);

		if (result == 1)
			System.out.println("Valid numberber format");
		else
			System.out.println("Invalid numberber format");

		scanner.close();
	}

}

class UserMainCode {

	public static int validatenumberber(String number) {

		int count = 0;
		int digits = 0;
		if (!(number.length() < 13))
			return -1;

		for (int i = 0; i < number.length(); i++) {

			if (number.charAt(i) >= '0' && number.charAt(i) <= '9' && count < 3) {
				count++;
				digits++;
			} else if (number.charAt(i) == '-') {
				if (i < 4)
					count = 0;
				else
					count = -1;
			} else
				return -1;
		}
		if (digits < 11)
			return 1;
		else
			return -1;
	}
}