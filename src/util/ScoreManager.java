package util;

import model.Player;
import java.util.*;

public class ScoreManager {
    private List<Player> players = new ArrayList<>();

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void showScores() {
        for (Player p : players) {
            System.out.println(p.getName() + " : " + p.getScore());
        }
    }
}