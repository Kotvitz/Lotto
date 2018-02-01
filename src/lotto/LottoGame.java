package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LottoGame {
	void _lotto() {
		Scanner s = new Scanner(System.in);
		Random rand = new Random();
		List<Integer> yourNumbers = new ArrayList<Integer>();
		List<Integer> drawnNumbers = new ArrayList<Integer>();
		List<Integer> correctNumbers = new ArrayList<Integer>();
		while (yourNumbers.size() < 6) {
			int number;
			while (true) {
				number = s.nextInt();
				if (number < 1 || number > 49)
					System.out.println("It must be a number between 1 and 49. Try again.");
				else
					break;
			}
			if (!yourNumbers.contains(number))
				yourNumbers.add(number);
		}
		
		Collections.sort(yourNumbers);
		
		System.out.print("You've chosen the following numbers: ");
		for (int i = 0; i < yourNumbers.size(); i++)
			System.out.print(yourNumbers.get(i) + " ");
		System.out.println(" ");

		while (drawnNumbers.size() < 6) {
			int number = rand.nextInt((49 - 1) + 1) + 1;
			if (!drawnNumbers.contains(number))
				drawnNumbers.add(number);
		}
		
		Collections.sort(drawnNumbers);
		
		System.out.print("Here are the drawn numbers: ");
		for (int i = 0; i < drawnNumbers.size(); i++)
			System.out.print(drawnNumbers.get(i) + " ");
		System.out.println(" ");

		for (int i = 0; i < yourNumbers.size(); i++) {
			if (drawnNumbers.contains(yourNumbers.get(i))) {
				correctNumbers.add(yourNumbers.get(i));
			}
		}

		System.out.println("Amount of correctly chosen numbers: " + correctNumbers.size());

		if (correctNumbers.size() < 3)
			System.out.println("Unfortunately, you haven't won anything :(");
		else {
			switch (correctNumbers.size()) {
			case 3:
				System.out.println("Fourth degree win - 24 PLN!");
				break;
			case 4:
				System.out.println("Third degree win - even more than 200 PLN!");
				break;
			case 5:
				System.out.println("Second degree win - several thousand PLN!");
				break;
			case 6:
				System.out.println("First degree win - even several dozen of millions PLN!");
				break;
			}
		}
	}

	void miniLotto() {
		Scanner s = new Scanner(System.in);
		Random rand = new Random();
		List<Integer> yourNumbers = new ArrayList<Integer>();
		List<Integer> drawnNumbers = new ArrayList<Integer>();
		List<Integer> correctNumbers = new ArrayList<Integer>();
		while (yourNumbers.size() < 5) {
			int number;
			while (true) {
				number = s.nextInt();
				if (number < 1 || number > 42)
					System.out.println("It must be a number between 1 and 42. Try again.");
				else
					break;
			}
			if (!yourNumbers.contains(number))
				yourNumbers.add(number);
		}
		
		Collections.sort(yourNumbers);
		
		System.out.print("You've chosen the following numbers: ");
		for (int i = 0; i < yourNumbers.size(); i++)
			System.out.print(yourNumbers.get(i) + " ");
		System.out.println(" ");

		while (drawnNumbers.size() < 5) {
			int number = rand.nextInt((42 - 1) + 1) + 1;
			if (!drawnNumbers.contains(number))
				drawnNumbers.add(number);
		}
		
		Collections.sort(drawnNumbers);
		
		System.out.print("Here are the drawn numbers: ");
		for (int i = 0; i < drawnNumbers.size(); i++)
			System.out.print(drawnNumbers.get(i) + " ");
		System.out.println(" ");

		for (int i = 0; i < yourNumbers.size(); i++) {
			if (drawnNumbers.contains(yourNumbers.get(i))) {
				correctNumbers.add(yourNumbers.get(i));
			}
		}

		System.out.println("Amount of correctly chosen numbers: " + correctNumbers.size());

		if (correctNumbers.size() < 3)
			System.out.println("Unfortunately, you haven't won anything :(");
		else {
			switch (correctNumbers.size()) {
			case 3:
				System.out.println("Third degree win - tens of PLN!");
				break;
			case 4:
				System.out.println("Second degree win - even 1000 PLN!");
				break;
			case 5:
				System.out.println("First degree win - even several hundred thousand PLN!");
				break;
			}
		}
	}

	void multiMulti() {
		Scanner s = new Scanner(System.in);
		Random rand = new Random();
		List<Integer> yourNumbers = new ArrayList<Integer>();
		List<Integer> drawnNumbers = new ArrayList<Integer>();
		List<Integer> correctNumbers = new ArrayList<Integer>();
		int n;
		while (true) {
			n = s.nextInt();
			if (n < 1 || n > 10)
				System.out.println("You've entered an incorrect amount of numbers. Try again");
			else
				break;
		}

		System.out.println("Please choose your lucky numbers:");
		while (yourNumbers.size() < n) {
			int number;
			while (true) {
				number = s.nextInt();
				if (number < 1 || number > 80)
					System.out.println("It must be a number between 1 and 80. Try again.");
				else
					break;
			}
			if (!yourNumbers.contains(number))
				yourNumbers.add(number);
		}
		
		Collections.sort(yourNumbers);

		System.out.print("You've chosen the following numbers: ");
		for (int i = 0; i < yourNumbers.size(); i++)
			System.out.print(yourNumbers.get(i) + " ");
		System.out.println(" ");

		while (drawnNumbers.size() < n) {
			int number = rand.nextInt((80 - 1) + 1) + 1;
			if (!drawnNumbers.contains(number))
				drawnNumbers.add(number);
		}
		
		Collections.sort(drawnNumbers);
		
		System.out.print("Here are the drawn numbers: ");
		for (int i = 0; i < drawnNumbers.size(); i++)
			System.out.print(drawnNumbers.get(i) + " ");
		System.out.println(" ");

		for (int i = 0; i < yourNumbers.size(); i++) {
			if (drawnNumbers.contains(yourNumbers.get(i))) {
				correctNumbers.add(yourNumbers.get(i));
			}
		}

		System.out.println("Amount of correctly chosen numbers: " + correctNumbers.size());

		switch (n) {
		case 1:
			if (correctNumbers.size() == 1)
				System.out.println("You won 4 PLN!");
			else
				System.out.println("Unfortunately, you haven't won anything :(");
			break;
		case 2:
			if (correctNumbers.size() == 2)
				System.out.println("You won 16 PLN!");
			else
				System.out.println("Unfortunately, you haven't won anything :(");
			break;
		case 3:
			if (correctNumbers.size() == 3)
				System.out.println("You won 54 PLN!");
			else if (correctNumbers.size() == 2)
				System.out.println("You won 2 PLN!");
			else
				System.out.println("Unfortunately, you haven't won anything :(");
			break;
		case 4:
			if (correctNumbers.size() == 4)
				System.out.println("You won 84 PLN!");
			else if (correctNumbers.size() == 3)
				System.out.println("You won 8 PLN!");
			else if (correctNumbers.size() == 2)
				System.out.println("You won 2 PLN!");
			else
				System.out.println("Unfortunately, you haven't won anything :(");
			break;
		case 5:
			if (correctNumbers.size() == 5)
				System.out.println("You won 700 PLN!");
			else if (correctNumbers.size() == 4)
				System.out.println("You won 20 PLN!");
			else if (correctNumbers.size() == 3)
				System.out.println("You won 4 PLN!");
			else
				System.out.println("Unfortunately, you haven't won anything :(");
			break;
		case 6:
			if (correctNumbers.size() == 6)
				System.out.println("You won 1 300 PLN!");
			else if (correctNumbers.size() == 5)
				System.out.println("You won 120 PLN!");
			else if (correctNumbers.size() == 4)
				System.out.println("You won 8 PLN!");
			else if (correctNumbers.size() == 3)
				System.out.println("You won 2 PLN!");
			else
				System.out.println("Unfortunately, you haven't won anything :(");
			break;
		case 7:
			if (correctNumbers.size() == 7)
				System.out.println("You won 6 000 PLN!");
			else if (correctNumbers.size() == 6)
				System.out.println("You won 200 PLN!");
			else if (correctNumbers.size() == 5)
				System.out.println("You won 20 PLN!");
			else if (correctNumbers.size() == 4)
				System.out.println("You won 4 PLN!");
			else if (correctNumbers.size() == 3)
				System.out.println("You won 2 PLN!");
			else
				System.out.println("Unfortunately, you haven't won anything :(");
			break;
		case 8:
			if (correctNumbers.size() == 8)
				System.out.println("You won 22 000 PLN!");
			else if (correctNumbers.size() == 7)
				System.out.println("You won 600 PLN!");
			else if (correctNumbers.size() == 6)
				System.out.println("You won 60 PLN!");
			else if (correctNumbers.size() == 5)
				System.out.println("You won 20 PLN!");
			else if (correctNumbers.size() == 4)
				System.out.println("You won 4 PLN!");
			else
				System.out.println("Unfortunately, you haven't won anything :(");
			break;
		case 9:
			if (correctNumbers.size() == 9)
				System.out.println("You won 70 000 PLN!");
			else if (correctNumbers.size() == 8)
				System.out.println("You won 2 000 PLN!");
			else if (correctNumbers.size() == 7)
				System.out.println("You won 300 PLN!");
			else if (correctNumbers.size() == 6)
				System.out.println("You won 42 PLN!");
			else if (correctNumbers.size() == 5)
				System.out.println("You won 8 PLN!");
			else if (correctNumbers.size() == 4)
				System.out.println("You won 2 PLN!");
			else
				System.out.println("Unfortunately, you haven't won anything :(");
			break;
		case 10:
			if (correctNumbers.size() == 10)
				System.out.println("You won 250 000 PLN!");
			else if (correctNumbers.size() == 9)
				System.out.println("You won 10 000 PLN!");
			else if (correctNumbers.size() == 8)
				System.out.println("You won 520 PLN!");
			else if (correctNumbers.size() == 7)
				System.out.println("You won 140 PLN!");
			else if (correctNumbers.size() == 6)
				System.out.println("You won 12 PLN!");
			else if (correctNumbers.size() == 5)
				System.out.println("You won 4 PLN!");
			else if (correctNumbers.size() == 4)
				System.out.println("You won 2 PLN!");
			else
				System.out.println("Unfortunately, you haven't won anything :(");
			break;
		}
	}

	void ekstraPensja() {
		Scanner s = new Scanner(System.in);
		Random rand = new Random();
		List<Integer> yourNumbers = new ArrayList<Integer>();
		List<Integer> yourNumbers2 = new ArrayList<Integer>();
		List<Integer> drawnNumbers = new ArrayList<Integer>();
		List<Integer> drawnNumbers2 = new ArrayList<Integer>();
		List<Integer> correctNumbers = new ArrayList<Integer>();
		List<Integer> correctNumbers2 = new ArrayList<Integer>();
		System.out.println("- First set:");
		while (yourNumbers.size() < 5) {
			int number;
			while (true) {
				number = s.nextInt();
				if (number < 1 || number > 35)
					System.out.println("It must be a number between 1 and 35. Try again.");
				else
					break;
			}
			if (!yourNumbers.contains(number))
				yourNumbers.add(number);
		}
		System.out.println("- Second set:");
		while (yourNumbers2.size() < 1) {
			int number;
			while (true) {
				number = s.nextInt();
				if (number < 1 || number > 4)
					System.out.println("It must be a number between 1 and 4. Try again.");
				else
					break;
			}
			if (!yourNumbers2.contains(number))
				yourNumbers2.add(number);
		}
		
		Collections.sort(yourNumbers);
		
		System.out.println("You've chosen the following numbers: ");
		System.out.print("First set: ");
		for (int i = 0; i < yourNumbers.size(); i++)
			System.out.print(yourNumbers.get(i) + " ");
		System.out.println(" ");
		System.out.print("Second set: ");
		for (int i = 0; i < yourNumbers2.size(); i++)
			System.out.print(yourNumbers2.get(i) + " ");
		System.out.println("\n");
		
		while (drawnNumbers.size() < 5) {
			int number = rand.nextInt((35 - 1) + 1) + 1;
			if (!drawnNumbers.contains(number))
				drawnNumbers.add(number);
		}
		while (drawnNumbers2.size() < 1) {
			int number = rand.nextInt((4 - 1) + 1) + 1;
			if (!drawnNumbers2.contains(number))
				drawnNumbers2.add(number);
		}
		
		Collections.sort(drawnNumbers);
		
		System.out.println("Here are the drawn numbers: ");
		System.out.print("First set: ");
		for (int i = 0; i < drawnNumbers.size(); i++)
			System.out.print(drawnNumbers.get(i) + " ");
		System.out.println(" ");
		System.out.print("Second set: ");
		for (int i = 0; i < drawnNumbers2.size(); i++)
			System.out.print(drawnNumbers2.get(i) + " ");
		System.out.println(" ");
		
		for (int i = 0; i < yourNumbers.size(); i++) {
			if (drawnNumbers.contains(yourNumbers.get(i))) {
				correctNumbers.add(yourNumbers.get(i));
			}
		}
		
		for (int i = 0; i < yourNumbers2.size(); i++) {
			if (drawnNumbers2.contains(yourNumbers2.get(i))) {
				correctNumbers2.add(yourNumbers2.get(i));
			}
		}
		
		System.out.println("Amount of correctly chosen numbers in first set: " + correctNumbers.size());
		System.out.println("Amount of correctly chosen numbers in second set: " + correctNumbers2.size());
		
		if (correctNumbers.size() == 5 && correctNumbers2.size() == 1)
			System.out.println("CONGRATULATIONS! You won 5 000 PLN! You'll receive them every month for 20 years!");
		else if (correctNumbers.size() == 5 && correctNumbers2.size() == 0)
			System.out.println("You won 25 000 PLN!");
		else if (correctNumbers.size() == 4 && correctNumbers2.size() == 1)
			System.out.println("You won 1 000 PLN!");
		else if (correctNumbers.size() == 4 && correctNumbers2.size() == 0)
			System.out.println("You won 200 PLN!");
		else if (correctNumbers.size() == 3 && correctNumbers2.size() == 1)
			System.out.println("You won 80 PLN!");
		else if (correctNumbers.size() == 3 && correctNumbers2.size() == 0)
			System.out.println("You won 25 PLN!");
		else if (correctNumbers.size() == 2 && correctNumbers2.size() == 1)
			System.out.println("You won 10 PLN!");
		else if (correctNumbers.size() == 2 && correctNumbers2.size() == 0)
			System.out.println("You won 5 PLN!");
		else
			System.out.println("Unfortunately, you haven't won anything :(");
	}

	void kaskada() {
		Scanner s = new Scanner(System.in);
		Random rand = new Random();
		List<Integer> yourNumbers = new ArrayList<Integer>();
		List<Integer> yourNumbers2 = new ArrayList<Integer>();
		List<Integer> drawnNumbers = new ArrayList<Integer>();
		List<Integer> correctNumbers = new ArrayList<Integer>();
		List<Integer> correctNumbers2 = new ArrayList<Integer>();
		while (yourNumbers.size() < 12) {
			int number = rand.nextInt((24 - 1) + 1) + 1;
			if (!yourNumbers.contains(number))
				yourNumbers.add(number);
		}
		
		while (yourNumbers2.size() < 12) {
			int number = rand.nextInt((24 - 1) + 1) + 1;
			if (!yourNumbers.contains(number) && !yourNumbers2.contains(number))
				yourNumbers2.add(number);
		}
		
		Collections.sort(yourNumbers);
		Collections.sort(yourNumbers2);
		
		System.out.print("Your first set: ");
		for (int i = 0; i < yourNumbers.size(); i++)
			System.out.print(yourNumbers.get(i) + " ");
		System.out.println(" ");
		System.out.print("Your second set: ");
		for (int i = 0; i < yourNumbers2.size(); i++)
			System.out.print(yourNumbers2.get(i) + " ");
		System.out.println("\n");
		
		while (drawnNumbers.size() < 12) {
			int number = rand.nextInt((24 - 1) + 1) + 1;
			if (!drawnNumbers.contains(number))
				drawnNumbers.add(number);
		}
		
		Collections.sort(drawnNumbers);
		
		System.out.print("Here are the drawn numbers: ");
		for (int i = 0; i < drawnNumbers.size(); i++)
			System.out.print(drawnNumbers.get(i) + " ");
		System.out.println(" ");
		
		for (int i = 0; i < yourNumbers.size(); i++) {
			if (drawnNumbers.contains(yourNumbers.get(i))) {
				correctNumbers.add(yourNumbers.get(i));
			}
		}
		
		for (int i = 0; i < yourNumbers2.size(); i++) {
			if (drawnNumbers.contains(yourNumbers2.get(i))) {
				correctNumbers2.add(yourNumbers2.get(i));
			}
		}
		
		System.out.println("Amount of hit numbers in first set: " + correctNumbers.size());
		System.out.println("Amount of hit numbers in second set: " + correctNumbers2.size());
		if (correctNumbers.size() == 12 || correctNumbers2.size() == 12)
			System.out.println("You won 250 000 PLN!");
		else if (correctNumbers.size() == 11 || correctNumbers2.size() == 11)
			System.out.println("You won 1 000 PLN!");
		else if (correctNumbers.size() == 10 || correctNumbers2.size() == 10)
			System.out.println("You won 25 PLN!");
		else if (correctNumbers.size() == 9 || correctNumbers2.size() == 9)
			System.out.println("You won 8 PLN!");
		else if (correctNumbers.size() == 8 || correctNumbers2.size() == 8)
			System.out.println("You won 2 PLN!");
		else
			System.out.println("Unfortunately, you haven't won anything :(");
	}
}
