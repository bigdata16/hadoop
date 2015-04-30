package tutorial_java_program;

import java.util.Scanner;

public class Count_vowel {

	public static void main(String args[]) {
		System.out.println("--------------");

		String name;
		String vowel = "aeiou";
		int v_c = 0;
		int c_c = 0;
		int c_c1 = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the name");
		name = input.nextLine();
		System.out.print(name.length());
		for (int i = 0; i < name.length(); i++) {
			for (int j = 0; j < vowel.length(); j++) {

				if (name.charAt(i) == vowel.charAt(j)) {
					v_c += 1;
					c_c1 = 0;
					break;
				} else {
					c_c1 = 1;
				}

			}

			if (c_c1 == 1) {
				c_c += c_c1;
			}
		}

		System.out.println("Total vowel = " + v_c);
		System.out.println("Total consonant = " + c_c);
	}

}
