public class Team {
    private String name;
    private int wins, losses, gamesPlayed;

    public Team(String name) {
        this.name = name;
        this.wins = 0;
        this.losses = 0;
        this.gamesPlayed = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getWins() {
        return this.wins;
    }

    public int getLosses() {
        return this.losses;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void play(int points, int advPoints) {
        this.gamesPlayed ++;
        int result = points - advPoints;
        if(result > 0) {
            this.win();
            return;
        }
        if(result < 0) {
        this.lose();
        }
    }

    public void win() {
        this.wins ++;
    }

    public void lose() {
        this.losses ++;
    }
}
