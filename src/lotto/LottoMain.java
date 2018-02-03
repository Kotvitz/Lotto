package lotto;

import java.io.IOException;
import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LottoGame game = new LottoGame();
		int choice;
		do {
			System.out.println("Select a Lotto game");
			System.out.println("1. LOTTO\n2. MINI LOTTO\n3. MULTI MULTI\n4. EKSTRA PENSJA\n5. KASKADA");
			System.out.println("or select '0' to exit.");
			choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.println("You've select LOTTO!");
				System.out.println("Please choose your lucky numbers: ");
				game._lotto();
				System.out.println("\nPress ENTER to continue... ");
				try {
					System.in.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.println("You've select MINI LOTTO!");
				System.out.println("Please choose your lucky numbers: ");
				game.miniLotto();
				System.out.println("\nPress ENTER to continue... ");
				try {
					System.in.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				System.out.println("You've chosen MULTI MULTI!");
				System.out.print("At first decide how many numbers you want to draw (from 1 to 10): ");
				game.multiMulti();
				System.out.println("\nPress ENTER to continue... ");
				try {
					System.in.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				System.out.println("You've chosen EKSTRA PENSJA!");
				System.out.println("Please choose your lucky numbers:");
				game.ekstraPensja();
				System.out.println("\nPress ENTER to continue... ");
				try {
					System.in.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 5:
				System.out.println("You've chosen KASKADA!");
				System.out.println("Here are your lucky numbers:");
				game.kaskada();
				System.out.println("\nPress ENTER to continue... ");
				try {
					System.in.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 0:
				break;
			default:
				System.out.println("There's no such game!");
				System.out.println("\nPress ENTER to continue... ");
				try {
					System.in.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			}
		} while (choice != 0);
	}
}
