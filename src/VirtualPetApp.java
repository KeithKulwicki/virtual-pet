import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		VirtualPet agador = new VirtualPet();
		int hungerLevel;
		int thirstLevel;
		int boredLevel;
		int sleepyLevel;

		int choice = 0;
		System.out.println("HI! I'm Agador Spartacus, your virtual pet!");

		do {
			//get current status values, print user input
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
			System.out.println("6: Take Agador Spartacus back to the pet store");
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
				sleepyLevel = agador.bed();
				System.out.println("");
				System.out.println("");
				System.out.println("Nighty-night. SNOOOORE! SNOOOORE!");
				System.out.println("");
				System.out.println("");
			}

			 /* if "ignore", each attribute calls random number tick method*/
			
			else if (choice == 5) {
				System.out.println("");
				System.out.println("");
				System.out.println("HAY! Look at me! Look at me! Love me! Love me!");
				System.out.println("");
				System.out.println("");
				hungerLevel = agador.getHungerTick();
				thirstLevel = agador.getThirstTick();
				boredLevel = agador.getBoredTick();
				sleepyLevel = agador.getSleepyTick();
			}
			//If xLevel 20 or more, virtual pet begs
			if (hungerLevel >= 20) {
				System.out.println("Agador Spartacus is starving.");
				System.out.println("");
				System.out.println("");
			}
			if (thirstLevel >= 20) {
				System.out.println("Agador Spartacus is dehydrated.");
				System.out.println("");
				System.out.println("");
			}
			if (boredLevel >= 20) {
				System.out.println("Ho-hum. Agador Spartacus is sooooo boooooored.");
				System.out.println("");
				System.out.println("");
			}
			if (sleepyLevel >= 20) {
				System.out.println("YAAAAAAAWN! Agador Spartacus is soooooo tired");
				System.out.println("");
				System.out.println("");
			}
		} while (choice != 6);

		System.out.println("Goodbye. Adieu. Auf wiedersehen. Gesundheit.");
		System.out.println("Agador Spartacus didn't like it here anyway!");
		System.out.println("Snif. Snif. *Agador Spartacus begins inconsolable weeping*");
		scanner.close();
		System.exit(0);

	}
}