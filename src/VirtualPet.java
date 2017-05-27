import java.util.Random;

public class VirtualPet {
	// attributes 
	int hungerLevel = 10;
	int thirstLevel = 10;
	int boredLevel = 10;
	int sleepyLevel = 10;

	Random generator = new Random();

	int getHunger() {return hungerLevel;}
	int feed() {return hungerLevel = 0;}
	int getThirst() {return thirstLevel;}
	int water() {return thirstLevel = 0;}
	int getBored() {return boredLevel;}
	int play() {
		hungerLevel += 5;// play = more hungey
		thirstLevel += 5;// play = more thirsty
		sleepyLevel += 5;// play = more sleepy
		return boredLevel = 0;
	}

	int getSleepy() {return sleepyLevel;}
	int bed() {return sleepyLevel = 0;}

// Tick/make time pass
	int getHungerTick() 
	{
		int tick = generator.nextInt(5);
		hungerLevel += tick;
		return hungerLevel;
	}

	int getThirstTick() 
	{
		int tick = generator.nextInt(5);
		thirstLevel += tick;
		return thirstLevel;
	}

	int getBoredTick() 
	{		
		int tick = generator.nextInt(5);
		boredLevel += tick;
		return boredLevel;
	}

	int getSleepyTick() 
	{
		int tick = generator.nextInt(5);
		sleepyLevel += tick;
		return sleepyLevel;
	}

}