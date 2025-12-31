/*
Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/

import java.util.*;

public class QuizApplication{
	
	public static int ScoreRecorder(char[] userAnswer){
		int score =0;
		
	     for(int i=0; i<userAnswer.length; i++)
		 {
			 switch(i)
			 {
                case 0:
                    if (userAnswer[i] == 'B')
                        score++;
                    break;

                case 1:
                    if (userAnswer[i] == 'C')
                        score++;
                    break;

                case 2:
                    if (userAnswer[i] == 'C')
                        score++;
                    break;

                case 3:
                    if (userAnswer[i] == 'C')
                        score++;
                    break;

                case 4:
                    if (userAnswer[i] == 'C')
                        score++;
                    break;
			 }
		 }
          return score;		 
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char[] userAnswer = new char[5];
		System.out.println("\n1. What is the main difference between == and .equals() in Java?\n    A. == compares values, .equals() compares references\n    B. == compares references, .equals() compares values\n    C. Both do the same\n    D. .equals() works only for strings");
		System.out.print("Enter your answer: ");
		userAnswer[0] = sc.next().charAt(0);
		if(userAnswer[0]=='B')
			System.out.println("Correct Answer +1");
		else
			System.out.println("Correct Answer is B");
		
        System.out.println("\n2. Java is platform independent because:\n    A. Java code is interpreted\n    B. Java uses pointers\n    C. Java code is compiled into bytecode executed by JVM\n    D. Java has no compiler");
		System.out.print("Enter your answer: ");
		userAnswer[1] = sc.next().charAt(0);
		if(userAnswer[1]=='C')
			System.out.println("Correct Answer +1");
		else
			System.out.println("Correct Answer is C");
		
		System.out.println("\n3. Which of the following is NOT an OOP concept?\n    A. Inheritance\n    B. Polymorphism\n    C. Compilation\n    D. Encapsulation");
		System.out.print("Enter your answer: ");
		userAnswer[2] = sc.next().charAt(0);
		if(userAnswer[2]=='C')
			System.out.println("Correct Answer +1");
		else
			System.out.println("Correct Answer is C");
		
	    System.out.println("\n4. Difference between Array and ArrayList?\n    A. Array size is dynamic\n    B. ArrayList size is fixed\n    C. Array can store both primitives and objects\n    D. ArrayList can store primitive data types");
		System.out.print("Enter your answer: ");
		userAnswer[3] = sc.next().charAt(0);
		if(userAnswer[3]=='C')
			System.out.println("Correct Answer +1");
		else
			System.out.println("Correct Answer is C");
		
		System.out.println("\n5. Which keyword is used to handle exceptions?\n    A. throws\n    B. throw\n    C. catch\n    D. final");
		System.out.print("Enter your answer: ");
		userAnswer[4] = sc.next().charAt(0);
		if(userAnswer[4]=='C')
			System.out.println("Correct Answer +1");
		else
			System.out.println("Correct Answer is C");
		
		int score  = ScoreRecorder(userAnswer);
		
		System.out.println("\t-----------------");
		System.out.println("\tYour Score: " + score + " / 5");
		System.out.println("\t-----------------");
		
		sc.close();
    }
}