package com.fittrack;

public class CardioWorkout  extends Workout{

	public CardioWorkout(int duration) {
        super(duration);
    }

    public void calculateCalories() {
        caloriesBurned = duration * 8;
    }
}

