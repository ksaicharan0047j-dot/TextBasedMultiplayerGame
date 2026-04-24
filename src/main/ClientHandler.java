package main;

import java.io.*;
import java.net.*;
import model.Player;

public class ClientHandler extends Thread {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private Player player;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            // Ask name
            out.println("Enter your name:");
            String name = in.readLine();

            player = new Player(name);

            out.println("Welcome " + player.getName() + "! Waiting for other player...");

        } catch (Exception e) {
            System.out.println("Client disconnected.");
        }
    }

    // 🔹 Send message to client
    public void sendMessage(String msg) {
        out.println(msg);
    }

    // 🔹 Get answer from client
    public String getAnswer() throws IOException {
        return in.readLine();
    }

    public Player getPlayer() {
        return player;
    }
}