package com.examproctor;

import java.util.HashMap;
import java.util.Stack;

public class ExamSession {

    private Stack<Integer> navigationStack;
    private HashMap<Integer, String> answerMap;
    private HashMap<Integer, String> correctMap;

    public ExamSession() {
        navigationStack = new Stack<>();
        answerMap = new HashMap<>();
        correctMap = new HashMap<>();
    }

    public void addQuestion(Question q) {
        correctMap.put(q.id, q.correctAnswer);
    }

    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    public void submitAnswer(int questionId, String answer) {
        answerMap.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }

    public void goBack() {
        if (navigationStack.isEmpty()) {
            System.out.println("No previous question");
            return;
        }
        int q = navigationStack.pop();
        System.out.println("Back from Question: " + q);
    }

    public int evaluateScore() {
        int score = 0;
        for (int qId : correctMap.keySet()) {
            if (answerMap.containsKey(qId)) {
                if (answerMap.get(qId).equals(correctMap.get(qId))) {
                    score++;
                }
            }
        }
        return score;
    }
}
