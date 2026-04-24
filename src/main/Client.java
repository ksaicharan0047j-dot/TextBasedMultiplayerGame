package main;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("172.16.153.76", 5000);

            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            BufferedReader keyboard = new BufferedReader(
                new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String msg;

            while ((msg = in.readLine()) != null) {
                System.out.println(msg);

                // 🔹 Stop when game ends
                if (msg.equalsIgnoreCase("Game Over")) {
                    break;
                }

                // 🔹 Send input only when needed
                if (msg.contains("?") || msg.contains("Enter your name")) {
                    String input = keyboard.readLine();
                    out.println(input);
                }
            }

            socket.close();
            System.out.println("Disconnected from server.");

        } catch (Exception e) {
            System.out.println("Connection closed.");
        }
    }
}