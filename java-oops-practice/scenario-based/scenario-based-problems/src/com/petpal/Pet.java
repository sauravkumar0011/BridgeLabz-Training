package com.petpal;

public class Pet {

		private String name;
		private String type;
		private int age;
		
		public Pet(String name, String type, int age)
		{
			this.name = name;
			this.type = type;
			this.age = age;
		}
		
		public void setMoodStatus(String moodStatus)
		{
		}
		
		public String getMoodStatus()
		{
		   return "";
		}
		
	    public String getName()
	    {
	    	return name;
	    } 
	    
	    public void makeSound()
	    {
	    	System.out.println("Pet makes diffrent sounds");
	    }
}
