import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		VirtualPet agador = new VirtualPet();

		int choice = 0;

		System.out.println("	  O.-.O	  													");
		System.out.println(" 	0( (^) ) < HI! I'm Agador Spartacus, your virtual pet! 		");
		System.out.println("	 ( ._. {0													");
		System.out.println("	  0   0														");	

		do {
			// get current status values, print user input
			agador.hungerLevel = agador.getHunger();
			agador.thirstLevel = agador.getThirst();
			agador.boredLevel = agador.getBored();
			agador.sleepyLevel = agador.getSleepy();
			System.out.println("*****************************************************************");
			System.out.println("*	Agador Spartacus's Current Status:			*");
			System.out.println("*	Hunger: " + agador.hungerLevel + "						*");
			System.out.println("*	Thirst:" + agador.thirstLevel + "						*");
			System.out.println("*	Bored:" + agador.boredLevel + "						*");
			System.out.println("*	Sleepy:" + agador.sleepyLevel + "						*");
			System.out.println("*****************************************************************");
			System.out.println(" ");
			System.out.println("*****************************************************************");
			System.out.println("* What do you want to do with Agador Spartacus?			*"); 
			System.out.println("* 1: Give Agador Spartacus some grub				*");
			System.out.println("* 2: Give Agador Spartacus a drink				*");
			System.out.println("* 3: Tickle Agador Spartacus					*");
			System.out.println("* 4: Beddy-by-boo time for Agador Spartacus			*");
			System.out.println("* 5: Ignore Agador Spartacus					*");
			System.out.println("* 6: Take Agador Spartacus back to the virtual pet store	*");
			System.out.println("*****************************************************************");
			System.out.println("Choose and press 'Enter':");

			choice = scanner.nextInt();
			// VirtualPet methods called depending on user choice
			if (choice == 1) {
				agador.feed();
				System.out.println("	 O @-@ O	  												");
				System.out.println(" 	 ( (o) ) 	< BEEEEEEEELCH! Thanks for the grub! 			");
				System.out.println("	0(  @  )0													");
				System.out.println("	  0-^-0														");	

			} else if (choice == 2) {
				agador.thirstLevel = agador.water();
				System.out.println("	 O *-* O	  												");
				System.out.println(" 	 ( (v) ) 	< AHHHHHHHHHHHHH! So refreshing! 				");
				System.out.println("	(0  v  0)													");
				System.out.println("	  0-^-0														");					
				

			} else if (choice == 3) {
				agador.boredLevel = agador.play();
				System.out.println("	 O ^-^ O	  												");
				System.out.println(" 	 ( (^) ) 	< TEE-HEE-HEE! STOP! STOP! No don't stop! 		");
				System.out.println("	{0  V  0}													");
				System.out.println("	  0---0														");		
				

			} else if (choice == 4) {
				agador.sleepyLevel = agador.rest();
				System.out.println("	 O -.- O	  												");
				System.out.println(" 	 ( (-) ) 	< Nighty-night. SNOOOORE! SNOOOORE! 		");
				System.out.println("	{0  o  0}													");
				System.out.println("	  0---0														");	
	
			}

			/* if "ignore", each attribute calls random number tick method */

			else if (choice == 5) {

				agador.hungerLevel = agador.getHungerTick();
				agador.thirstLevel = agador.getThirstTick();
				agador.boredLevel = agador.getBoredTick();
				agador.sleepyLevel = agador.getSleepyTick();
			}
			// If xLevel 20 or more, virtual pet begs
			if (agador.hungerLevel > 19) {
				System.out.println("	  ^.v.^														");
				System.out.println(" 	x( (^) )x < Agador Spartacus is weak from hunger! 			");
				System.out.println("	 (  ^  )													");
				System.out.println("	  0-^-0														");	

			}
			if (agador.thirstLevel > 19) {
				System.out.println("	  ^>v<^"													);
				System.out.println(" 	>( (^) )< < Agador Spartacus is dehydrated! 				");
				System.out.println("	 (  ^  )													");
				System.out.println("	  0   0														");	

			}
			if (agador.boredLevel > 19) {
				System.out.println("	  ^#v#^														");
				System.out.println(" 	X( (^) )X < Ho-hum. Agador Spartacus is sooooo boooooored! 	");
				System.out.println("	 (  M  )													");
				System.out.println("	  0   0														");	

			}
			if (agador.sleepyLevel > 19) {
				System.out.println("	  ^-v-^");
				System.out.println(" 	 ( (.) ) < YAAAAAAAWN! Agador Spartacus...tired. 			");
				System.out.println("	 (  O  )													");
				System.out.println("	x 0   0 x														");	

			}
		} while (choice != 6);

		System.out.println("   (()__(()		Well I'm gonna to go then!");
		System.out.println("   ( { }    )		[Agador Spartacus shuffles feet, moving slowly towards front door]");
		System.out.println("   . o o    /		And I don't need any of this.");
		System.out.println("   (_()_)__/ )		I don't need this stuff, and I don't need YOU.");    
		System.out.println("  / _,==.____ )		I don't need ANYTHING.");
		System.out.println(" (   |--|      )		Except this. [Agador Spartacus picks up an ashtray]");
		System.out.println(" (_.|__|'-.__ )_	And that's the only thing I need is THIS. I don't need this or this.");
		System.out.println(" ( {        {     ) 	Just this ashtray...");
		System.out.println("  {  {      (      }		And this paddle game.");
		System.out.println("   )  '._____)    /  	The ashtray and the paddle game and that's all I need...");  
		System.out.println("(((____.--(((____/		And this remote control.");

		System.out.println("The ashtray, the paddle game, and the remote control, and that's all I need...");
		System.out.println("	And these matches. ");
		System.out.println("The ashtray, and these matches, and the remote control, and the paddle ball...");
		System.out.println("	And this lamp. ");
		System.out.println("The ashtray, this paddle game, and the remote control, and the lamp, and that's all I need. ");
		System.out.println("And that's ALL I need too.");
		System.out.println("I don't need one other thing, NOT ONE...");
		System.out.println("	I need this.");
		System.out.println("The paddle game and the chair, and the remote control, and the matches for sure.");
		System.out.println("Well what are you looking at? What do you think I'm some kind of a jerk or something!");
		System.out.println("	And this. That's all I need.");
		System.out.println("[Agador Spartacus standing in front doorway]");
		System.out.println("The ashtray, the remote control, the paddle game, and this magazine, and the chair.");
		System.out.println("[Agador Spartacus outside now] And I don't need one other thing...");
		System.out.println("	Except my dog.");
		System.out.println("[dog growls at Agador Spartacus]");
		System.out.println("I don't need my dog!");

		scanner.close();
		System.exit(0);

	}
}