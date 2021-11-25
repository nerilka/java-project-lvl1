package hexlet.code;

import java.util.Scanner;

class Cli {
    public static void greeting() {

        Scanner scan = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String answer = scan.nextLine();
        System.out.println("Hello, " + answer + "!");

    }

}
