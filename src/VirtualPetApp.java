import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		VirtualPet agador = new VirtualPet();
		int hungerLevel;
		int thirstLevel;
		int boredLevel;
		int sleepyLevel;

		int choice = 0;
		System.out.println("HI! I'm Agador Spartacus, your virtual pet!");
		System.out.println(""); System.out.println("");
		do {
			// get current status values, print user input
			hungerLevel = agador.getHunger();
			thirstLevel = agador.getThirst();
			boredLevel = agador.getBored();
			sleepyLevel = agador.getSleepy();
			System.out.println("Agador Spartacus's Current Status:");
			System.out.println("Hunger: " + hungerLevel);
			System.out.println("Thirst:" + thirstLevel);
			System.out.println("Bored:" + boredLevel);
			System.out.println("Sleepy:" + sleepyLevel);
			System.out.println("");
			System.out.println("What do you want to do with Agador Spartacus?");
			System.out.println("1: Give Agador Spartacus some grub");
			System.out.println("2: Give Agador Spartacus a drink");
			System.out.println("3: Tickle Agador Spartacus");
			System.out.println("4: Beddy-by-boo time for Agador Spartacus");
			System.out.println("5: Ignore Agador Spartacus");
			System.out.println("6: Take Agador Spartacus back to the virtual pet store");
			System.out.println("");
			System.out.println("Choose and press 'Enter':");

			choice = scanner.nextInt();
			// VirtualPet methods called depending on user choice
			if (choice == 1) {
				agador.feed();
				System.out.println("");
				System.out.println("");
				System.out.println("BEEEEEEEELCH! Thanks for the grub!");
				System.out.println("");
				System.out.println("");
			} else if (choice == 2) {
				thirstLevel = agador.water();
				System.out.println("");
				System.out.println("");
				System.out.println("SLURP! SLURP! AHHHHH! So refreshing!");
				System.out.println("");
				System.out.println("");
			} else if (choice == 3) {
				boredLevel = agador.play();
				System.out.println("");
				System.out.println("");
				System.out.println("TEE-HEE-HEE! STOP! STOP! No don't stop!");
				System.out.println("");
				System.out.println("");
			} else if (choice == 4) {
				sleepyLevel = agador.rest();
				System.out.println("");
				System.out.println("");
				System.out.println("Nighty-night. SNOOOORE! SNOOOORE!");
				System.out.println("");
				System.out.println("");
			}

			/* if "ignore", each attribute calls random number tick method */

			else if (choice == 5) {
				System.out.println("");
				System.out.println("");
				System.out.println("HAY! Look at me. LOOK AT ME! Love me. LOVE ME!");
				System.out.println("");
				System.out.println("");
				hungerLevel = agador.getHungerTick();
				thirstLevel = agador.getThirstTick();
				boredLevel = agador.getBoredTick();
				sleepyLevel = agador.getSleepyTick();
			}
			// If xLevel 20 or more, virtual pet begs
			if (hungerLevel > 19) {
				System.out.println("Agador Spartacus is weak from hunger.");
				System.out.println("");
				System.out.println("");
			}
			if (thirstLevel > 19) {
				System.out.println("Agador Spartacus is dehydrated.");
				System.out.println("");
				System.out.println("");
			}
			if (boredLevel > 19) {
				System.out.println("Ho-hum. Agador Spartacus is sooooo boooooored.");
				System.out.println("");
				System.out.println("");
			}
			if (sleepyLevel > 19) {
				System.out.println("YAAAAAAAWN! Agador Spartacus...tired.");
				System.out.println("");
				System.out.println("");
			}
		} while (choice != 6);

		System.out.println("Well I'm gonna to go then!");
		System.out.println("And I don't need any of this.");
		System.out.println("I don't need this stuff, and I don't need YOU.");
		System.out.println("I don't need ANYTHING.");
		System.out.println("Except this. [picks up an ashtray]");
		System.out.println("And that's the only thing I need is THIS. I don't need this or this. Just this ashtray...");
		System.out.println("And this paddle game.");
		System.out.println("The ashtray and the paddle game and that's all I need...");
		System.out.println("And this remote control.");
		System.out.println("The ashtray, the paddle game, and the remote control, and that's all I need...");
		System.out.println("And these matches. ");
		System.out.println("The ashtray, and these matches, and the remote control, and the paddle ball...");
		System.out.println("And this lamp. ");
		System.out.println("The ashtray, this paddle game, and the remote control, and the lamp, ");
		System.out
				.println("and that's all I need. And that's ALL I need too. I don't need one other thing, not one...");
		System.out.println(
				"I need this. - The paddle game and the chair, and the remote control, and the matches for sure.");
		System.out.println("Well what are you looking at? What do you think I'm some kind of a jerk or something!");
		System.out.println("And this. That's all I need.");
		System.out.println("[Agador Spartacus walking outside]");
		System.out.println("The ashtray, the remote control, the paddle game, and this magazine, and the chair.");
		System.out.println("[Agador Spartacus outside now] And I don't need one other thing...");
		System.out.println("except my dog.");
		System.out.println("[dog growls at Agador Spartacus]");
		System.out.println("I don't need my dog!");

		scanner.close();
		System.exit(0);

	}
}