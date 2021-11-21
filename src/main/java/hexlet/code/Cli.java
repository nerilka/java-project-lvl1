package hexlet.code;

import java.util.Scanner;

class Cli {
    public static void greeting() {

        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
		String userName = answer;
		System.out.println("May I have your name? " + userName);
		System.out.println("Hello, " + userName);

    }

}
