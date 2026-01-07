package com.petpal;

public class Cat extends Pet implements IInteractable{

	private double energy;
	private double hunger;
	private String moodStatus;
	
	public Cat(String name, int age)
	{
		super(name, "Cat", age);
		this.energy = 100;
		this.hunger = 0.0;
	}
	
	public void setMoodStatus(String moodStatus)
	{
		this.moodStatus = moodStatus;
	}
	
	public String getMoodStatus()
	{
		return moodStatus;
	}
	
	@Override
	public void makeSound()
    {
    	System.out.println( getName() + " makes meow sounds");
    }
	
	@Override
	public void feed() {
		System.out.println("Your Cat is eating");
		if(energy>=0)
		energy+=10;
		if(hunger>=20)
		hunger-=20;
		if(hunger > 50)
			System.out.println("Your Cat is hungry");
		else
			System.out.println("Your Cat is not hungry");
	}
	
	@Override
	public void play() {
		System.out.println("Your Cat is Playing");
		if(energy>=10 && energy<=100)
			energy-=10;
	    if(hunger>=0.0 && hunger<=100) 
			hunger+=10;		
	}
	
	@Override
	public void sleep() {
		System.out.println("Your Cat is sleeping");
		if(energy>=10 && energy<=100)
			energy+=10;
	    if(hunger>0.0 && hunger<=100) 
			hunger+=10;	
	}
}
