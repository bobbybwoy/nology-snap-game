package uk.co.rdl;

public class Player {
    private String playerName;

    public Player() {
        this.playerName = "Unknown Player";
    }

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
