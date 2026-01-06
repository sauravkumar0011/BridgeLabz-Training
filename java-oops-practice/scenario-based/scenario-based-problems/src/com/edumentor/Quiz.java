package com.edumentor;

public class Quiz {

	private String difficulty;
	private String[] questions;
	private final String[] answers;
	private double score;
	private double scorePerQuestion;
	 
	public Quiz(String difficulty,String[] questions, String[] answers, double scorePerQuestion)
	{
		this.difficulty  = difficulty;
		this.questions = questions;
		this.answers = answers;
		this.scorePerQuestion = scorePerQuestion;
	}
	
	public double generatePercentage(double correctQuestions)
	{
		double totalMarks = questions.length * scorePerQuestion;
		score = correctQuestions * scorePerQuestion;
		return (score/totalMarks) * 100;
	}
}
