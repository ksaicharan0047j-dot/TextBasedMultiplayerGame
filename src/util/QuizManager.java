package util;

import java.util.*;
import model.Question;

public class QuizManager {
    private List<Question> questions = new ArrayList<>();

    public QuizManager() {
        questions.add(new Question("Capital of India?", "Delhi"));
        questions.add(new Question("2 + 2?", "4"));
        questions.add(new Question("Java is language or OS?", "language"));
        questions.add(new Question("Sun rises in east or west?", "east"));
        questions.add(new Question("5 * 3?", "15"));
        questions.add(new Question("Capital of USA?", "Washington"));
        questions.add(new Question("Capital of UK?", "London"));
        questions.add(new Question("Capital of Japan?", "Tokyo"));
        questions.add(new Question("5 + 7?", "12"));
        questions.add(new Question("10 - 3?", "7"));
        questions.add(new Question("9 * 2?", "18"));
        questions.add(new Question("Square root of 16?", "4"));
        questions.add(new Question("Sun rises in east or west?", "east"));
        questions.add(new Question("Water formula?", "H2O"));
        questions.add(new Question("Opposite of hot?", "cold"));
        questions.add(new Question("Largest planet?", "Jupiter"));
        questions.add(new Question("Fastest land animal?", "Cheetah"));
        questions.add(new Question("How many days in a week?", "7"));
        questions.add(new Question("How many continents?", "7"));
        questions.add(new Question("HTML stands for?", "HyperText Markup Language"));
        questions.add(new Question("CPU stands for?", "Central Processing Unit"));
        questions.add(new Question("1 byte = ? bits", "8"));
        questions.add(new Question("Binary of 2?", "10"));
        questions.add(new Question("Who invented Java?", "James Gosling"));
        questions.add(new Question("Which OS is Android based on?", "Linux"));
        questions.add(new Question("Capital of Germany?", "Berlin"));
        questions.add(new Question("Capital of France?", "Paris"));
        questions.add(new Question("Capital of Italy?", "Rome"));
        questions.add(new Question("Capital of Canada?", "Ottawa"));
        questions.add(new Question("Capital of China?", "Beijing"));

        questions.add(new Question("7 + 8?", "15"));
        questions.add(new Question("12 * 2?", "24"));
        questions.add(new Question("100 / 10?", "10"));
        questions.add(new Question("15 - 5?", "10"));
        questions.add(new Question("6 * 6?", "36"));

        questions.add(new Question("Largest ocean?", "Pacific"));
        questions.add(new Question("Smallest continent?", "Australia"));
        questions.add(new Question("Longest river?", "Nile"));
        questions.add(new Question("Tallest mountain?", "Everest"));
        questions.add(new Question("Hottest planet?", "Venus"));

        questions.add(new Question("Opposite of fast?", "slow"));
        questions.add(new Question("Opposite of day?", "night"));
        questions.add(new Question("Color of sky?", "blue"));
        questions.add(new Question("Color of grass?", "green"));
        questions.add(new Question("Color of coal?", "black"));

        questions.add(new Question("How many hours in a day?", "24"));
        questions.add(new Question("How many minutes in an hour?", "60"));
        questions.add(new Question("How many seconds in a minute?", "60"));
        questions.add(new Question("Leap year has how many days?", "366"));
        questions.add(new Question("How many months in a year?", "12"));

        questions.add(new Question("Who discovered gravity?", "Newton"));
        questions.add(new Question("Who is known as father of computers?", "Charles Babbage"));
        questions.add(new Question("Which language is used for web pages?", "HTML"));
        questions.add(new Question("Which device is used to type?", "Keyboard"));
        questions.add(new Question("Which device shows output?", "Monitor"));
    }

    public List<Question> getQuestions() {
        Collections.shuffle(questions); // 🔥 random order
        return questions;
    }
}