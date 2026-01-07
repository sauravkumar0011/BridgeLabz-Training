package com.fittrack;

public class FitTrackAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 UserProfile user = new UserProfile("Saurav", 22, 70, 2500);

	        Workout w1 = new CardioWorkout(30);
	        w1.startWorkout();
	        w1.calculateCalories();
	        w1.stopWorkout();

	        int progress = user.getDailyTarget() - w1.getCaloriesBurned();
	        System.out.println("Calories Burned: " + w1.getCaloriesBurned());
	        System.out.println("Remaining Target: " + progress);

	}

}
