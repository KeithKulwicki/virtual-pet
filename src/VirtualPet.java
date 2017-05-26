import java.util.Random;

public class VirtualPet {
	// attributes 
	int hungerLevel = 10;
	int thirstLevel = 10;
	int boredLevel = 10;
	int sleepyLevel = 10;

	Random generator = new Random();

	public int getHunger() {return hungerLevel;}
	public int feed() {return hungerLevel = 0;}
	public int getThirst() {return thirstLevel;}
	public int water() {return thirstLevel = 0;}
	public int getBored() {return boredLevel;}
	public int play() {
		hungerLevel += 5;// play = more sleepy
		thirstLevel += 5;// play = more sleepy
		sleepyLevel += 5;// play = more sleepy
		return boredLevel = 0;
	}

	public int getSleepy() {return sleepyLevel;}
	public int bed() {return sleepyLevel = 0;}

// make time pass
	public int getHungerTick() 
	{
		int tick = generator.nextInt(5);
		hungerLevel += tick;
		return hungerLevel;
	}

	public int getThirstTick() 
	{
		int tick = generator.nextInt(5);
		thirstLevel += tick;
		return thirstLevel;
	}

	public int getBoredTick() 
	{		
		int tick = generator.nextInt(5);
		boredLevel += tick;
		return boredLevel;
	}

	public int getSleepyTick() 
	{
		int tick = generator.nextInt(5);
		sleepyLevel += tick;
		return sleepyLevel;
	}

}