package com.fittrack;

public class StrengthWorkout extends Workout{

	public StrengthWorkout(int duration) {
        super(duration);
    }

    public void calculateCalories() {
        caloriesBurned = duration * 5;
    }
}
