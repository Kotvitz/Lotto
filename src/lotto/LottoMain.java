package lotto;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Select a Lotto game");
		System.out.println("1. LOTTO\n2. MINI LOTTO\n3. MULTI MULTI\n4. EKSTRA PENSJA\n5. KASKADA");
		int choice = s.nextInt();

		switch (choice) {
		case 1:
			System.out.println("You've select LOTTO!");
			System.out.println("Please choose your lucky numbers: ");
			LottoGame._lotto();
			break;
		case 2:
			System.out.println("You've select MINI LOTTO!");
			System.out.println("Please choose your lucky numbers: ");
			LottoGame.miniLotto();
			break;
		case 3:
			System.out.println("You've chosen MULTI MULTI!");
			System.out.print("At first decide how many numbers you want to draw (from 1 to 10): ");
			LottoGame.multiMulti();
			break;
		case 4:
			System.out.println("You've chosen EKSTRA PENSJA!");
			System.out.println("Please choose your lucky numbers:");
			LottoGame.ekstraPensja();
			break;
		case 5:
			System.out.println("You've chosen KASKADA!");
			System.out.println("Here are your lucky numbers:");
			LottoGame.kaskada();
		default:
			System.out.println("There's no such game!\n");
			break;
		}

	}
}
