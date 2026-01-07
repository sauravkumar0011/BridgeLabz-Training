package com.fittrack;

abstract public class Workout implements ITrackable{

	protected int duration;
    protected int caloriesBurned;

    public Workout(int duration) {
        this.duration = duration;
    }

    public abstract void calculateCalories();

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    public void startWorkout() {
        System.out.println("Workout started");
    }

    public void stopWorkout() {
        System.out.println("Workout stopped");
    }
}
