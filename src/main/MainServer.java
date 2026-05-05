package main;

import java.io.*;
import java.net.*;
import model.Player;
import model.Question;
import util.QuizManager;

public class MainServer {

    public static void main(String[] args) throws Exception {

        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server started...");

        // 🔹 Accept 2 players
        Socket s1 = server.accept();
        System.out.println("Player 1 connected");

        Socket s2 = server.accept();
        System.out.println("Player 2 connected");

        // 🔹 Setup streams
        BufferedReader in1 = new BufferedReader(new InputStreamReader(s1.getInputStream()));
        PrintWriter out1 = new PrintWriter(s1.getOutputStream(), true);

        BufferedReader in2 = new BufferedReader(new InputStreamReader(s2.getInputStream()));
        PrintWriter out2 = new PrintWriter(s2.getOutputStream(), true);

        // 🔹 Get names
        out1.println("Enter your name:");
        String name1 = in1.readLine();
        Player p1 = new Player(name1);

        out2.println("Enter your name:");
        String name2 = in2.readLine();
        Player p2 = new Player(name2);

        out1.println("Welcome " + p1.getName());
        out2.println("Welcome " + p2.getName());

        QuizManager quiz = new QuizManager();

        // 🔥 GAME LOOP
       int count = 0;

for (Question q : quiz.getQuestions()) {
    if (count == 10) break;

    out1.println(q.getQuestion());
    out2.println(q.getQuestion());

    String ans1 = in1.readLine();
    String ans2 = in2.readLine();

    // Player 1
    if (ans1 != null && q.checkAnswer(ans1)) {
        p1.addScore(1);
        out1.println("Correct! Score: " + p1.getScore());
    } else {
        out1.println("Wrong! Score: " + p1.getScore());
    }

    // Player 2
    if (ans2 != null && q.checkAnswer(ans2)) {
        p2.addScore(1);
        out2.println("Correct! Score: " + p2.getScore());
    } else {
        out2.println("Wrong! Score: " + p2.getScore());
    }

    count++;  // 🔥 important
}
        // 🔥 WINNER
        String winner;
        if (p1.getScore() > p2.getScore()) {
            winner = p1.getName();
        } else if (p2.getScore() > p1.getScore()) {
            winner = p2.getName();
        } else {
            winner = "It's a tie!";
        }

        out1.println("Game Over");
        out2.println("Game Over");

        out1.println("Winner: " + winner);
        out2.println("Winner: " + winner);

        s1.close();
        s2.close();
        server.close();
    }
}