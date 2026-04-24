package model;

public class Question {
    private String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public boolean checkAnswer(String ans) {
        return ans.trim().equalsIgnoreCase(answer);
    }
}